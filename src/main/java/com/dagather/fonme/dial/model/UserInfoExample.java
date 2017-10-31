package com.dagather.fonme.dial.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public UserInfoExample() {
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
		protected List<UserInfoExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<UserInfoExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<UserInfoExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new UserInfoExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new UserInfoExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new UserInfoExample.Criterion(condition, value1, value2));
		}

		public UserInfoExample.Criteria andUiidIsNull() {
			addCriterion("uiid is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidIsNotNull() {
			addCriterion("uiid is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidEqualTo(Long value) {
			addCriterion("uiid =", value, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidNotEqualTo(Long value) {
			addCriterion("uiid <>", value, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidGreaterThan(Long value) {
			addCriterion("uiid >", value, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidGreaterThanOrEqualTo(Long value) {
			addCriterion("uiid >=", value, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidLessThan(Long value) {
			addCriterion("uiid <", value, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidLessThanOrEqualTo(Long value) {
			addCriterion("uiid <=", value, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidIn(List<Long> values) {
			addCriterion("uiid in", values, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidNotIn(List<Long> values) {
			addCriterion("uiid not in", values, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidBetween(Long value1, Long value2) {
			addCriterion("uiid between", value1, value2, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUiidNotBetween(Long value1, Long value2) {
			addCriterion("uiid not between", value1, value2, "uiid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidIsNull() {
			addCriterion("openid is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidIsNotNull() {
			addCriterion("openid is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidEqualTo(String value) {
			addCriterion("openid =", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidNotEqualTo(String value) {
			addCriterion("openid <>", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidGreaterThan(String value) {
			addCriterion("openid >", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidGreaterThanOrEqualTo(String value) {
			addCriterion("openid >=", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidLessThan(String value) {
			addCriterion("openid <", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidLessThanOrEqualTo(String value) {
			addCriterion("openid <=", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidLike(String value) {
			addCriterion("openid like", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidNotLike(String value) {
			addCriterion("openid not like", value, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidIn(List<String> values) {
			addCriterion("openid in", values, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidNotIn(List<String> values) {
			addCriterion("openid not in", values, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidBetween(String value1, String value2) {
			addCriterion("openid between", value1, value2, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andOpenidNotBetween(String value1, String value2) {
			addCriterion("openid not between", value1, value2, "openid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidIsNull() {
			addCriterion("wcaid is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidIsNotNull() {
			addCriterion("wcaid is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidEqualTo(Long value) {
			addCriterion("wcaid =", value, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidNotEqualTo(Long value) {
			addCriterion("wcaid <>", value, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidGreaterThan(Long value) {
			addCriterion("wcaid >", value, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidGreaterThanOrEqualTo(Long value) {
			addCriterion("wcaid >=", value, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidLessThan(Long value) {
			addCriterion("wcaid <", value, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidLessThanOrEqualTo(Long value) {
			addCriterion("wcaid <=", value, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidIn(List<Long> values) {
			addCriterion("wcaid in", values, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidNotIn(List<Long> values) {
			addCriterion("wcaid not in", values, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidBetween(Long value1, Long value2) {
			addCriterion("wcaid between", value1, value2, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andWcaidNotBetween(Long value1, Long value2) {
			addCriterion("wcaid not between", value1, value2, "wcaid");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (UserInfoExample.Criteria) this;
		}

		public UserInfoExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (UserInfoExample.Criteria) this;
		}
	}

	public static class Criteria extends UserInfoExample.GeneratedCriteria {
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
