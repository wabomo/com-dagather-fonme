package com.dagather.fonme.wechat.pojo;

public class Oauth2Token extends Token {
	private static final long serialVersionUID = 7564855472419104085L;
	private String refresh_token;
	private String openid;
	private String scope;

	public String getRefresh_token() {
		return this.refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String toString() {
		return "Oauth2Token [accessToken=" + this.access_token + ", expires=" + this.expires_in + ",  extra="
				+ this.extra + ",  refresh_token=" + this.refresh_token + ",  openid=" + this.openid + ",  scope="
				+ this.scope + "]";
	}
}
