package com.dagather.fonme.wallet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserWalletExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public UserWalletExample() {
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
		protected List<UserWalletExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<UserWalletExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<UserWalletExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new UserWalletExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new UserWalletExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new UserWalletExample.Criterion(condition, value1, value2));
		}

		public UserWalletExample.Criteria andUwidIsNull() {
			addCriterion("uwid is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidIsNotNull() {
			addCriterion("uwid is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidEqualTo(Long value) {
			addCriterion("uwid =", value, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidNotEqualTo(Long value) {
			addCriterion("uwid <>", value, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidGreaterThan(Long value) {
			addCriterion("uwid >", value, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidGreaterThanOrEqualTo(Long value) {
			addCriterion("uwid >=", value, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidLessThan(Long value) {
			addCriterion("uwid <", value, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidLessThanOrEqualTo(Long value) {
			addCriterion("uwid <=", value, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidIn(List<Long> values) {
			addCriterion("uwid in", values, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidNotIn(List<Long> values) {
			addCriterion("uwid not in", values, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidBetween(Long value1, Long value2) {
			addCriterion("uwid between", value1, value2, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUwidNotBetween(Long value1, Long value2) {
			addCriterion("uwid not between", value1, value2, "uwid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidIsNull() {
			addCriterion("uiid is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidIsNotNull() {
			addCriterion("uiid is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidEqualTo(Long value) {
			addCriterion("uiid =", value, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidNotEqualTo(Long value) {
			addCriterion("uiid <>", value, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidGreaterThan(Long value) {
			addCriterion("uiid >", value, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidGreaterThanOrEqualTo(Long value) {
			addCriterion("uiid >=", value, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidLessThan(Long value) {
			addCriterion("uiid <", value, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidLessThanOrEqualTo(Long value) {
			addCriterion("uiid <=", value, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidIn(List<Long> values) {
			addCriterion("uiid in", values, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidNotIn(List<Long> values) {
			addCriterion("uiid not in", values, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidBetween(Long value1, Long value2) {
			addCriterion("uiid between", value1, value2, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUiidNotBetween(Long value1, Long value2) {
			addCriterion("uiid not between", value1, value2, "uiid");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceIsNull() {
			addCriterion("balance is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceIsNotNull() {
			addCriterion("balance is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceEqualTo(Long value) {
			addCriterion("balance =", value, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceNotEqualTo(Long value) {
			addCriterion("balance <>", value, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceGreaterThan(Long value) {
			addCriterion("balance >", value, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceGreaterThanOrEqualTo(Long value) {
			addCriterion("balance >=", value, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceLessThan(Long value) {
			addCriterion("balance <", value, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceLessThanOrEqualTo(Long value) {
			addCriterion("balance <=", value, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceIn(List<Long> values) {
			addCriterion("balance in", values, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceNotIn(List<Long> values) {
			addCriterion("balance not in", values, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceBetween(Long value1, Long value2) {
			addCriterion("balance between", value1, value2, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andBalanceNotBetween(Long value1, Long value2) {
			addCriterion("balance not between", value1, value2, "balance");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeIsNull() {
			addCriterion("currency_type is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeIsNotNull() {
			addCriterion("currency_type is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeEqualTo(Integer value) {
			addCriterion("currency_type =", value, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeNotEqualTo(Integer value) {
			addCriterion("currency_type <>", value, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeGreaterThan(Integer value) {
			addCriterion("currency_type >", value, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("currency_type >=", value, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeLessThan(Integer value) {
			addCriterion("currency_type <", value, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeLessThanOrEqualTo(Integer value) {
			addCriterion("currency_type <=", value, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeIn(List<Integer> values) {
			addCriterion("currency_type in", values, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeNotIn(List<Integer> values) {
			addCriterion("currency_type not in", values, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeBetween(Integer value1, Integer value2) {
			addCriterion("currency_type between", value1, value2, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCurrencyTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("currency_type not between", value1, value2, "currencyType");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (UserWalletExample.Criteria) this;
		}

		public UserWalletExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (UserWalletExample.Criteria) this;
		}
	}

	public static class Criteria extends UserWalletExample.GeneratedCriteria {
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
