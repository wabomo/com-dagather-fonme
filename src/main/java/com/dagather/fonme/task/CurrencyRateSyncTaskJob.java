package com.dagather.fonme.task;

import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.exchange.model.ExCurrencyRate;
import com.dagather.fonme.exchange.pojo.FinanceRateCode;
import com.dagather.fonme.exchange.pojo.NowapiCode;
import com.dagather.fonme.exchange.service.IExchangeService;
import com.dagather.fonme.jms.procuder.IProducer;
import com.dagather.fonme.util.DateUtil;
import com.dagather.fonme.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
public class CurrencyRateSyncTaskJob {

    @Resource
    private IExchangeService exchangeServiceImpl;

    private Gson gson = new Gson();
    private Logger logger = LoggerFactory.getLogger(getClass());


    @Scheduled(cron = "0 5 0,23 * * ?") // 每天0点5分和23点5分
    //@Scheduled(cron = "0/10 * * * * ?")//test
    public void syncCurrencyRateJob() {
        try {
            logger.info("任务开始 >>>>>>>>> time = " + System.currentTimeMillis() / 1000);
            String scur = "USD";
            String tcur = "CNY";
            String jsonStr = this.httpCurrencyRate(scur, tcur);
            NowapiCode<FinanceRateCode> nowapiCode = gson.fromJson(jsonStr, new TypeToken<NowapiCode<FinanceRateCode>>() {
            }.getType());
            if (nowapiCode == null || !"1".equals(nowapiCode.getSuccess()) || nowapiCode.getResult() == null) {
                logger.info("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000 + " <|>查询汇率结果失败<|>" + gson.toJson(nowapiCode));
                return;
            }
            ExCurrencyRate exCurrencyRate = new ExCurrencyRate();
            Date now = new Date();
            exCurrencyRate.setCreateDate(now);
            exCurrencyRate.setExFrCurrencyCode(scur);
            exCurrencyRate.setExToCurrencyCode(tcur);
            exCurrencyRate.setFlagEnable(1);
            BigDecimal rate = new BigDecimal(nowapiCode.getResult().getRate());
            exCurrencyRate.setRate(rate);
            exCurrencyRate.setReverseRate(BigDecimal.valueOf(1).divide(rate,8, BigDecimal.ROUND_HALF_UP));
            exCurrencyRate.setUpdateDate(now);
            exCurrencyRate.setYmd(DateUtil.sdf_YYYYMMdd.format(now));
            boolean bolInsert = exchangeServiceImpl.updateOrInsertExCurrencyRate(exCurrencyRate);
            // 明天
            exCurrencyRate.setYmd(DateUtil.sdf_YYYYMMdd.format(DateUtil.getTommorow000000(now)));
            exchangeServiceImpl.updateOrInsertExCurrencyRate(exCurrencyRate);
            if (bolInsert == false) {
                logger.info("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000 + " <|>插入汇率记录失败<|>" + gson.toJson(nowapiCode));
                return;
            }
            logger.info("任务正常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000);

            //Thread.sleep(60 * 60 * 1000);

        } catch (Exception e) {
            logger.error("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000, e);
        }
    }

    private String httpCurrencyRate(String scur, String tcur) {
        // 接口网址
        // http://api.k780.com
        // https://sapi.k780.com
        //
        // AppKey  29582
        // Sign    b1598feff867e6b1113471cc867b4c5e
        // 免费试用3个月（18年2月13日到期）
        // http://api.k780.com/?app=finance.rate&scur=USD&tcur=CNY&appkey=29582&sign=b1598feff867e6b1113471cc867b4c5e&format=json
        // Json返回示例
        //  1.成功
        //    {
        //        "success": "1",
        //        "result": {
        //            "status": "ALREADY",
        //            "scur": "USD", /*原币种*/
        //            "tcur": "CNY", /*目标币种*/
        //                    "ratenm": "美元/人民币",
        //                    "rate": "6.5793", /*汇率*/
        //                    "update": "2016-06-24 08:30:37" /*最后更新时间*/
        //        }
        //    }
        //
        //  2.异常
        //    {
        //    "success":"0",
        //    "msgid":"...",
        //    "msg":"..."
        //    }
        String url = "http://api.k780.com/";
        Map paramMap = new HashMap();
        paramMap.put("appkey", "29582");
        paramMap.put("sign", "b1598feff867e6b1113471cc867b4c5e");
        paramMap.put("format", "json");
        paramMap.put("app", "finance.rate");
        paramMap.put("scur", scur.toUpperCase());
        paramMap.put("tcur", tcur.toUpperCase());
        String jsonStr = null;
        try {
            jsonStr = HttpUtil.doPost(url, paramMap);
        } catch (Exception e) {
            logger.error("<|>调用第三方接口<|>查询汇率[" + scur + "-" + tcur + "]<|>出现异常：" + e.getMessage(), e);
        }
        logger.info("<|>调用第三方接口<|>查询汇率[" + scur + "-" + tcur + "]<|>jsonStr="+jsonStr);
        return jsonStr;
    }
}
