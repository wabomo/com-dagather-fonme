package com.dagather.fonme.wechat.service.impl;

import com.dagather.fonme.redis.service.IRedisService;
import com.dagather.fonme.util.HttpUtil;
import com.dagather.fonme.wechat.model.WxAuth;
import com.dagather.fonme.wechat.pojo.Oauth2Token;
import com.dagather.fonme.wechat.pojo.Token;
import com.dagather.fonme.wechat.service.IWxExtendService;
import com.google.gson.Gson;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WxExtendServiceImpl implements IWxExtendService {
	@Resource(name = "redisServiceImpl")
	private IRedisService iRedisService = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Token getWxAccessToken(WxAuth wxAuth) {
		try {
			Token token = (Token) this.iRedisService.getObjectKeyToRedis("WX_ACCESS_TOKEN" + wxAuth.getAppid(),
					Token.class);
			if (StringUtils.isNotBlank(ObjectUtils.toString(token))) {
				this.logger.info("<|>WxExtendServiceImpl<|>getWxAccessToken<|>{}/{}<|>cache<|>{}/{}<|><|>",
						new Object[] { wxAuth.getAppid(), wxAuth.getAppsecret(), token.getAccessToken(),
								Long.valueOf(token.getExpires()) });
				return token;
			}
			String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={0}&secret={1}";
			url = MessageFormat.format(url, new Object[] { wxAuth.getAppid(), wxAuth.getAppsecret() });
			String code = HttpUtil.doGet(url);
			Gson gson = new Gson();
			token = (Token) gson.fromJson(code, Token.class);
			if (StringUtils.isNotBlank(ObjectUtils.toString(token))) {
				Long expiresIn = Long.valueOf(token.getExpires());
				if (StringUtils.isNotBlank(ObjectUtils.toString(token))) {
					this.iRedisService.setObjectKeyToRedis("WX_ACCESS_TOKEN" + wxAuth.getAppid(), token,
							expiresIn.intValue());
				}
			}
			this.logger.info("<|>WxExtendServiceImpl<|>getWxAccessToken<|>{}/{}<|>true<|>{}/{}<|><|>",
					new Object[] { wxAuth.getAppid(), wxAuth.getAppsecret(), token.getAccessToken(),
							Long.valueOf(token.getExpires()) });
			return token;
		} catch (Exception e) {
			this.logger.error("<|>WxExtendServiceImpl<|>getWxAccessToken<|>" + wxAuth.getAppid() + "/"
					+ wxAuth.getAppsecret() + "<|>异常<|>" + e + "<|><|>", e);
		}
		return null;
	}

	public Oauth2Token sendRedirect(WxAuth wxAuth, String code) {
		try {
			Gson gson = new Gson();
			String url = "https://api.weixin.qq.com/sns/oauth2/access_token";
			Map<String, String> pameValue = new HashMap();
			pameValue.put("appid", wxAuth.getAppid());
			pameValue.put("secret", wxAuth.getAppsecret());
			pameValue.put("code", code);
			pameValue.put("grant_type", "authorization_code");
			String codeBody = HttpUtil.doPost(url, pameValue);
			this.logger.info("<|>WxExtendServiceImpl<|>sendRedirect<|>" + wxAuth.getAppid() + "/"
					+ wxAuth.getAppsecret() + "/" + code + "<|>" + true + "<|>" + codeBody + "<|><|>");

			return (Oauth2Token) gson.fromJson(codeBody, Oauth2Token.class);
		} catch (Exception e) {
			this.logger.error("<|>WxExtendServiceImpl<|>sendRedirect<|>" + wxAuth.getAppid() + "/"
					+ wxAuth.getAppsecret() + "/" + code + "<|>异常<|>" + e + "<|><|>", e);
		}
		return null;
	}
}
