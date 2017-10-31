package com.dagather.fonme.wallet.model;

import java.util.Date;

public class UserWallet {
	private Long uwid;
	private Long uiid;
	private Long balance;
	private Integer currencyType;
	private Integer flagEnable;
	private Date createDate;
	private Date updateDate;

	public Long getUwid() {
		return this.uwid;
	}

	public void setUwid(Long uwid) {
		this.uwid = uwid;
	}

	public Long getUiid() {
		return this.uiid;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public Long getBalance() {
		return this.balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Integer getCurrencyType() {
		return this.currencyType;
	}

	public void setCurrencyType(Integer currencyType) {
		this.currencyType = currencyType;
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
		sb.append(", uwid=").append(this.uwid);
		sb.append(", uiid=").append(this.uiid);
		sb.append(", balance=").append(this.balance);
		sb.append(", currencyType=").append(this.currencyType);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
