package com.dagather.fonme.dial.model;

import java.util.Date;

public class OriginalCdr {
	private String callid;
	private String appid;
	private String binduuid;
	private String callee;
	private String startcalltime;
	private String startringtime;
	private String calleeaccepttime;
	private String calleedisplaynum;
	private String endcalltime;
	private String callendreason;
	private Long duration;
	private String recordfile;
	private Date createDate;
	private Date updateDate;

	public String getCallid() {
		return this.callid;
	}

	public void setCallid(String callid) {
		this.callid = (callid == null ? null : callid.trim());
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = (appid == null ? null : appid.trim());
	}

	public String getBinduuid() {
		return this.binduuid;
	}

	public void setBinduuid(String binduuid) {
		this.binduuid = (binduuid == null ? null : binduuid.trim());
	}

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = (callee == null ? null : callee.trim());
	}

	public String getStartcalltime() {
		return this.startcalltime;
	}

	public void setStartcalltime(String startcalltime) {
		this.startcalltime = (startcalltime == null ? null : startcalltime.trim());
	}

	public String getStartringtime() {
		return this.startringtime;
	}

	public void setStartringtime(String startringtime) {
		this.startringtime = (startringtime == null ? null : startringtime.trim());
	}

	public String getCalleeaccepttime() {
		return this.calleeaccepttime;
	}

	public void setCalleeaccepttime(String calleeaccepttime) {
		this.calleeaccepttime = (calleeaccepttime == null ? null : calleeaccepttime.trim());
	}

	public String getCalleedisplaynum() {
		return this.calleedisplaynum;
	}

	public void setCalleedisplaynum(String calleedisplaynum) {
		this.calleedisplaynum = (calleedisplaynum == null ? null : calleedisplaynum.trim());
	}

	public String getEndcalltime() {
		return this.endcalltime;
	}

	public void setEndcalltime(String endcalltime) {
		this.endcalltime = (endcalltime == null ? null : endcalltime.trim());
	}

	public String getCallendreason() {
		return this.callendreason;
	}

	public void setCallendreason(String callendreason) {
		this.callendreason = (callendreason == null ? null : callendreason.trim());
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getRecordfile() {
		return this.recordfile;
	}

	public void setRecordfile(String recordfile) {
		this.recordfile = (recordfile == null ? null : recordfile.trim());
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
		sb.append(", callid=").append(this.callid);
		sb.append(", appid=").append(this.appid);
		sb.append(", binduuid=").append(this.binduuid);
		sb.append(", callee=").append(this.callee);
		sb.append(", startcalltime=").append(this.startcalltime);
		sb.append(", startringtime=").append(this.startringtime);
		sb.append(", calleeaccepttime=").append(this.calleeaccepttime);
		sb.append(", calleedisplaynum=").append(this.calleedisplaynum);
		sb.append(", endcalltime=").append(this.endcalltime);
		sb.append(", callendreason=").append(this.callendreason);
		sb.append(", duration=").append(this.duration);
		sb.append(", recordfile=").append(this.recordfile);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
