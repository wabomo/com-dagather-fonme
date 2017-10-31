package com.dagather.fonme.wechat.model;

import java.util.Date;

public class WxConfigure {
	private Long wcaid;
	private String wame;
	private String wechatid;
	private Integer wtype;
	private Integer authType;
	private String bodyname;
	private Integer flagEnable;
	private Date createDate;
	private Date updateDate;

	public Long getWcaid() {
		return this.wcaid;
	}

	public void setWcaid(Long wcaid) {
		this.wcaid = wcaid;
	}

	public String getWame() {
		return this.wame;
	}

	public void setWame(String wame) {
		this.wame = (wame == null ? null : wame.trim());
	}

	public String getWechatid() {
		return this.wechatid;
	}

	public void setWechatid(String wechatid) {
		this.wechatid = (wechatid == null ? null : wechatid.trim());
	}

	public Integer getWtype() {
		return this.wtype;
	}

	public void setWtype(Integer wtype) {
		this.wtype = wtype;
	}

	public Integer getAuthType() {
		return this.authType;
	}

	public void setAuthType(Integer authType) {
		this.authType = authType;
	}

	public String getBodyname() {
		return this.bodyname;
	}

	public void setBodyname(String bodyname) {
		this.bodyname = (bodyname == null ? null : bodyname.trim());
	}

	public Integer getFlagEnable() {
		return this.flagEnable;
	}

	public void setFlagEnable(Integer flagEnable) {
		this.flagEnable = flagEnable;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", wcaid=").append(this.wcaid);
		sb.append(", wame=").append(this.wame);
		sb.append(", wechatid=").append(this.wechatid);
		sb.append(", wtype=").append(this.wtype);
		sb.append(", authType=").append(this.authType);
		sb.append(", bodyname=").append(this.bodyname);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
