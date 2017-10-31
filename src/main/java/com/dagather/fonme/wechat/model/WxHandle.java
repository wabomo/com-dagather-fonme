package com.dagather.fonme.wechat.model;

import java.io.Serializable;
import java.util.Date;

public class WxHandle implements Serializable {
	private static final long serialVersionUID = 5758368100947768181L;
	private Long whid;
	private Long wcaid;
	private String title;
	private String hcode;
	private String handleurl;
	private Long pwhid;
	private Integer flagEnable;
	private Date createDate;
	private Date updateDate;

	public Long getWhid() {
		return this.whid;
	}

	public void setWhid(Long whid) {
		this.whid = whid;
	}

	public Long getWcaid() {
		return this.wcaid;
	}

	public void setWcaid(Long wcaid) {
		this.wcaid = wcaid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = (title == null ? null : title.trim());
	}

	public String getHcode() {
		return this.hcode;
	}

	public void setHcode(String hcode) {
		this.hcode = (hcode == null ? null : hcode.trim());
	}

	public String getHandleurl() {
		return this.handleurl;
	}

	public void setHandleurl(String handleurl) {
		this.handleurl = (handleurl == null ? null : handleurl.trim());
	}

	public Long getPwhid() {
		return this.pwhid;
	}

	public void setPwhid(Long pwhid) {
		this.pwhid = pwhid;
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
		sb.append(", whid=").append(this.whid);
		sb.append(", wcaid=").append(this.wcaid);
		sb.append(", title=").append(this.title);
		sb.append(", hcode=").append(this.hcode);
		sb.append(", handleurl=").append(this.handleurl);
		sb.append(", pwhid=").append(this.pwhid);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
