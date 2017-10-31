package com.dagather.fonme.wechat.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Token implements Serializable {
	private static final long serialVersionUID = 7564855472419104084L;
	protected String access_token;
	protected long expires_in;
	protected Map<String, String> extra;

	public Token() {
	}

	public Token(String accessToken) {
		this(accessToken, -1L);
	}

	public Token(String accessToken, long expires) {
		this(accessToken, expires, System.currentTimeMillis());
	}

	public Token(String accessToken, long expires, long createTime) {
		this.access_token = accessToken;
		this.expires_in = expires;
		this.extra = new HashMap();
	}

	public String getAccessToken() {
		return this.access_token;
	}

	public long getExpires() {
		return this.expires_in;
	}

	public Map<String, String> getExtra() {
		return this.extra;
	}

	public Token pushExtra(String name, String value) {
		this.extra.put(name, value);
		return this;
	}

	public String toString() {
		return "Token [accessToken=" + this.access_token + ", expires=" + this.expires_in + ",  extra=" + this.extra
				+ "]";
	}
}
