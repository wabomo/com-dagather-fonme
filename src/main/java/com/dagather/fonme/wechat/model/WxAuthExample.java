package com.dagather.fonme.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxAuthExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public WxAuthExample() {
		this.oredCriteria = new ArrayList();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return this.orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return this.distinct;
	}

	public List<Criteria> getOredCriteria() {
		return this.oredCriteria;
	}

	public void or(Criteria criteria) {
		this.oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		this.oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (this.oredCriteria.size() == 0) {
			this.oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		this.oredCriteria.clear();
		this.orderByClause = null;
		this.distinct = false;
	}

	protected static abstract class GeneratedCriteria {
		protected List<WxAuthExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<WxAuthExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<WxAuthExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new WxAuthExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new WxAuthExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new WxAuthExample.Criterion(condition, value1, value2));
		}

		public WxAuthExample.Criteria andWxaidIsNull() {
			addCriterion("wxaid is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidIsNotNull() {
			addCriterion("wxaid is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidEqualTo(Long value) {
			addCriterion("wxaid =", value, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidNotEqualTo(Long value) {
			addCriterion("wxaid <>", value, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidGreaterThan(Long value) {
			addCriterion("wxaid >", value, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidGreaterThanOrEqualTo(Long value) {
			addCriterion("wxaid >=", value, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidLessThan(Long value) {
			addCriterion("wxaid <", value, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidLessThanOrEqualTo(Long value) {
			addCriterion("wxaid <=", value, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidIn(List<Long> values) {
			addCriterion("wxaid in", values, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidNotIn(List<Long> values) {
			addCriterion("wxaid not in", values, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidBetween(Long value1, Long value2) {
			addCriterion("wxaid between", value1, value2, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWxaidNotBetween(Long value1, Long value2) {
			addCriterion("wxaid not between", value1, value2, "wxaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidIsNull() {
			addCriterion("wcaid is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidIsNotNull() {
			addCriterion("wcaid is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidEqualTo(Long value) {
			addCriterion("wcaid =", value, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidNotEqualTo(Long value) {
			addCriterion("wcaid <>", value, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidGreaterThan(Long value) {
			addCriterion("wcaid >", value, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidGreaterThanOrEqualTo(Long value) {
			addCriterion("wcaid >=", value, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidLessThan(Long value) {
			addCriterion("wcaid <", value, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidLessThanOrEqualTo(Long value) {
			addCriterion("wcaid <=", value, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidIn(List<Long> values) {
			addCriterion("wcaid in", values, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidNotIn(List<Long> values) {
			addCriterion("wcaid not in", values, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidBetween(Long value1, Long value2) {
			addCriterion("wcaid between", value1, value2, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andWcaidNotBetween(Long value1, Long value2) {
			addCriterion("wcaid not between", value1, value2, "wcaid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidIsNull() {
			addCriterion("appid is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidIsNotNull() {
			addCriterion("appid is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidEqualTo(String value) {
			addCriterion("appid =", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidNotEqualTo(String value) {
			addCriterion("appid <>", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidGreaterThan(String value) {
			addCriterion("appid >", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidGreaterThanOrEqualTo(String value) {
			addCriterion("appid >=", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidLessThan(String value) {
			addCriterion("appid <", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidLessThanOrEqualTo(String value) {
			addCriterion("appid <=", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidLike(String value) {
			addCriterion("appid like", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidNotLike(String value) {
			addCriterion("appid not like", value, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidIn(List<String> values) {
			addCriterion("appid in", values, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidNotIn(List<String> values) {
			addCriterion("appid not in", values, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidBetween(String value1, String value2) {
			addCriterion("appid between", value1, value2, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppidNotBetween(String value1, String value2) {
			addCriterion("appid not between", value1, value2, "appid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretIsNull() {
			addCriterion("appsecret is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretIsNotNull() {
			addCriterion("appsecret is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretEqualTo(String value) {
			addCriterion("appsecret =", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretNotEqualTo(String value) {
			addCriterion("appsecret <>", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretGreaterThan(String value) {
			addCriterion("appsecret >", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretGreaterThanOrEqualTo(String value) {
			addCriterion("appsecret >=", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretLessThan(String value) {
			addCriterion("appsecret <", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretLessThanOrEqualTo(String value) {
			addCriterion("appsecret <=", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretLike(String value) {
			addCriterion("appsecret like", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretNotLike(String value) {
			addCriterion("appsecret not like", value, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretIn(List<String> values) {
			addCriterion("appsecret in", values, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretNotIn(List<String> values) {
			addCriterion("appsecret not in", values, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretBetween(String value1, String value2) {
			addCriterion("appsecret between", value1, value2, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andAppsecretNotBetween(String value1, String value2) {
			addCriterion("appsecret not between", value1, value2, "appsecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidIsNull() {
			addCriterion("payid is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidIsNotNull() {
			addCriterion("payid is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidEqualTo(String value) {
			addCriterion("payid =", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidNotEqualTo(String value) {
			addCriterion("payid <>", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidGreaterThan(String value) {
			addCriterion("payid >", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidGreaterThanOrEqualTo(String value) {
			addCriterion("payid >=", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidLessThan(String value) {
			addCriterion("payid <", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidLessThanOrEqualTo(String value) {
			addCriterion("payid <=", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidLike(String value) {
			addCriterion("payid like", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidNotLike(String value) {
			addCriterion("payid not like", value, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidIn(List<String> values) {
			addCriterion("payid in", values, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidNotIn(List<String> values) {
			addCriterion("payid not in", values, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidBetween(String value1, String value2) {
			addCriterion("payid between", value1, value2, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPayidNotBetween(String value1, String value2) {
			addCriterion("payid not between", value1, value2, "payid");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretIsNull() {
			addCriterion("paysecret is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretIsNotNull() {
			addCriterion("paysecret is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretEqualTo(String value) {
			addCriterion("paysecret =", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretNotEqualTo(String value) {
			addCriterion("paysecret <>", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretGreaterThan(String value) {
			addCriterion("paysecret >", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretGreaterThanOrEqualTo(String value) {
			addCriterion("paysecret >=", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretLessThan(String value) {
			addCriterion("paysecret <", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretLessThanOrEqualTo(String value) {
			addCriterion("paysecret <=", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretLike(String value) {
			addCriterion("paysecret like", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretNotLike(String value) {
			addCriterion("paysecret not like", value, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretIn(List<String> values) {
			addCriterion("paysecret in", values, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretNotIn(List<String> values) {
			addCriterion("paysecret not in", values, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretBetween(String value1, String value2) {
			addCriterion("paysecret between", value1, value2, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andPaysecretNotBetween(String value1, String value2) {
			addCriterion("paysecret not between", value1, value2, "paysecret");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateIsNull() {
			addCriterion("certificate is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateIsNotNull() {
			addCriterion("certificate is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateEqualTo(String value) {
			addCriterion("certificate =", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateNotEqualTo(String value) {
			addCriterion("certificate <>", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateGreaterThan(String value) {
			addCriterion("certificate >", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateGreaterThanOrEqualTo(String value) {
			addCriterion("certificate >=", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateLessThan(String value) {
			addCriterion("certificate <", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateLessThanOrEqualTo(String value) {
			addCriterion("certificate <=", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateLike(String value) {
			addCriterion("certificate like", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateNotLike(String value) {
			addCriterion("certificate not like", value, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateIn(List<String> values) {
			addCriterion("certificate in", values, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateNotIn(List<String> values) {
			addCriterion("certificate not in", values, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateBetween(String value1, String value2) {
			addCriterion("certificate between", value1, value2, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCertificateNotBetween(String value1, String value2) {
			addCriterion("certificate not between", value1, value2, "certificate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (WxAuthExample.Criteria) this;
		}

		public WxAuthExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (WxAuthExample.Criteria) this;
		}
	}

	public static class Criteria extends WxAuthExample.GeneratedCriteria {
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return this.condition;
		}

		public Object getValue() {
			return this.value;
		}

		public Object getSecondValue() {
			return this.secondValue;
		}

		public boolean isNoValue() {
			return this.noValue;
		}

		public boolean isSingleValue() {
			return this.singleValue;
		}

		public boolean isBetweenValue() {
			return this.betweenValue;
		}

		public boolean isListValue() {
			return this.listValue;
		}

		public String getTypeHandler() {
			return this.typeHandler;
		}

		protected Criterion(String condition) {
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if ((value instanceof List)) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}
