package com.dagather.fonme.dial.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OriginalCdrExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public OriginalCdrExample() {
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
		protected List<OriginalCdrExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<OriginalCdrExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<OriginalCdrExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new OriginalCdrExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new OriginalCdrExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new OriginalCdrExample.Criterion(condition, value1, value2));
		}

		public OriginalCdrExample.Criteria andCallidIsNull() {
			addCriterion("callid is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidIsNotNull() {
			addCriterion("callid is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidEqualTo(String value) {
			addCriterion("callid =", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidNotEqualTo(String value) {
			addCriterion("callid <>", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidGreaterThan(String value) {
			addCriterion("callid >", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidGreaterThanOrEqualTo(String value) {
			addCriterion("callid >=", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidLessThan(String value) {
			addCriterion("callid <", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidLessThanOrEqualTo(String value) {
			addCriterion("callid <=", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidLike(String value) {
			addCriterion("callid like", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidNotLike(String value) {
			addCriterion("callid not like", value, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidIn(List<String> values) {
			addCriterion("callid in", values, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidNotIn(List<String> values) {
			addCriterion("callid not in", values, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidBetween(String value1, String value2) {
			addCriterion("callid between", value1, value2, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallidNotBetween(String value1, String value2) {
			addCriterion("callid not between", value1, value2, "callid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidIsNull() {
			addCriterion("appId is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidIsNotNull() {
			addCriterion("appId is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidEqualTo(String value) {
			addCriterion("appId =", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidNotEqualTo(String value) {
			addCriterion("appId <>", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidGreaterThan(String value) {
			addCriterion("appId >", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidGreaterThanOrEqualTo(String value) {
			addCriterion("appId >=", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidLessThan(String value) {
			addCriterion("appId <", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidLessThanOrEqualTo(String value) {
			addCriterion("appId <=", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidLike(String value) {
			addCriterion("appId like", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidNotLike(String value) {
			addCriterion("appId not like", value, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidIn(List<String> values) {
			addCriterion("appId in", values, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidNotIn(List<String> values) {
			addCriterion("appId not in", values, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidBetween(String value1, String value2) {
			addCriterion("appId between", value1, value2, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andAppidNotBetween(String value1, String value2) {
			addCriterion("appId not between", value1, value2, "appid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidIsNull() {
			addCriterion("binduuId is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidIsNotNull() {
			addCriterion("binduuId is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidEqualTo(String value) {
			addCriterion("binduuId =", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidNotEqualTo(String value) {
			addCriterion("binduuId <>", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidGreaterThan(String value) {
			addCriterion("binduuId >", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidGreaterThanOrEqualTo(String value) {
			addCriterion("binduuId >=", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidLessThan(String value) {
			addCriterion("binduuId <", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidLessThanOrEqualTo(String value) {
			addCriterion("binduuId <=", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidLike(String value) {
			addCriterion("binduuId like", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidNotLike(String value) {
			addCriterion("binduuId not like", value, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidIn(List<String> values) {
			addCriterion("binduuId in", values, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidNotIn(List<String> values) {
			addCriterion("binduuId not in", values, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidBetween(String value1, String value2) {
			addCriterion("binduuId between", value1, value2, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andBinduuidNotBetween(String value1, String value2) {
			addCriterion("binduuId not between", value1, value2, "binduuid");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeIsNull() {
			addCriterion("callee is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeIsNotNull() {
			addCriterion("callee is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeEqualTo(String value) {
			addCriterion("callee =", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeNotEqualTo(String value) {
			addCriterion("callee <>", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeGreaterThan(String value) {
			addCriterion("callee >", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeGreaterThanOrEqualTo(String value) {
			addCriterion("callee >=", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeLessThan(String value) {
			addCriterion("callee <", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeLessThanOrEqualTo(String value) {
			addCriterion("callee <=", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeLike(String value) {
			addCriterion("callee like", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeNotLike(String value) {
			addCriterion("callee not like", value, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeIn(List<String> values) {
			addCriterion("callee in", values, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeNotIn(List<String> values) {
			addCriterion("callee not in", values, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeBetween(String value1, String value2) {
			addCriterion("callee between", value1, value2, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeNotBetween(String value1, String value2) {
			addCriterion("callee not between", value1, value2, "callee");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeIsNull() {
			addCriterion("startcalltime is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeIsNotNull() {
			addCriterion("startcalltime is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeEqualTo(String value) {
			addCriterion("startcalltime =", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeNotEqualTo(String value) {
			addCriterion("startcalltime <>", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeGreaterThan(String value) {
			addCriterion("startcalltime >", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeGreaterThanOrEqualTo(String value) {
			addCriterion("startcalltime >=", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeLessThan(String value) {
			addCriterion("startcalltime <", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeLessThanOrEqualTo(String value) {
			addCriterion("startcalltime <=", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeLike(String value) {
			addCriterion("startcalltime like", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeNotLike(String value) {
			addCriterion("startcalltime not like", value, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeIn(List<String> values) {
			addCriterion("startcalltime in", values, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeNotIn(List<String> values) {
			addCriterion("startcalltime not in", values, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeBetween(String value1, String value2) {
			addCriterion("startcalltime between", value1, value2, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartcalltimeNotBetween(String value1, String value2) {
			addCriterion("startcalltime not between", value1, value2, "startcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeIsNull() {
			addCriterion("startringtime is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeIsNotNull() {
			addCriterion("startringtime is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeEqualTo(String value) {
			addCriterion("startringtime =", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeNotEqualTo(String value) {
			addCriterion("startringtime <>", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeGreaterThan(String value) {
			addCriterion("startringtime >", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeGreaterThanOrEqualTo(String value) {
			addCriterion("startringtime >=", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeLessThan(String value) {
			addCriterion("startringtime <", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeLessThanOrEqualTo(String value) {
			addCriterion("startringtime <=", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeLike(String value) {
			addCriterion("startringtime like", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeNotLike(String value) {
			addCriterion("startringtime not like", value, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeIn(List<String> values) {
			addCriterion("startringtime in", values, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeNotIn(List<String> values) {
			addCriterion("startringtime not in", values, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeBetween(String value1, String value2) {
			addCriterion("startringtime between", value1, value2, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andStartringtimeNotBetween(String value1, String value2) {
			addCriterion("startringtime not between", value1, value2, "startringtime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeIsNull() {
			addCriterion("calleeaccepttime is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeIsNotNull() {
			addCriterion("calleeaccepttime is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeEqualTo(String value) {
			addCriterion("calleeaccepttime =", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeNotEqualTo(String value) {
			addCriterion("calleeaccepttime <>", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeGreaterThan(String value) {
			addCriterion("calleeaccepttime >", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeGreaterThanOrEqualTo(String value) {
			addCriterion("calleeaccepttime >=", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeLessThan(String value) {
			addCriterion("calleeaccepttime <", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeLessThanOrEqualTo(String value) {
			addCriterion("calleeaccepttime <=", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeLike(String value) {
			addCriterion("calleeaccepttime like", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeNotLike(String value) {
			addCriterion("calleeaccepttime not like", value, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeIn(List<String> values) {
			addCriterion("calleeaccepttime in", values, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeNotIn(List<String> values) {
			addCriterion("calleeaccepttime not in", values, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeBetween(String value1, String value2) {
			addCriterion("calleeaccepttime between", value1, value2, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleeaccepttimeNotBetween(String value1, String value2) {
			addCriterion("calleeaccepttime not between", value1, value2, "calleeaccepttime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumIsNull() {
			addCriterion("calleedisplaynum is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumIsNotNull() {
			addCriterion("calleedisplaynum is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumEqualTo(String value) {
			addCriterion("calleedisplaynum =", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumNotEqualTo(String value) {
			addCriterion("calleedisplaynum <>", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumGreaterThan(String value) {
			addCriterion("calleedisplaynum >", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumGreaterThanOrEqualTo(String value) {
			addCriterion("calleedisplaynum >=", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumLessThan(String value) {
			addCriterion("calleedisplaynum <", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumLessThanOrEqualTo(String value) {
			addCriterion("calleedisplaynum <=", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumLike(String value) {
			addCriterion("calleedisplaynum like", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumNotLike(String value) {
			addCriterion("calleedisplaynum not like", value, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumIn(List<String> values) {
			addCriterion("calleedisplaynum in", values, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumNotIn(List<String> values) {
			addCriterion("calleedisplaynum not in", values, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumBetween(String value1, String value2) {
			addCriterion("calleedisplaynum between", value1, value2, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCalleedisplaynumNotBetween(String value1, String value2) {
			addCriterion("calleedisplaynum not between", value1, value2, "calleedisplaynum");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeIsNull() {
			addCriterion("endcalltime is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeIsNotNull() {
			addCriterion("endcalltime is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeEqualTo(String value) {
			addCriterion("endcalltime =", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeNotEqualTo(String value) {
			addCriterion("endcalltime <>", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeGreaterThan(String value) {
			addCriterion("endcalltime >", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeGreaterThanOrEqualTo(String value) {
			addCriterion("endcalltime >=", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeLessThan(String value) {
			addCriterion("endcalltime <", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeLessThanOrEqualTo(String value) {
			addCriterion("endcalltime <=", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeLike(String value) {
			addCriterion("endcalltime like", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeNotLike(String value) {
			addCriterion("endcalltime not like", value, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeIn(List<String> values) {
			addCriterion("endcalltime in", values, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeNotIn(List<String> values) {
			addCriterion("endcalltime not in", values, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeBetween(String value1, String value2) {
			addCriterion("endcalltime between", value1, value2, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andEndcalltimeNotBetween(String value1, String value2) {
			addCriterion("endcalltime not between", value1, value2, "endcalltime");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonIsNull() {
			addCriterion("callendreason is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonIsNotNull() {
			addCriterion("callendreason is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonEqualTo(String value) {
			addCriterion("callendreason =", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonNotEqualTo(String value) {
			addCriterion("callendreason <>", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonGreaterThan(String value) {
			addCriterion("callendreason >", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonGreaterThanOrEqualTo(String value) {
			addCriterion("callendreason >=", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonLessThan(String value) {
			addCriterion("callendreason <", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonLessThanOrEqualTo(String value) {
			addCriterion("callendreason <=", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonLike(String value) {
			addCriterion("callendreason like", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonNotLike(String value) {
			addCriterion("callendreason not like", value, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonIn(List<String> values) {
			addCriterion("callendreason in", values, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonNotIn(List<String> values) {
			addCriterion("callendreason not in", values, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonBetween(String value1, String value2) {
			addCriterion("callendreason between", value1, value2, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCallendreasonNotBetween(String value1, String value2) {
			addCriterion("callendreason not between", value1, value2, "callendreason");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationIsNull() {
			addCriterion("duration is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationIsNotNull() {
			addCriterion("duration is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationEqualTo(Long value) {
			addCriterion("duration =", value, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationNotEqualTo(Long value) {
			addCriterion("duration <>", value, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationGreaterThan(Long value) {
			addCriterion("duration >", value, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationGreaterThanOrEqualTo(Long value) {
			addCriterion("duration >=", value, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationLessThan(Long value) {
			addCriterion("duration <", value, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationLessThanOrEqualTo(Long value) {
			addCriterion("duration <=", value, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationIn(List<Long> values) {
			addCriterion("duration in", values, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationNotIn(List<Long> values) {
			addCriterion("duration not in", values, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationBetween(Long value1, Long value2) {
			addCriterion("duration between", value1, value2, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andDurationNotBetween(Long value1, Long value2) {
			addCriterion("duration not between", value1, value2, "duration");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileIsNull() {
			addCriterion("recordfile is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileIsNotNull() {
			addCriterion("recordfile is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileEqualTo(String value) {
			addCriterion("recordfile =", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileNotEqualTo(String value) {
			addCriterion("recordfile <>", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileGreaterThan(String value) {
			addCriterion("recordfile >", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileGreaterThanOrEqualTo(String value) {
			addCriterion("recordfile >=", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileLessThan(String value) {
			addCriterion("recordfile <", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileLessThanOrEqualTo(String value) {
			addCriterion("recordfile <=", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileLike(String value) {
			addCriterion("recordfile like", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileNotLike(String value) {
			addCriterion("recordfile not like", value, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileIn(List<String> values) {
			addCriterion("recordfile in", values, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileNotIn(List<String> values) {
			addCriterion("recordfile not in", values, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileBetween(String value1, String value2) {
			addCriterion("recordfile between", value1, value2, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andRecordfileNotBetween(String value1, String value2) {
			addCriterion("recordfile not between", value1, value2, "recordfile");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}

		public OriginalCdrExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (OriginalCdrExample.Criteria) this;
		}
	}

	public static class Criteria extends OriginalCdrExample.GeneratedCriteria {
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
