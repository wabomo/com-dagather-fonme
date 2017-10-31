package com.dagather.fonme.dial.service.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.dagather.fonme.dial.dao.DialRecordMapper;
import com.dagather.fonme.dial.dao.UserInfoMapper;
import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.model.UserInfoExample;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.util.HttpUtil;
import com.dagather.fonme.util.MD5Util;
import com.google.gson.Gson;
import sun.misc.BASE64Encoder;

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
}
