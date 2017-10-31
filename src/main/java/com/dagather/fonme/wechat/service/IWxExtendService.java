package com.dagather.fonme.wechat.service;

import com.dagather.fonme.wechat.model.WxAuth;
import com.dagather.fonme.wechat.pojo.Oauth2Token;
import com.dagather.fonme.wechat.pojo.Token;

public abstract interface IWxExtendService {
	public abstract Token getWxAccessToken(WxAuth paramWxAuth);

	public abstract Oauth2Token sendRedirect(WxAuth paramWxAuth, String paramString);
}
