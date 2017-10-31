package com.dagather.fonme.dial.service;

import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.UserInfo;
import java.sql.SQLException;

public abstract interface IDialService {
	public abstract String sendDial(String paramString1, String paramString2);

	public abstract UserInfo selectUserInfoObject(String paramString, Long paramLong, Integer paramInteger);

	public abstract boolean insertDialRecordObject(DialRecord paramDialRecord) throws SQLException;
}
