package com.dagather.fonme.task;

import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.pojo.CallInfoCode;
import com.dagather.fonme.dial.pojo.CallInfoListCode;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.jms.procuder.IProducer;
import com.dagather.fonme.util.DateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CalcFeeTaskJob {

    @Resource(name = "dialServiceImpl")
    private IDialService dialServiceImpl;
    @Resource(name = "userBillCallProducer")
    private IProducer userBillCallProducer = null;

    private Gson gson = new Gson();
    private Logger logger = LoggerFactory.getLogger(getClass());


    @Scheduled(cron = "0 0/1 * * * ?")
    //@Scheduled(cron = "0/10 * * * * ?")//test
    public void calcFeeJob() {
        try {
            logger.info("任务开始 >>>>>>>>> time = " + System.currentTimeMillis() / 1000);
            List<DialRecord> drList = dialServiceImpl.selectDialListUnCalculated(10);
            if (null == drList || drList.size() <= 0) {
                logger.info("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000 + " <|>无满足条件的拨号记录");
                return;
            }
            // 获取查询条件中开始时间和结束时间
            Date minCreateDate = null;
            Date maxCreateDate = null;
            boolean bolOver2Month = false;
            for (DialRecord dr : drList) {
                if (dr.getCreateDate() == null) {
                    continue;
                }
                if (maxCreateDate == null || maxCreateDate.getTime() < dr.getCreateDate().getTime()) {
                    maxCreateDate = dr.getCreateDate();
                }
                if (minCreateDate == null || minCreateDate.getTime() > dr.getCreateDate().getTime()) {
                    minCreateDate = dr.getCreateDate();
                }
            }
            if (null == minCreateDate || null == maxCreateDate) {
                logger.info("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000 + " <|>拨号记录的创建时间为空");
                return;
            }
            if (DateUtil.getYestaday000000(minCreateDate).getTime() >= DateUtil.getMonthStartDate(minCreateDate).getTime()) {
                // 开始时间，拓宽至昨天0点0分0秒
                minCreateDate = DateUtil.getYestaday000000(minCreateDate);
            } else {
                // 开始时间，拓宽至当天0点0分0秒
                minCreateDate = DateUtil.to000000(minCreateDate);
            }
            if (minCreateDate.getMonth() != maxCreateDate.getMonth()) {
                // 开始结束时间，跨月，则只取前月
                maxCreateDate = DateUtil.getMonthEndDate(minCreateDate);
                bolOver2Month = true;
            }
            // 调用接口获取话单
            Map<String, String> paramMap = new HashMap<String, String>();
            //startTime	String	可选	开始查询时间，时间格式：yyyy-MM-dd HH:mm:ss，默认为空
            //endTime	String	可选	结束查询时间，时间格式：yyyy-MM-dd HH:mm:ss，开始时间与结束时间不允许跨月查询，默认为空
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            paramMap.put("startTime", sdf.format(minCreateDate));
            paramMap.put("endTime", sdf.format(maxCreateDate));
            logger.info("任务处理中---------<|>查询话单条件<|>paramMap=" + paramMap);

            //String jsonStr = "{\"code\": 0,\"msg\": \"请求成功\",\"toalrows\": \"11\",\"allPage\": 1,\"pageId\": 1,\"data\": [{\"callid\": \"9bfe57dc3ed05c641b81a1d77efd0393\",\"appId\": \"cmbj\",\"bindUUId\": \"9bfe57dc3ed05c641b81a1d77efd0393\",\"caller\": \"15810461819\",\"callee\": \"13811298912\",\"startCallTime\": \"2017-10-31 16:45:39\",\"startRingTime\": \"2017-10-31 16:45:53\",\"calleeAcceptTime\": \"2017-10-31 16:45:53\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-31 16:46:25\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_9bfe57dc3ed05c641b81a1d77efd0393_B_15810461819_95020828_13811298912.wav\",\"Duration\": \"32\"},{\"callid\": \"f69b273668e64c1d40d5233c018b39f9\",\"appId\": \"cmbj\",\"bindUUId\": \"f69b273668e64c1d40d5233c018b39f9\",\"caller\": \"15810461819\",\"callee\": \"18311278933\",\"startCallTime\": \"2017-10-30 14:44:14\",\"startRingTime\": \"2017-10-30 14:44:22\",\"calleeAcceptTime\": \"2017-10-30 14:44:22\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-30 14:44:39\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_f69b273668e64c1d40d5233c018b39f9_B_15810461819_95020828_18311278933.wav\",\"Duration\": \"17\"},{\"callid\": \"62c0026def724549642f40ddb9de5266\",\"appId\": \"cmbj\",\"bindUUId\": \"62c0026def724549642f40ddb9de5266\",\"caller\": \"15810461819\",\"callee\": \"18311278933\",\"startCallTime\": \"2017-10-30 14:41:24\",\"startRingTime\": \"2017-10-30 14:41:31\",\"calleeAcceptTime\": \"2017-10-30 14:41:31\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-30 14:41:43\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_62c0026def724549642f40ddb9de5266_B_15810461819_95020828_18311278933.wav\",\"Duration\": \"12\"},{\"callid\": \"ca5809cbe5c0d67bb3c869a13d62127b\",\"appId\": \"cmbj\",\"bindUUId\": \"ca5809cbe5c0d67bb3c869a13d62127b\",\"caller\": \"13910335015\",\"callee\": \"18511071146\",\"startCallTime\": \"2017-10-30 11:20:47\",\"startRingTime\": \"2017-10-30 11:20:56\",\"calleeAcceptTime\": \"2017-10-30 11:20:56\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-30 11:22:40\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_ca5809cbe5c0d67bb3c869a13d62127b_B_13910335015_95020828_18511071146.wav\",\"Duration\": \"104\"},{\"callid\": \"4bbc895cc33072852f96297d12ce7818\",\"appId\": \"cmbj\",\"bindUUId\": \"4bbc895cc33072852f96297d12ce7818\",\"caller\": \"13910335015\",\"callee\": \"13920990447\",\"startCallTime\": \"2017-10-30 11:13:46\",\"startRingTime\": \"2017-10-30 11:13:59\",\"calleeAcceptTime\": \"2017-10-30 11:13:59\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-30 11:15:52\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_4bbc895cc33072852f96297d12ce7818_B_13910335015_95020828_13920990447.wav\",\"Duration\": \"113\"},{\"callid\": \"ec2e8424093dac967c6a3525f2bbc9ea\",\"appId\": \"shanghaichihan\",\"bindUUId\": \"ec2e8424093dac967c6a3525f2bbc9ea\",\"caller\": \"18811058811\",\"callee\": \"13466566317\",\"startCallTime\": \"2017-10-27 16:20:34\",\"startRingTime\": \"2017-10-27 16:20:46\",\"calleeAcceptTime\": \"2017-10-27 16:20:46\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-27 16:20:51\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/shanghaichihan_ec2e8424093dac967c6a3525f2bbc9ea_B_18811058811_95020828_13466566317.wav\",\"Duration\": \"5\"},{\"callid\": \"c9009151b68b1520680439bc56289584\",\"appId\": \"cmbj\",\"bindUUId\": \"c9009151b68b1520680439bc56289584\",\"caller\": \"15810461819\",\"callee\": \"18311278933\",\"startCallTime\": \"2017-10-27 16:09:58\",\"startRingTime\": \"2017-10-27 16:10:05\",\"calleeAcceptTime\": \"2017-10-27 16:10:05\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-27 16:10:21\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_c9009151b68b1520680439bc56289584_B_15810461819_95020828_18311278933.wav\",\"Duration\": \"16\"},{\"callid\": \"b6b1f842b2ec410b5050bb7a88f301f2\",\"appId\": \"cmbj\",\"bindUUId\": \"b6b1f842b2ec410b5050bb7a88f301f2\",\"caller\": \"15810461819\",\"callee\": \"18311278933\",\"startCallTime\": \"2017-10-27 16:07:34\",\"startRingTime\": \"2017-10-27 16:08:05\",\"calleeAcceptTime\": \"2017-10-27 16:08:05\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-27 16:08:05\",\"callEndreason\": \"CALL_REJECTED\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_b6b1f842b2ec410b5050bb7a88f301f2_B_15810461819_95020828_18311278933.wav\",\"Duration\": \"0\"},{\"callid\": \"2202724103b9ce3892afcc3172437442\",\"appId\": \"cmbj\",\"bindUUId\": \"2202724103b9ce3892afcc3172437442\",\"caller\": \"15810461819\",\"callee\": \"18311278933\",\"startCallTime\": \"2017-10-27 16:03:21\",\"startRingTime\": \"2017-10-27 16:03:27\",\"calleeAcceptTime\": \"2017-10-27 16:03:27\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-27 16:03:36\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_2202724103b9ce3892afcc3172437442_B_15810461819_95020828_18311278933.wav\",\"Duration\": \"9\"},{\"callid\": \"b745adc2d7f7830c0114ce8770d56ef7\",\"appId\": \"cmbj\",\"bindUUId\": \"b745adc2d7f7830c0114ce8770d56ef7\",\"caller\": \"15810461819\",\"callee\": \"18311278933\",\"startCallTime\": \"2017-10-27 16:00:04\",\"startRingTime\": \"2017-10-27 16:00:36\",\"calleeAcceptTime\": \"2017-10-27 16:00:36\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-27 16:00:36\",\"callEndreason\": \"NO_USER_RESPONSE\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/cmbj_b745adc2d7f7830c0114ce8770d56ef7_B_15810461819_95020828_18311278933.wav\",\"Duration\": \"0\"},{\"callid\": \"e117f1e085d5bac09de109a31f3d5e05\",\"appId\": \"shanghaichihan\",\"bindUUId\": \"e117f1e085d5bac09de109a31f3d5e05\",\"caller\": \"18811058811\",\"callee\": \"15611863266\",\"startCallTime\": \"2017-10-25 15:45:36\",\"startRingTime\": \"2017-10-25 15:45:42\",\"calleeAcceptTime\": \"2017-10-25 15:45:42\",\"calleeDisplayNum\": \"95020828\",\"endCallTime\": \"2017-10-25 15:45:54\",\"callEndreason\": \"sip ok\",\"recordfile\": \"http://sip.kyong.net:80/recordings/archive/guangzhouyuanshuji/shanghaichihan_e117f1e085d5bac09de109a31f3d5e05_B_18811058811_95020828_15611863266.wav\",\"Duration\": \"12\"}]}";
            String jsonStr = dialServiceImpl.getCallInfoListBy(paramMap);
            CallInfoListCode<CallInfoCode> callInfoListCode = gson.fromJson(jsonStr, new TypeToken<CallInfoListCode<CallInfoCode>>() {
            }.getType());
            if (callInfoListCode.getCode() != 0 || callInfoListCode.getData().size() == 0) {
                logger.info("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000 + " <|>查询话单结果失败<|>" + callInfoListCode.getMsg());
                return;
            }
            if (bolOver2Month == true) {
                List<DialRecord> tmpList = new ArrayList<>();
                for (DialRecord dr : drList) {
                    if (dr.getCreateDate() == null) {
                        continue;
                    }
                    if (dr.getCreateDate().getTime() <= maxCreateDate.getTime()) {
                        tmpList.add(dr);
                    }
                }
                drList.clear();
                drList.addAll(tmpList);
            }
            // 预处理已匹配的拨号记录，过滤未匹配的拨号记录
            this.updateDialRecordPretreatmentForCalc(drList, callInfoListCode);
            // 发送MQ消息
            userBillCallProducer.send(jsonStr);
            logger.info("任务正常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000);

            //Thread.sleep(60 * 60 * 1000);

        } catch (Exception e) {
            logger.error("任务异常结束 <<<<<<<<< time = " + System.currentTimeMillis() / 1000, e);
        }
    }

    private void updateDialRecordPretreatmentForCalc(List<DialRecord> drList, CallInfoListCode<CallInfoCode> callInfoListCode) {
        List<String> yesSessionidList = new ArrayList<>();
        List<String> noSessionidList = new ArrayList<>();
        Map<String, CallInfoCode> ciMap = new HashMap<>();
        for (CallInfoCode callInfo : callInfoListCode.getData()) {
            ciMap.put(callInfo.getBindUUId(), callInfo);
        }
        for (DialRecord dr : drList) {
            if (ciMap.containsKey(dr.getSessionid())) {
                yesSessionidList.add(dr.getSessionid());
            } else {
                noSessionidList.add(dr.getSessionid());
            }
        }
        String[] yesSessionidArr = new String[yesSessionidList.size()];
        String[] noSessionidArr = new String[noSessionidList.size()];
        yesSessionidList.toArray(yesSessionidArr);
        noSessionidList.toArray(noSessionidArr);
        dialServiceImpl.updateDialRecordPretreatmentForCalc(yesSessionidArr, noSessionidArr);
    }
}
