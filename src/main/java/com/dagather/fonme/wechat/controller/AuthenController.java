package com.dagather.fonme.wechat.controller;

import com.dagather.fonme.config.Configuration;
import com.dagather.fonme.wechat.model.WxAuth;
import com.dagather.fonme.wechat.model.WxHandle;
import com.dagather.fonme.wechat.model.WxUser;
import com.dagather.fonme.wechat.pojo.Oauth2Token;
import com.dagather.fonme.wechat.service.IWechatService;
import com.dagather.fonme.wechat.service.IWxExtendService;
import java.text.MessageFormat;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({ "/oauth" })
public class AuthenController {
	@Resource(name = "wechatServiceImpl")
	private IWechatService iWechatService = null;
	@Resource(name = "wxExtendServiceImpl")
	private IWxExtendService iWxExtendService = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping({ "/callBackMenu/{wcaid}-{state}/index" })
	public String callBackMenu(@PathVariable Long wcaid, @PathVariable String state, HttpServletRequest request,
			HttpServletResponse response) {
		WxAuth wxAuth = this.iWechatService.selectWxAuthObject(wcaid, Configuration.FLAG_ENABLE);
		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid={0}&redirect_uri=http://fonme.dagather.com/oauth/callback/{1}/index.do&response_type=code&scope=snsapi_base&state={2}#wechat_redirect";
		url = MessageFormat.format(url, new Object[] { wxAuth.getAppid(), wcaid, state });
		return "redirect:" + url;
	}

	@RequestMapping({ "/callback/{wcaid}/index" })
	public String callback(@PathVariable Long wcaid, @RequestParam(value = "code", required = false) String code,
			@RequestParam(value = "state", required = false) String state, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			WxHandle wxHandle = this.iWechatService.selectWxHandleObject(wcaid, state, Configuration.FLAG_ENABLE);
			String url = wxHandle.getHandleurl();
			Date date = new Date();
			WxAuth wxAuth = this.iWechatService.selectWxAuthObject(wcaid, Configuration.FLAG_ENABLE);
			Oauth2Token oauth2Token = this.iWxExtendService.sendRedirect(wxAuth, code);
			if (StringUtils.isNotBlank(ObjectUtils.toString(oauth2Token))) {
				WxUser wxUser = this.iWechatService.selectWxUserByOpenIdObject(oauth2Token.getOpenid(),
						Configuration.FLAG_ENABLE);
				if (!StringUtils.isNotBlank(ObjectUtils.toString(wxUser))) {
					wxUser = new WxUser();
					wxUser.setWcaid(wcaid);
					wxUser.setOpenid(oauth2Token.getOpenid());
					wxUser.setFlagEnable(Configuration.FLAG_ENABLE);
					wxUser.setCreateDate(date);
					wxUser.setUpdateDate(date);
					boolean bool = this.iWechatService.insertWxUserObject(wxUser);
				}
				url = MessageFormat.format(url, new Object[] { wcaid, oauth2Token.getOpenid() });
				this.logger.info("<|>callBack<|>网页授权回调方法<|>wcaid:{}/code:{}/state:{}/openId:{}<|><|>{}<|>",
						new Object[] { wcaid, code, state, wxUser.getOpenid(), url });
				return "redirect:" + url;
			}
			return null;
		} catch (Exception localException) {
		}
		return null;
	}
}
