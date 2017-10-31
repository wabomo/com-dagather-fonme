package com.dagather.fonme.dial.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DialRecordExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public DialRecordExample() {
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
		protected List<DialRecordExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<DialRecordExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<DialRecordExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new DialRecordExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new DialRecordExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new DialRecordExample.Criterion(condition, value1, value2));
		}

		public DialRecordExample.Criteria andDridIsNull() {
			addCriterion("drid is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridIsNotNull() {
			addCriterion("drid is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridEqualTo(String value) {
			addCriterion("drid =", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridNotEqualTo(String value) {
			addCriterion("drid <>", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridGreaterThan(String value) {
			addCriterion("drid >", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridGreaterThanOrEqualTo(String value) {
			addCriterion("drid >=", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridLessThan(String value) {
			addCriterion("drid <", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridLessThanOrEqualTo(String value) {
			addCriterion("drid <=", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridLike(String value) {
			addCriterion("drid like", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridNotLike(String value) {
			addCriterion("drid not like", value, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridIn(List<String> values) {
			addCriterion("drid in", values, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridNotIn(List<String> values) {
			addCriterion("drid not in", values, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridBetween(String value1, String value2) {
			addCriterion("drid between", value1, value2, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andDridNotBetween(String value1, String value2) {
			addCriterion("drid not between", value1, value2, "drid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidIsNull() {
			addCriterion("uiid is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidIsNotNull() {
			addCriterion("uiid is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidEqualTo(Long value) {
			addCriterion("uiid =", value, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidNotEqualTo(Long value) {
			addCriterion("uiid <>", value, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidGreaterThan(Long value) {
			addCriterion("uiid >", value, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidGreaterThanOrEqualTo(Long value) {
			addCriterion("uiid >=", value, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidLessThan(Long value) {
			addCriterion("uiid <", value, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidLessThanOrEqualTo(Long value) {
			addCriterion("uiid <=", value, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidIn(List<Long> values) {
			addCriterion("uiid in", values, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidNotIn(List<Long> values) {
			addCriterion("uiid not in", values, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidBetween(Long value1, Long value2) {
			addCriterion("uiid between", value1, value2, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUiidNotBetween(Long value1, Long value2) {
			addCriterion("uiid not between", value1, value2, "uiid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidIsNull() {
			addCriterion("sessionid is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidIsNotNull() {
			addCriterion("sessionid is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidEqualTo(String value) {
			addCriterion("sessionid =", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidNotEqualTo(String value) {
			addCriterion("sessionid <>", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidGreaterThan(String value) {
			addCriterion("sessionid >", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidGreaterThanOrEqualTo(String value) {
			addCriterion("sessionid >=", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidLessThan(String value) {
			addCriterion("sessionid <", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidLessThanOrEqualTo(String value) {
			addCriterion("sessionid <=", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidLike(String value) {
			addCriterion("sessionid like", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidNotLike(String value) {
			addCriterion("sessionid not like", value, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidIn(List<String> values) {
			addCriterion("sessionid in", values, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidNotIn(List<String> values) {
			addCriterion("sessionid not in", values, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidBetween(String value1, String value2) {
			addCriterion("sessionid between", value1, value2, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andSessionidNotBetween(String value1, String value2) {
			addCriterion("sessionid not between", value1, value2, "sessionid");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerIsNull() {
			addCriterion("caller is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerIsNotNull() {
			addCriterion("caller is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerEqualTo(String value) {
			addCriterion("caller =", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerNotEqualTo(String value) {
			addCriterion("caller <>", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerGreaterThan(String value) {
			addCriterion("caller >", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerGreaterThanOrEqualTo(String value) {
			addCriterion("caller >=", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerLessThan(String value) {
			addCriterion("caller <", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerLessThanOrEqualTo(String value) {
			addCriterion("caller <=", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerLike(String value) {
			addCriterion("caller like", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerNotLike(String value) {
			addCriterion("caller not like", value, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerIn(List<String> values) {
			addCriterion("caller in", values, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerNotIn(List<String> values) {
			addCriterion("caller not in", values, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerBetween(String value1, String value2) {
			addCriterion("caller between", value1, value2, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCallerNotBetween(String value1, String value2) {
			addCriterion("caller not between", value1, value2, "caller");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledIsNull() {
			addCriterion("called is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledIsNotNull() {
			addCriterion("called is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledEqualTo(String value) {
			addCriterion("called =", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledNotEqualTo(String value) {
			addCriterion("called <>", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledGreaterThan(String value) {
			addCriterion("called >", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledGreaterThanOrEqualTo(String value) {
			addCriterion("called >=", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledLessThan(String value) {
			addCriterion("called <", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledLessThanOrEqualTo(String value) {
			addCriterion("called <=", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledLike(String value) {
			addCriterion("called like", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledNotLike(String value) {
			addCriterion("called not like", value, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledIn(List<String> values) {
			addCriterion("called in", values, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledNotIn(List<String> values) {
			addCriterion("called not in", values, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledBetween(String value1, String value2) {
			addCriterion("called between", value1, value2, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCalledNotBetween(String value1, String value2) {
			addCriterion("called not between", value1, value2, "called");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (DialRecordExample.Criteria) this;
		}

		public DialRecordExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (DialRecordExample.Criteria) this;
		}
	}

	public static class Criteria extends DialRecordExample.GeneratedCriteria {
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
