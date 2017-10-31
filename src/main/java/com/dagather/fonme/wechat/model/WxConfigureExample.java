package com.dagather.fonme.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxConfigureExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public WxConfigureExample() {
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
		protected List<WxConfigureExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<WxConfigureExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<WxConfigureExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new WxConfigureExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new WxConfigureExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new WxConfigureExample.Criterion(condition, value1, value2));
		}

		public WxConfigureExample.Criteria andWcaidIsNull() {
			addCriterion("wcaid is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidIsNotNull() {
			addCriterion("wcaid is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidEqualTo(Long value) {
			addCriterion("wcaid =", value, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidNotEqualTo(Long value) {
			addCriterion("wcaid <>", value, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidGreaterThan(Long value) {
			addCriterion("wcaid >", value, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidGreaterThanOrEqualTo(Long value) {
			addCriterion("wcaid >=", value, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidLessThan(Long value) {
			addCriterion("wcaid <", value, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidLessThanOrEqualTo(Long value) {
			addCriterion("wcaid <=", value, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidIn(List<Long> values) {
			addCriterion("wcaid in", values, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidNotIn(List<Long> values) {
			addCriterion("wcaid not in", values, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidBetween(Long value1, Long value2) {
			addCriterion("wcaid between", value1, value2, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWcaidNotBetween(Long value1, Long value2) {
			addCriterion("wcaid not between", value1, value2, "wcaid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameIsNull() {
			addCriterion("wame is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameIsNotNull() {
			addCriterion("wame is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameEqualTo(String value) {
			addCriterion("wame =", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameNotEqualTo(String value) {
			addCriterion("wame <>", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameGreaterThan(String value) {
			addCriterion("wame >", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameGreaterThanOrEqualTo(String value) {
			addCriterion("wame >=", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameLessThan(String value) {
			addCriterion("wame <", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameLessThanOrEqualTo(String value) {
			addCriterion("wame <=", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameLike(String value) {
			addCriterion("wame like", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameNotLike(String value) {
			addCriterion("wame not like", value, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameIn(List<String> values) {
			addCriterion("wame in", values, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameNotIn(List<String> values) {
			addCriterion("wame not in", values, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameBetween(String value1, String value2) {
			addCriterion("wame between", value1, value2, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWameNotBetween(String value1, String value2) {
			addCriterion("wame not between", value1, value2, "wame");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidIsNull() {
			addCriterion("wechatid is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidIsNotNull() {
			addCriterion("wechatid is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidEqualTo(String value) {
			addCriterion("wechatid =", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidNotEqualTo(String value) {
			addCriterion("wechatid <>", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidGreaterThan(String value) {
			addCriterion("wechatid >", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidGreaterThanOrEqualTo(String value) {
			addCriterion("wechatid >=", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidLessThan(String value) {
			addCriterion("wechatid <", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidLessThanOrEqualTo(String value) {
			addCriterion("wechatid <=", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidLike(String value) {
			addCriterion("wechatid like", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidNotLike(String value) {
			addCriterion("wechatid not like", value, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidIn(List<String> values) {
			addCriterion("wechatid in", values, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidNotIn(List<String> values) {
			addCriterion("wechatid not in", values, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidBetween(String value1, String value2) {
			addCriterion("wechatid between", value1, value2, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWechatidNotBetween(String value1, String value2) {
			addCriterion("wechatid not between", value1, value2, "wechatid");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeIsNull() {
			addCriterion("wtype is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeIsNotNull() {
			addCriterion("wtype is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeEqualTo(Integer value) {
			addCriterion("wtype =", value, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeNotEqualTo(Integer value) {
			addCriterion("wtype <>", value, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeGreaterThan(Integer value) {
			addCriterion("wtype >", value, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("wtype >=", value, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeLessThan(Integer value) {
			addCriterion("wtype <", value, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeLessThanOrEqualTo(Integer value) {
			addCriterion("wtype <=", value, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeIn(List<Integer> values) {
			addCriterion("wtype in", values, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeNotIn(List<Integer> values) {
			addCriterion("wtype not in", values, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeBetween(Integer value1, Integer value2) {
			addCriterion("wtype between", value1, value2, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andWtypeNotBetween(Integer value1, Integer value2) {
			addCriterion("wtype not between", value1, value2, "wtype");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeIsNull() {
			addCriterion("auth_type is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeIsNotNull() {
			addCriterion("auth_type is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeEqualTo(Integer value) {
			addCriterion("auth_type =", value, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeNotEqualTo(Integer value) {
			addCriterion("auth_type <>", value, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeGreaterThan(Integer value) {
			addCriterion("auth_type >", value, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("auth_type >=", value, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeLessThan(Integer value) {
			addCriterion("auth_type <", value, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeLessThanOrEqualTo(Integer value) {
			addCriterion("auth_type <=", value, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeIn(List<Integer> values) {
			addCriterion("auth_type in", values, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeNotIn(List<Integer> values) {
			addCriterion("auth_type not in", values, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeBetween(Integer value1, Integer value2) {
			addCriterion("auth_type between", value1, value2, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andAuthTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("auth_type not between", value1, value2, "authType");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameIsNull() {
			addCriterion("bodyname is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameIsNotNull() {
			addCriterion("bodyname is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameEqualTo(String value) {
			addCriterion("bodyname =", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameNotEqualTo(String value) {
			addCriterion("bodyname <>", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameGreaterThan(String value) {
			addCriterion("bodyname >", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameGreaterThanOrEqualTo(String value) {
			addCriterion("bodyname >=", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameLessThan(String value) {
			addCriterion("bodyname <", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameLessThanOrEqualTo(String value) {
			addCriterion("bodyname <=", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameLike(String value) {
			addCriterion("bodyname like", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameNotLike(String value) {
			addCriterion("bodyname not like", value, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameIn(List<String> values) {
			addCriterion("bodyname in", values, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameNotIn(List<String> values) {
			addCriterion("bodyname not in", values, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameBetween(String value1, String value2) {
			addCriterion("bodyname between", value1, value2, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andBodynameNotBetween(String value1, String value2) {
			addCriterion("bodyname not between", value1, value2, "bodyname");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}

		public WxConfigureExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (WxConfigureExample.Criteria) this;
		}
	}

	public static class Criteria extends WxConfigureExample.GeneratedCriteria {
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
