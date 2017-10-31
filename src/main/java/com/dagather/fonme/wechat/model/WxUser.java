package com.dagather.fonme.wechat.model;

import java.io.Serializable;
import java.util.Date;

public class WxUser implements Serializable {
	private static final long serialVersionUID = -3558860364650975192L;
	private Long wuid;
	private Long wcaid;
	private String openid;
	private String nickname;
	private String headimgurl;
	private Integer sex;
	private String country;
	private String province;
	private String city;
	private String privilege;
	private String unionid;
	private String remark;
	private String groupid;
	private Integer flagEnable;
	private String subscribeTime;
	private Date createDate;
	private Date updateDate;

	public Long getWuid() {
		return this.wuid;
	}

	public void setWuid(Long wuid) {
		this.wuid = wuid;
	}

	public Long getWcaid() {
		return this.wcaid;
	}

	public void setWcaid(Long wcaid) {
		this.wcaid = wcaid;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = (openid == null ? null : openid.trim());
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = (nickname == null ? null : nickname.trim());
	}

	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = (headimgurl == null ? null : headimgurl.trim());
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = (country == null ? null : country.trim());
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = (province == null ? null : province.trim());
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = (city == null ? null : city.trim());
	}

	public String getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = (privilege == null ? null : privilege.trim());
	}

	public String getUnionid() {
		return this.unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = (unionid == null ? null : unionid.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = (groupid == null ? null : groupid.trim());
	}

	public Integer getFlagEnable() {
		return this.flagEnable;
	}

	public void setFlagEnable(Integer flagEnable) {
		this.flagEnable = flagEnable;
	}

	public String getSubscribeTime() {
		return this.subscribeTime;
	}

	public void setSubscribeTime(String subscribeTime) {
		this.subscribeTime = (subscribeTime == null ? null : subscribeTime.trim());
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
		sb.append(", wuid=").append(this.wuid);
		sb.append(", wcaid=").append(this.wcaid);
		sb.append(", openid=").append(this.openid);
		sb.append(", nickname=").append(this.nickname);
		sb.append(", headimgurl=").append(this.headimgurl);
		sb.append(", sex=").append(this.sex);
		sb.append(", country=").append(this.country);
		sb.append(", province=").append(this.province);
		sb.append(", city=").append(this.city);
		sb.append(", privilege=").append(this.privilege);
		sb.append(", unionid=").append(this.unionid);
		sb.append(", remark=").append(this.remark);
		sb.append(", groupid=").append(this.groupid);
		sb.append(", flagEnable=").append(this.flagEnable);
		sb.append(", subscribeTime=").append(this.subscribeTime);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", updateDate=").append(this.updateDate);
		sb.append("]");
		return sb.toString();
	}
}
