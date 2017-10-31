package com.dagather.fonme.wechat.service;

import com.dagather.fonme.wechat.model.WxAuth;
import com.dagather.fonme.wechat.model.WxHandle;
import com.dagather.fonme.wechat.model.WxUser;
import java.sql.SQLException;

public abstract interface IWechatService {
	public abstract WxUser selectWxUserByOpenIdObject(String paramString, Integer paramInteger);

	public abstract boolean insertWxUserObject(WxUser paramWxUser) throws SQLException;

	public abstract WxAuth selectWxAuthObject(Long paramLong, Integer paramInteger);

	public abstract WxHandle selectWxHandleObject(Long paramLong, String paramString, Integer paramInteger);
}
