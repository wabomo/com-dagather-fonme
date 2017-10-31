package com.dagather.fonme.wechat.model;

import java.io.Serializable;
import java.util.Date;

public class WxAuth implements Serializable {
	private static final long serialVersionUID = -1520472902648805375L;
	private Long wxaid;
	private Long wcaid;
	private String appid;
	private String appsecret;
	private String payid;
	private String paysecret;
	private String certificate;
	private Integer flagEnable;
	private Date createDate;
	private Date updateDate;

	public Long getWxaid() {
		return this.wxaid;
	}

	public void setWxaid(Long wxaid) {
		this.wxaid = wxaid;
	}

	public Long getWcaid() {
		return this.wcaid;
	}

	public void setWcaid(Long wcaid) {
		this.wcaid = wcaid;
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = (appid == null ? null : appid.trim());
	}

	public String getAppsecret() {
		return this.appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = (appsecret == null ? null : appsecret.trim());
	}

	public String getPayid() {
		return this.payid;
	}

	public void setPayid(String payid) {
		this.payid = (payid == null ? null : payid.trim());
	}

	public String getPaysecret() {
		return this.paysecret;
	}

	public void setPaysecret(String paysecret) {
		this.paysecret = (paysecret == null ? null : paysecret.trim());
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = (certificate == null ? null : certificate.trim());
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
		sb.append(", wxaid=").append(this.wxaid);
		sb.append(", wcaid=").append(this.wcaid);
		sb.append(", appid=").append(this.appid);
		sb.append(", appsecret=").append(this.appsecret);
		sb.append(", payid=").append(this.payid);
		sb.append(", paysecret=").append(this.paysecret);
		sb.append(", certificate=").append(this.certificate);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
