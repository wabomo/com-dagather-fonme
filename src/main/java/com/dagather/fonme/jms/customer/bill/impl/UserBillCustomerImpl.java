package com.dagather.fonme.jms.customer.bill.impl;

import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.pojo.CallInfoCode;
import com.dagather.fonme.dial.pojo.CallInfoListCode;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.exchange.model.ExCurrencyRate;
import com.dagather.fonme.exchange.service.IExchangeService;
import com.dagather.fonme.jms.customer.bill.IUserBillCustomer;
import com.dagather.fonme.util.DateUtil;
import com.dagather.fonme.wallet.model.UserWallet;
import com.dagather.fonme.wallet.service.IWalletService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;


public class UserBillCustomerImpl implements IUserBillCustomer {

    @Resource
    private IDialService dialServiceImpl;
    @Resource
    private IWalletService walletServiceImpl;
    @Resource
    private IExchangeService exchangeServiceImpl;
    private Gson gson = new Gson();
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void calcFeeForBillCall(String msg) {
        String logStr = "<|>消费[通话计费消息]";
        try {
            logger.info(logStr + "<|>开始 >>>>>>>>> time = " + System.currentTimeMillis() / 1000 + "<|>msg:" + msg);
            CallInfoListCode<CallInfoCode> callInfoListCode = gson.fromJson(msg, new TypeToken<CallInfoListCode<CallInfoCode>>() {
            }.getType());
            if (callInfoListCode.getCode() != 0 || callInfoListCode.getData().size() == 0) {
                logger.info(logStr + "<|>异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000 + " <|>话单结果提示:" + callInfoListCode.getMsg());
                return;
            }
            String logSubStr = logStr + "<|>单条话单处理";
            for (CallInfoCode callInfo : callInfoListCode.getData()) {
                try {
                    // 数据校验
                    int duration = 0; // 通话时长(单位：秒)
                    if (StringUtils.isNumeric(callInfo.getDuration())) {
                        try {
                            duration = Integer.parseInt(callInfo.getDuration());
                        } catch (Exception ee) {
                        }
                    }
                    if (duration <= 0) {
                        logger.warn(logSubStr + "<|>[" + callInfo.getCaller() + "][" + callInfo.getDuration() + "]通话时长数据异常<|>CallInfoCode:" + gson.toJson(callInfo));
                        dialServiceImpl.updateStatusFromWaitToErr(-2, callInfo.getBindUUId());
                        continue;
                    }
                    // 获取对应用户钱包记录ID
                    UserInfo userInfo = dialServiceImpl.selectUserInfoByPhone(callInfo.getCaller());
                    if (null == userInfo) {
                        logger.warn(logSubStr + "<|>[" + callInfo.getCaller() + "]对应用户记录不存在<|>CallInfoCode:" + gson.toJson(callInfo));
                        dialServiceImpl.updateStatusFromWaitToErr(-3, callInfo.getBindUUId());
                        continue;
                    }
                    UserWallet userWallet = walletServiceImpl.selectUserWalletById(userInfo.getUiid());
                    if (null == userWallet) {
                        logger.warn(logSubStr + "<|>[" + callInfo.getCaller() + "][" + userInfo.getUiid() + "]对应用户钱包记录不存在<|>CallInfoCode:" + gson.toJson(callInfo));
                        dialServiceImpl.updateStatusFromWaitToErr(-4, callInfo.getBindUUId());
                        continue;
                    }
                    // 获取对应资费表记录信息
                    BigDecimal rateCny = null;
                    BigDecimal rateCost = null;
                    Map<String, String> phoneCodeRateMap = exchangeServiceImpl.selectCacheMapPhoneCodeToRate(false);
                    String rateCnyStr = null;
                    String rateCostStr = null;
                    String calleePhone = callInfo.getCallee();
                    if (calleePhone.length() == 11 && calleePhone.startsWith("1")) { // 拨打国内手机，特殊处理
                        calleePhone = "86" + calleePhone;
                    }
                    for (String phoneCode : phoneCodeRateMap.keySet()) {
                        if (calleePhone.startsWith(phoneCode)) {
                            rateCnyStr = phoneCodeRateMap.get(phoneCode);
                            rateCostStr = phoneCodeRateMap.get("cost" + phoneCode);
                            break;
                        }
                    }
                    logger.warn(logSubStr + "<|>calleePhone===" + calleePhone + "<|>rateCnyStr===" + rateCnyStr + "<|>rateCostStr===" + rateCostStr);
                    if (StringUtils.isNotBlank(rateCnyStr)) {
                        try {
                            rateCny = new BigDecimal(rateCnyStr);
                            rateCost = new BigDecimal(rateCostStr);
                        } catch (Exception ee) {
                        }
                    }
                    if (rateCny == null) {
                        logger.warn(logSubStr + "<|>[" + callInfo.getCaller() + "][" + callInfo.getCallee() + "]对应资费表记录不存在<|>CallInfoCode:" + gson.toJson(callInfo));
                        dialServiceImpl.updateStatusFromWaitToErr(-5, callInfo.getBindUUId());
                        continue;
                    }
                    // 货币Code
                    Map<String, String> currencyIdCodeMap = exchangeServiceImpl.selectCacheMapCurrencyInfoIdToCode(false);
                    String currencyCode = currencyIdCodeMap.get(userWallet.getCurrencyType().toString());
                    String ymd = DateUtil.sdf_YYYYMMdd.format(new Date());
                    ExCurrencyRate currencyRate = exchangeServiceImpl.selectOneExCurrencyRateBy(ymd, "USD", currencyCode);
                    // 计算费用
                    BigDecimal fee = rateCny.multiply(BigDecimal.valueOf((duration + 59) / 60));
                    BigDecimal feeCost = rateCost.multiply(BigDecimal.valueOf(duration)).multiply(currencyRate.getRate());
                    // 创建钱包流水记录，并更新钱包余额
                    boolean bolUpd = walletServiceImpl.updateWalletBalanceAndAddBillCallDetails(userWallet, fee, feeCost, callInfo);
                    if (bolUpd == false) {
                        logger.warn(logSubStr + "<|>[" + callInfo.getCaller() + "][" + userWallet.getUwid() + "][" + fee.toString() + "]计算费用并更新钱包余额操作失败<|>CallInfoCode:" + gson.toJson(callInfo));
                        continue;
                    }
                } catch (Exception e) {
                    logger.error(logSubStr + "<|>出现异常：" + e.getMessage(), e);
                }
            }
            logger.info(logStr + "<|>正常结束 >>>>>>>>> time = " + System.currentTimeMillis() / 1000);
        } catch (Exception ee) {
            logger.info(logStr + "<|>异常结束 >>>>>>>>> time = " + System.currentTimeMillis() / 1000 + "<|>" + ee.getMessage(), ee);
        }
    }

}
