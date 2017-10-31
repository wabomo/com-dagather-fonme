package com.dagather.fonme.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxHandleExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public WxHandleExample() {
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
		protected List<WxHandleExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<WxHandleExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<WxHandleExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new WxHandleExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new WxHandleExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new WxHandleExample.Criterion(condition, value1, value2));
		}

		public WxHandleExample.Criteria andWhidIsNull() {
			addCriterion("whid is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidIsNotNull() {
			addCriterion("whid is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidEqualTo(Long value) {
			addCriterion("whid =", value, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidNotEqualTo(Long value) {
			addCriterion("whid <>", value, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidGreaterThan(Long value) {
			addCriterion("whid >", value, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidGreaterThanOrEqualTo(Long value) {
			addCriterion("whid >=", value, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidLessThan(Long value) {
			addCriterion("whid <", value, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidLessThanOrEqualTo(Long value) {
			addCriterion("whid <=", value, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidIn(List<Long> values) {
			addCriterion("whid in", values, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidNotIn(List<Long> values) {
			addCriterion("whid not in", values, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidBetween(Long value1, Long value2) {
			addCriterion("whid between", value1, value2, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWhidNotBetween(Long value1, Long value2) {
			addCriterion("whid not between", value1, value2, "whid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidIsNull() {
			addCriterion("wcaid is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidIsNotNull() {
			addCriterion("wcaid is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidEqualTo(Long value) {
			addCriterion("wcaid =", value, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidNotEqualTo(Long value) {
			addCriterion("wcaid <>", value, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidGreaterThan(Long value) {
			addCriterion("wcaid >", value, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidGreaterThanOrEqualTo(Long value) {
			addCriterion("wcaid >=", value, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidLessThan(Long value) {
			addCriterion("wcaid <", value, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidLessThanOrEqualTo(Long value) {
			addCriterion("wcaid <=", value, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidIn(List<Long> values) {
			addCriterion("wcaid in", values, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidNotIn(List<Long> values) {
			addCriterion("wcaid not in", values, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidBetween(Long value1, Long value2) {
			addCriterion("wcaid between", value1, value2, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andWcaidNotBetween(Long value1, Long value2) {
			addCriterion("wcaid not between", value1, value2, "wcaid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeIsNull() {
			addCriterion("hcode is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeIsNotNull() {
			addCriterion("hcode is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeEqualTo(String value) {
			addCriterion("hcode =", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeNotEqualTo(String value) {
			addCriterion("hcode <>", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeGreaterThan(String value) {
			addCriterion("hcode >", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeGreaterThanOrEqualTo(String value) {
			addCriterion("hcode >=", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeLessThan(String value) {
			addCriterion("hcode <", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeLessThanOrEqualTo(String value) {
			addCriterion("hcode <=", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeLike(String value) {
			addCriterion("hcode like", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeNotLike(String value) {
			addCriterion("hcode not like", value, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeIn(List<String> values) {
			addCriterion("hcode in", values, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeNotIn(List<String> values) {
			addCriterion("hcode not in", values, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeBetween(String value1, String value2) {
			addCriterion("hcode between", value1, value2, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHcodeNotBetween(String value1, String value2) {
			addCriterion("hcode not between", value1, value2, "hcode");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlIsNull() {
			addCriterion("handleurl is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlIsNotNull() {
			addCriterion("handleurl is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlEqualTo(String value) {
			addCriterion("handleurl =", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlNotEqualTo(String value) {
			addCriterion("handleurl <>", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlGreaterThan(String value) {
			addCriterion("handleurl >", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlGreaterThanOrEqualTo(String value) {
			addCriterion("handleurl >=", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlLessThan(String value) {
			addCriterion("handleurl <", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlLessThanOrEqualTo(String value) {
			addCriterion("handleurl <=", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlLike(String value) {
			addCriterion("handleurl like", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlNotLike(String value) {
			addCriterion("handleurl not like", value, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlIn(List<String> values) {
			addCriterion("handleurl in", values, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlNotIn(List<String> values) {
			addCriterion("handleurl not in", values, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlBetween(String value1, String value2) {
			addCriterion("handleurl between", value1, value2, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andHandleurlNotBetween(String value1, String value2) {
			addCriterion("handleurl not between", value1, value2, "handleurl");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidIsNull() {
			addCriterion("pwhid is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidIsNotNull() {
			addCriterion("pwhid is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidEqualTo(Long value) {
			addCriterion("pwhid =", value, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidNotEqualTo(Long value) {
			addCriterion("pwhid <>", value, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidGreaterThan(Long value) {
			addCriterion("pwhid >", value, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidGreaterThanOrEqualTo(Long value) {
			addCriterion("pwhid >=", value, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidLessThan(Long value) {
			addCriterion("pwhid <", value, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidLessThanOrEqualTo(Long value) {
			addCriterion("pwhid <=", value, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidIn(List<Long> values) {
			addCriterion("pwhid in", values, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidNotIn(List<Long> values) {
			addCriterion("pwhid not in", values, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidBetween(Long value1, Long value2) {
			addCriterion("pwhid between", value1, value2, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andPwhidNotBetween(Long value1, Long value2) {
			addCriterion("pwhid not between", value1, value2, "pwhid");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (WxHandleExample.Criteria) this;
		}

		public WxHandleExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (WxHandleExample.Criteria) this;
		}
	}

	public static class Criteria extends WxHandleExample.GeneratedCriteria {
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
