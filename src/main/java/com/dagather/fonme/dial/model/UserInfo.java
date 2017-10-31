package com.dagather.fonme.dial.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 3113041891115766146L;
	private Long uiid;
	private String openid;
	private Long wcaid;
	private String phone;
	private Integer flagEnable;
	private Date createDate;
	private Date updateDate;

	public Long getUiid() {
		return this.uiid;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = (openid == null ? null : openid.trim());
	}

	public Long getWcaid() {
		return this.wcaid;
	}

	public void setWcaid(Long wcaid) {
		this.wcaid = wcaid;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = (phone == null ? null : phone.trim());
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
		sb.append(", uiid=").append(this.uiid);
		sb.append(", openid=").append(this.openid);
		sb.append(", wcaid=").append(this.wcaid);
		sb.append(", phone=").append(this.phone);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
