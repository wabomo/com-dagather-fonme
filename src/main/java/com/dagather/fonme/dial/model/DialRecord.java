package com.dagather.fonme.dial.model;

import java.io.Serializable;
import java.util.Date;

public class DialRecord implements Serializable {
	private static final long serialVersionUID = -3838150086574399044L;
	private String drid;
	private Long uiid;
	private String sessionid;
	private String caller;
	private String called;
	private Integer flagEnable;
	private Date createDate;
	private Date updateDate;

	public String getDrid() {
		return this.drid;
	}

	public void setDrid(String drid) {
		this.drid = (drid == null ? null : drid.trim());
	}

	public Long getUiid() {
		return this.uiid;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public String getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = (sessionid == null ? null : sessionid.trim());
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = (caller == null ? null : caller.trim());
	}

	public String getCalled() {
		return this.called;
	}

	public void setCalled(String called) {
		this.called = (called == null ? null : called.trim());
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
		sb.append(", drid=").append(this.drid);
		sb.append(", uiid=").append(this.uiid);
		sb.append(", sessionid=").append(this.sessionid);
		sb.append(", caller=").append(this.caller);
		sb.append(", called=").append(this.called);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
