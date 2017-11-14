package com.dagather.fonme.wallet.service.impl;

import cn.jpush.api.report.UsersResult;
import com.dagather.fonme.config.Configuration;
import com.dagather.fonme.dial.dao.DialRecordMapper;
import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.DialRecordExample;
import com.dagather.fonme.dial.pojo.CallInfoCode;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.util.ConstData;
import com.dagather.fonme.wallet.dao.UserBillCallMapper;
import com.dagather.fonme.wallet.dao.UserWalletDetailsMapper;
import com.dagather.fonme.wallet.dao.UserWalletMapper;
import com.dagather.fonme.wallet.model.*;
import com.dagather.fonme.wallet.service.IWalletService;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Service
public class WalletServiceImpl implements IWalletService {
	@Resource
	private UserWalletMapper userWalletMapper;
	@Resource
	private UserWalletDetailsMapper userWalletDetailsMapper;
	@Resource
	private UserBillCallMapper userBillCallMapper;
	@Resource
	private IDialService dialServiceImpl;


	public UserWallet selectUserWallet(Long uiid, Integer flagEnable) {
		return selectUserWallet(uiid, Configuration.FLAG_ENABLE, flagEnable);
	}

	public UserWallet selectUserWallet(Long uiid, Integer currencyType, Integer flagEnable) {
		UserWalletExample userWalletExample = new UserWalletExample();
		UserWalletExample.Criteria c = userWalletExample.createCriteria();
		if (StringUtils.isNotBlank(ObjectUtils.toString(uiid))) {
			c.andUiidEqualTo(uiid);
			if (StringUtils.isNotBlank(ObjectUtils.toString(currencyType))) {
				c.andCurrencyTypeEqualTo(currencyType);
			}
			if (StringUtils.isNotBlank(ObjectUtils.toString(flagEnable))) {
				c.andFlagEnableEqualTo(flagEnable);
			}
			List<UserWallet> userWalletList = this.userWalletMapper.selectByExample(userWalletExample);

			return (StringUtils.isNotBlank(ObjectUtils.toString(userWalletList))) && (userWalletList.size() > 0)
					? (UserWallet) userWalletList.get(0)
					: null;
		}
		return null;
	}

	public boolean insertUserWallet(UserWallet userWallet) throws SQLException {
		int rows = this.userWalletMapper.insert(userWallet);
		return rows > 0;
	}

	public boolean modifyUserWalletByPrimaryKeySelective(UserWallet userWallet) throws SQLException {
		int rows = this.userWalletMapper.updateByPrimaryKeySelective(userWallet);
		return rows > 0;
	}

	public UserWallet selectUserWalletById(Long uiid) {
		if (null == uiid) {
			return null;
		}
		UserWalletExample example = new UserWalletExample();
		UserWalletExample.Criteria c = example.createCriteria();
		c.andUiidEqualTo(uiid);
		c.andFlagEnableEqualTo(1);
		List<UserWallet> uwList = this.userWalletMapper.selectByExample(example);
		if (null != uwList && uwList.size() > 0) {
			return uwList.get(0);
		}
		return null;
	}

	public boolean updateWalletBalanceAndAddBillCallDetails(UserWallet userWallet, BigDecimal fee, BigDecimal feeCost, CallInfoCode callInfo) throws SQLException {
		Date now = new Date();
		int cnt = 0;
		boolean bolUpdate = false;
		// 更新拨号记录状态:'待处理'至'处理中'
		bolUpdate = dialServiceImpl.updateStatusFromWaitToIng(callInfo.getBindUUId());
		if (bolUpdate ==false) {
			throw new RuntimeException("DialRecord拨号记录状态'待处理'至'处理中'更新失败");
		}
		// 添加UserBillCall记录
		UserBillCall userBillCall = new UserBillCall();
		userBillCall.setUiid(userWallet.getUiid());
		userBillCall.setUwid(userWallet.getUwid());
		userBillCall.setAmount(fee.multiply(BigDecimal.valueOf(ConstData.UNIT10000)).longValue());
		userBillCall.setAmountCost(feeCost.multiply(BigDecimal.valueOf(ConstData.UNIT10000)).longValue());
		userBillCall.setCreateDate(now);
		userBillCall.setUpdateDate(now);
		userBillCall.setFlagEnable(1);
		userBillCall.setAppId(callInfo.getAppId());
		userBillCall.setBindUuid(callInfo.getBindUUId());
		userBillCall.setCallee(callInfo.getCallee());
		userBillCall.setCalleeAcceptTime(callInfo.getCalleeAcceptTime());
		userBillCall.setCalleeDisplayNum(callInfo.getCalleeDisplayNum());
		userBillCall.setCallEndReason(callInfo.getCallEndreason());
		userBillCall.setCaller(callInfo.getCaller());
		userBillCall.setCallid(callInfo.getCallid());
		userBillCall.setCurrencyType(userWallet.getCurrencyType());
		userBillCall.setDuration(Integer.parseInt(callInfo.getDuration()));
		userBillCall.setEndCallTime(callInfo.getEndCallTime());
		userBillCall.setRecordfile(callInfo.getRecordfile());
		userBillCall.setStartCallTime(callInfo.getStartCallTime());
		userBillCall.setStartRingTime(callInfo.getStartRingTime());
		cnt = userBillCallMapper.insertSelective(userBillCall);
		if (cnt == 0) {
			throw new RuntimeException("UserBillCall记录插入失败");
		}
		UserBillCallExample example = new UserBillCallExample();
		UserBillCallExample.Criteria c = example.createCriteria();
		c.andCallidEqualTo(callInfo.getCallid());
		c.andUwidEqualTo(userWallet.getUwid());
		c.andUiidEqualTo(userWallet.getUiid());
		List<UserBillCall> billCallList = userBillCallMapper.selectByExample(example);
		if (billCallList == null || billCallList.size() <= 0) {
			throw new RuntimeException("UserBillCall记录插入后查询不到");
		}
		Long ubcid = billCallList.get(0).getUbcid();
		// 添加UserWalletDetails记录
		UserWalletDetails detail = new UserWalletDetails();
		detail.setUiid(userWallet.getUiid());
		detail.setUwid(userWallet.getUwid());
		detail.setAmount(0L - fee.multiply(BigDecimal.valueOf(ConstData.UNIT10000)).abs().longValue());
		detail.setBillId(ubcid);
		detail.setBillType(0); // 流水记录对应明细账单类型 0通话账单，1充值账单
		detail.setCurrencyType(userWallet.getCurrencyType());
		detail.setFlagEnable(1);
		detail.setCreateDate(now);
		detail.setUpdateDate(now);
		cnt = userWalletDetailsMapper.insertSelective(detail);
		if (cnt == 0) {
			throw new RuntimeException("UserWalletDetails记录插入失败");
		}
		// 更新钱包余额
		cnt = userWalletMapper.updateBalance(userWallet.getUwid(), BigDecimal.valueOf(0).subtract(fee.abs().multiply(BigDecimal.valueOf(ConstData.UNIT10000))), now);
		if (cnt == 0) {
			throw new RuntimeException("UserWallet余额更新失败");
		}
		// 更新拨号记录状态:'处理中'至'处理结束'
		bolUpdate = dialServiceImpl.updateStatusFromIngToDone(callInfo.getBindUUId());
		if (bolUpdate ==false) {
			throw new RuntimeException("DialRecord拨号记录状态'处理中'至'处理结束'更新失败");
		}
		return true;
	}

}
