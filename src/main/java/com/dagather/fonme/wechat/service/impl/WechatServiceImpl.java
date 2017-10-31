package com.dagather.fonme.wechat.service.impl;

import com.dagather.fonme.wechat.dao.WxAuthMapper;
import com.dagather.fonme.wechat.dao.WxHandleMapper;
import com.dagather.fonme.wechat.dao.WxUserMapper;
import com.dagather.fonme.wechat.model.WxAuth;
import com.dagather.fonme.wechat.model.WxAuthExample;
import com.dagather.fonme.wechat.model.WxAuthExample.Criteria;
import com.dagather.fonme.wechat.model.WxHandle;
import com.dagather.fonme.wechat.model.WxHandleExample;
import com.dagather.fonme.wechat.model.WxUser;
import com.dagather.fonme.wechat.model.WxUserExample;
import com.dagather.fonme.wechat.service.IWechatService;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WechatServiceImpl implements IWechatService {
	@Resource(name = "wxAuthMapper")
	private WxAuthMapper wxAuthMapper = null;
	@Resource(name = "wxUserMapper")
	private WxUserMapper wxUserMapper = null;
	@Resource(name = "wxHandleMapper")
	private WxHandleMapper wxHandleMapper = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public WxUser selectWxUserByOpenIdObject(String openid, Integer flagEnable) {
		WxUserExample wxUserExample = new WxUserExample();
		WxUserExample.Criteria c = wxUserExample.createCriteria();
		if (StringUtils.isNotBlank(openid)) {
			c.andOpenidEqualTo(openid);
			if (StringUtils.isNotBlank(ObjectUtils.toString(flagEnable))) {
				c.andFlagEnableEqualTo(flagEnable);
			}
			List<WxUser> wxUserList = this.wxUserMapper.selectByExample(wxUserExample);
			return (StringUtils.isNotBlank(ObjectUtils.toString(wxUserList))) && (wxUserList.size() > 0)
					? (WxUser) wxUserList.get(0)
					: null;
		}
		return null;
	}

	public boolean insertWxUserObject(WxUser wxUser) throws SQLException {
		int rows = this.wxUserMapper.insert(wxUser);
		return rows > 0;
	}

	public WxAuth selectWxAuthObject(Long wcaid, Integer flagEnable) {
		WxAuthExample wxAuthExample = new WxAuthExample();
		WxAuthExample.Criteria c = wxAuthExample.createCriteria();
		if (StringUtils.isNotBlank(ObjectUtils.toString(wcaid))) {
			c.andWcaidEqualTo(wcaid);
			if (StringUtils.isNotBlank(ObjectUtils.toString(flagEnable))) {
				c.andFlagEnableEqualTo(flagEnable);
			}
			List<WxAuth> wxAuthList = this.wxAuthMapper.selectByExample(wxAuthExample);
			return (StringUtils.isNotBlank(ObjectUtils.toString(wxAuthList))) && (wxAuthList.size() > 0)
					? (WxAuth) wxAuthList.get(0)
					: null;
		}
		return null;
	}

	public WxHandle selectWxHandleObject(Long wcaid, String hcode, Integer flagEnable) {
		WxHandleExample wxHandleExample = new WxHandleExample();
		WxHandleExample.Criteria c = wxHandleExample.createCriteria();
		if (StringUtils.isNotBlank(ObjectUtils.toString(wcaid))) {
			c.andWcaidEqualTo(wcaid);
			if (StringUtils.isNotBlank(ObjectUtils.toString(hcode))) {
				c.andHcodeEqualTo(hcode);
			}
			if (StringUtils.isNotBlank(ObjectUtils.toString(flagEnable))) {
				c.andFlagEnableEqualTo(flagEnable);
			}
			List<WxHandle> wxHandleList = this.wxHandleMapper.selectByExample(wxHandleExample);

			return (StringUtils.isNotBlank(ObjectUtils.toString(wxHandleList))) && (wxHandleList.size() > 0)
					? (WxHandle) wxHandleList.get(0)
					: null;
		}
		return null;
	}
}
