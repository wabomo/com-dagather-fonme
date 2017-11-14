package com.dagather.fonme.dial.service.impl;

import com.dagather.fonme.dial.dao.DialRecordMapper;
import com.dagather.fonme.dial.dao.UserInfoMapper;
import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.DialRecordExample;
import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.model.UserInfoExample;
import com.dagather.fonme.dial.pojo.RevertCode;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.util.HttpUtil;
import com.dagather.fonme.util.MD5Util;
import com.google.gson.Gson;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class DialServiceImpl implements IDialService {
	private String appId = "guangzhouyuanshuji";
	private String keycode = "q941sdgt5xw8mpz61y9sb1f70v9xg142";
	@Resource(name = "userInfoMapper")
	private UserInfoMapper userInfoMapper = null;
	@Resource(name = "dialRecordMapper")
	private DialRecordMapper dialRecordMapper = null;

	public String sendDial(String caller, String called) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dataStr = formatter.format(new Date());
		String sign = MD5Util.getMD5Encode(this.appId + this.keycode + dataStr);
		BASE64Encoder encoder = new BASE64Encoder();
		String authorization = encoder.encode((this.appId + ":" + dataStr).getBytes());
		Gson gson = new Gson();
		Map<String, String> map = new HashMap();
		map.put("sign", sign);
		map.put("authorization", authorization);
		map.put("appId", this.appId);
		map.put("caller", caller);
		map.put("callee", called);
		String josnStr = gson.toJson(map);
		String code = HttpUtil.doPostJSON("http://sip.kyong.net/api/callback/api/startcall.php", josnStr);
		return code;
	}

	public UserInfo selectUserInfoObject(String openid, Long wcaid, Integer flagEnable) {
		UserInfoExample userInfoExample = new UserInfoExample();
		UserInfoExample.Criteria c = userInfoExample.createCriteria();
		if (StringUtils.isNotBlank(openid)) {
			c.andOpenidEqualTo(openid);
			if (StringUtils.isNotBlank(ObjectUtils.toString(wcaid))) {
				c.andWcaidEqualTo(wcaid);
			}
			if (StringUtils.isNotBlank(ObjectUtils.toString(flagEnable))) {
				c.andFlagEnableEqualTo(flagEnable);
			}
			List<UserInfo> userInfoList = this.userInfoMapper.selectByExample(userInfoExample);

			return (StringUtils.isNotBlank(ObjectUtils.toString(userInfoList))) && (userInfoList.size() > 0)
					? (UserInfo) userInfoList.get(0)
					: null;
		}
		return null;
	}

	public boolean insertDialRecordObject(DialRecord dialRecord) throws SQLException {
		int rows = this.dialRecordMapper.insert(dialRecord);
		return rows > 0;
	}

    public String getCallInfoListBy(Map<String,String> paramMap){
        Gson gson = new Gson();
        if (paramMap == null || paramMap.size() == 0) {
            return gson.toJson(new RevertCode(-1, "无查询条件"));
        } else if (false == paramMap.containsKey("bindUUId") &&
                false == paramMap.containsKey("startTime") &&
                false == paramMap.containsKey("endTime") &&
                false == paramMap.containsKey("caller") &&
                false == paramMap.containsKey("callee")) {
            return gson.toJson(new RevertCode(-2, "无有效的查询条件"));
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dataStr = formatter.format(new Date());
        String sign = MD5Util.getMD5Encode(this.appId + this.keycode + dataStr);
        BASE64Encoder encoder = new BASE64Encoder();
        String authorization = encoder.encode((this.appId + ":" + dataStr).getBytes());

        Map<String, String> map = new HashMap();
        map.put("sign", sign);
        map.put("authorization", authorization);
        map.put("appId", this.appId);
        map.putAll(paramMap);
        String josnStr = gson.toJson(map);
        String rtnJsonStr = HttpUtil.doPostJSON("http://sip.kyong.net/api/callback/api/safeNum.php/getCallInfo", josnStr);
        return rtnJsonStr;
    }


	public List<DialRecord> selectDialListUnCalculated(int batchSize){
		DialRecordExample example = new DialRecordExample();
		example.createCriteria().andFlagEnableEqualTo(0);
		example.setOrderByClause("create_date asc");
		RowBounds rb = new RowBounds(0,batchSize);
		return this.dialRecordMapper.selectByExampleWithRowbounds(example, rb);
	}

	public boolean updateStatusFromWaitToIng(String... sessionidArr) {
		if (null == sessionidArr || sessionidArr.length <= 0) {
			return false;
		}
		DialRecord record = new DialRecord();
		record.setFlagEnable(100); // 0待处理、100处理中、1处理结束、-1数据异常
		record.setUpdateDate(new Date());
		DialRecordExample example = new DialRecordExample();
		DialRecordExample.Criteria cr=example.createCriteria();
		cr.andFlagEnableEqualTo(0);
		if (sessionidArr.length == 1) {
			cr.andSessionidEqualTo(sessionidArr[0]);
		} else {
			cr.andSessionidIn(Arrays.asList(sessionidArr));
		}
		int cnt = this.dialRecordMapper.updateByExampleSelective(record, example);
		return cnt > 0;
	}

	public boolean updateStatusFromIngToDone(String... sessionidArr) {
		if (null == sessionidArr || sessionidArr.length <= 0) {
			return false;
		}
		DialRecord record = new DialRecord();
		record.setFlagEnable(1); // 0待处理、100处理中、1处理结束、-1数据异常
		record.setUpdateDate(new Date());
		DialRecordExample example = new DialRecordExample();
		DialRecordExample.Criteria cr=example.createCriteria();
		cr.andFlagEnableEqualTo(100);
		if (sessionidArr.length == 1) {
			cr.andSessionidEqualTo(sessionidArr[0]);
		} else {
			cr.andSessionidIn(Arrays.asList(sessionidArr));
		}
		int cnt = this.dialRecordMapper.updateByExampleSelective(record, example);
		return cnt > 0;
	}

	public boolean updateStatusFromWaitToErr(Integer errid, String... sessionidArr) {
		if (null == sessionidArr || sessionidArr.length <= 0) {
			return false;
		}
		if (null == errid) {
			errid = -1;
		}
		DialRecord record = new DialRecord();
		record.setFlagEnable(errid); // 0待处理、100处理中、1处理结束、-1数据异常
		record.setUpdateDate(new Date());
		DialRecordExample example = new DialRecordExample();
		DialRecordExample.Criteria cr=example.createCriteria();
		cr.andFlagEnableEqualTo(0);
		if (sessionidArr.length == 1) {
			cr.andSessionidEqualTo(sessionidArr[0]);
		} else {
			cr.andSessionidIn(Arrays.asList(sessionidArr));
		}
		int cnt = this.dialRecordMapper.updateByExampleSelective(record, example);
		return cnt > 0;
	}

	public boolean updateUpdateTimeIfWait(String... sessionidArr) {
		if (null == sessionidArr || sessionidArr.length <= 0) {
			return false;
		}
		DialRecord record = new DialRecord();
		record.setUpdateDate(new Date());
		DialRecordExample example = new DialRecordExample();
		DialRecordExample.Criteria cr=example.createCriteria();
		cr.andFlagEnableEqualTo(0);
		if (sessionidArr.length == 1) {
			cr.andSessionidEqualTo(sessionidArr[0]);
		} else {
			cr.andSessionidIn(Arrays.asList(sessionidArr));
		}
		int cnt = this.dialRecordMapper.updateByExampleSelective(record, example);
		return cnt > 0;
	}

	public UserInfo selectUserInfoByPhone(String phone) {
		if (StringUtils.isBlank(phone)) {
			return null;
		}
		UserInfoExample userInfoExample = new UserInfoExample();
		UserInfoExample.Criteria c = userInfoExample.createCriteria();
		c.andPhoneEqualTo(phone);
		List<UserInfo> userList = this.userInfoMapper.selectByExample(userInfoExample);
		if (null != userList && userList.size() > 0) {
			return userList.get(0);
		}
		return null;
	}

	public void updateDialRecordPretreatmentForCalc(String[] yesSessionidArr, String[] noSessionidArr){
		this.updateStatusFromWaitToErr(-1, noSessionidArr);
		this.updateUpdateTimeIfWait(yesSessionidArr);
	}
}
