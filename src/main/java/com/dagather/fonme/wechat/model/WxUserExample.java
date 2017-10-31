package com.dagather.fonme.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxUserExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public WxUserExample() {
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
		protected List<WxUserExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<WxUserExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<WxUserExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new WxUserExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new WxUserExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new WxUserExample.Criterion(condition, value1, value2));
		}

		public WxUserExample.Criteria andWuidIsNull() {
			addCriterion("wuid is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidIsNotNull() {
			addCriterion("wuid is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidEqualTo(Long value) {
			addCriterion("wuid =", value, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidNotEqualTo(Long value) {
			addCriterion("wuid <>", value, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidGreaterThan(Long value) {
			addCriterion("wuid >", value, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidGreaterThanOrEqualTo(Long value) {
			addCriterion("wuid >=", value, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidLessThan(Long value) {
			addCriterion("wuid <", value, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidLessThanOrEqualTo(Long value) {
			addCriterion("wuid <=", value, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidIn(List<Long> values) {
			addCriterion("wuid in", values, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidNotIn(List<Long> values) {
			addCriterion("wuid not in", values, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidBetween(Long value1, Long value2) {
			addCriterion("wuid between", value1, value2, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWuidNotBetween(Long value1, Long value2) {
			addCriterion("wuid not between", value1, value2, "wuid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidIsNull() {
			addCriterion("wcaid is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidIsNotNull() {
			addCriterion("wcaid is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidEqualTo(Long value) {
			addCriterion("wcaid =", value, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidNotEqualTo(Long value) {
			addCriterion("wcaid <>", value, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidGreaterThan(Long value) {
			addCriterion("wcaid >", value, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidGreaterThanOrEqualTo(Long value) {
			addCriterion("wcaid >=", value, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidLessThan(Long value) {
			addCriterion("wcaid <", value, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidLessThanOrEqualTo(Long value) {
			addCriterion("wcaid <=", value, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidIn(List<Long> values) {
			addCriterion("wcaid in", values, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidNotIn(List<Long> values) {
			addCriterion("wcaid not in", values, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidBetween(Long value1, Long value2) {
			addCriterion("wcaid between", value1, value2, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andWcaidNotBetween(Long value1, Long value2) {
			addCriterion("wcaid not between", value1, value2, "wcaid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidIsNull() {
			addCriterion("openid is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidIsNotNull() {
			addCriterion("openid is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidEqualTo(String value) {
			addCriterion("openid =", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidNotEqualTo(String value) {
			addCriterion("openid <>", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidGreaterThan(String value) {
			addCriterion("openid >", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidGreaterThanOrEqualTo(String value) {
			addCriterion("openid >=", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidLessThan(String value) {
			addCriterion("openid <", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidLessThanOrEqualTo(String value) {
			addCriterion("openid <=", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidLike(String value) {
			addCriterion("openid like", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidNotLike(String value) {
			addCriterion("openid not like", value, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidIn(List<String> values) {
			addCriterion("openid in", values, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidNotIn(List<String> values) {
			addCriterion("openid not in", values, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidBetween(String value1, String value2) {
			addCriterion("openid between", value1, value2, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andOpenidNotBetween(String value1, String value2) {
			addCriterion("openid not between", value1, value2, "openid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameIsNull() {
			addCriterion("nickname is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameIsNotNull() {
			addCriterion("nickname is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameEqualTo(String value) {
			addCriterion("nickname =", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameNotEqualTo(String value) {
			addCriterion("nickname <>", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameGreaterThan(String value) {
			addCriterion("nickname >", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameGreaterThanOrEqualTo(String value) {
			addCriterion("nickname >=", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameLessThan(String value) {
			addCriterion("nickname <", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameLessThanOrEqualTo(String value) {
			addCriterion("nickname <=", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameLike(String value) {
			addCriterion("nickname like", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameNotLike(String value) {
			addCriterion("nickname not like", value, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameIn(List<String> values) {
			addCriterion("nickname in", values, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameNotIn(List<String> values) {
			addCriterion("nickname not in", values, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameBetween(String value1, String value2) {
			addCriterion("nickname between", value1, value2, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andNicknameNotBetween(String value1, String value2) {
			addCriterion("nickname not between", value1, value2, "nickname");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlIsNull() {
			addCriterion("headimgurl is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlIsNotNull() {
			addCriterion("headimgurl is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlEqualTo(String value) {
			addCriterion("headimgurl =", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlNotEqualTo(String value) {
			addCriterion("headimgurl <>", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlGreaterThan(String value) {
			addCriterion("headimgurl >", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
			addCriterion("headimgurl >=", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlLessThan(String value) {
			addCriterion("headimgurl <", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlLessThanOrEqualTo(String value) {
			addCriterion("headimgurl <=", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlLike(String value) {
			addCriterion("headimgurl like", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlNotLike(String value) {
			addCriterion("headimgurl not like", value, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlIn(List<String> values) {
			addCriterion("headimgurl in", values, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlNotIn(List<String> values) {
			addCriterion("headimgurl not in", values, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlBetween(String value1, String value2) {
			addCriterion("headimgurl between", value1, value2, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andHeadimgurlNotBetween(String value1, String value2) {
			addCriterion("headimgurl not between", value1, value2, "headimgurl");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexEqualTo(Integer value) {
			addCriterion("sex =", value, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexNotEqualTo(Integer value) {
			addCriterion("sex <>", value, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexGreaterThan(Integer value) {
			addCriterion("sex >", value, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("sex >=", value, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexLessThan(Integer value) {
			addCriterion("sex <", value, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexLessThanOrEqualTo(Integer value) {
			addCriterion("sex <=", value, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexIn(List<Integer> values) {
			addCriterion("sex in", values, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexNotIn(List<Integer> values) {
			addCriterion("sex not in", values, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexBetween(Integer value1, Integer value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSexNotBetween(Integer value1, Integer value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryIsNull() {
			addCriterion("country is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryIsNotNull() {
			addCriterion("country is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryEqualTo(String value) {
			addCriterion("country =", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryNotEqualTo(String value) {
			addCriterion("country <>", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryGreaterThan(String value) {
			addCriterion("country >", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryGreaterThanOrEqualTo(String value) {
			addCriterion("country >=", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryLessThan(String value) {
			addCriterion("country <", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryLessThanOrEqualTo(String value) {
			addCriterion("country <=", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryLike(String value) {
			addCriterion("country like", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryNotLike(String value) {
			addCriterion("country not like", value, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryIn(List<String> values) {
			addCriterion("country in", values, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryNotIn(List<String> values) {
			addCriterion("country not in", values, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryBetween(String value1, String value2) {
			addCriterion("country between", value1, value2, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCountryNotBetween(String value1, String value2) {
			addCriterion("country not between", value1, value2, "country");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceIsNull() {
			addCriterion("province is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceIsNotNull() {
			addCriterion("province is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceEqualTo(String value) {
			addCriterion("province =", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceNotEqualTo(String value) {
			addCriterion("province <>", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceGreaterThan(String value) {
			addCriterion("province >", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("province >=", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceLessThan(String value) {
			addCriterion("province <", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceLessThanOrEqualTo(String value) {
			addCriterion("province <=", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceLike(String value) {
			addCriterion("province like", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceNotLike(String value) {
			addCriterion("province not like", value, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceIn(List<String> values) {
			addCriterion("province in", values, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceNotIn(List<String> values) {
			addCriterion("province not in", values, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceBetween(String value1, String value2) {
			addCriterion("province between", value1, value2, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andProvinceNotBetween(String value1, String value2) {
			addCriterion("province not between", value1, value2, "province");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityIsNull() {
			addCriterion("city is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityIsNotNull() {
			addCriterion("city is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityEqualTo(String value) {
			addCriterion("city =", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityNotEqualTo(String value) {
			addCriterion("city <>", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityGreaterThan(String value) {
			addCriterion("city >", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityGreaterThanOrEqualTo(String value) {
			addCriterion("city >=", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityLessThan(String value) {
			addCriterion("city <", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityLessThanOrEqualTo(String value) {
			addCriterion("city <=", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityLike(String value) {
			addCriterion("city like", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityNotLike(String value) {
			addCriterion("city not like", value, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityIn(List<String> values) {
			addCriterion("city in", values, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityNotIn(List<String> values) {
			addCriterion("city not in", values, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityBetween(String value1, String value2) {
			addCriterion("city between", value1, value2, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCityNotBetween(String value1, String value2) {
			addCriterion("city not between", value1, value2, "city");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeIsNull() {
			addCriterion("privilege is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeIsNotNull() {
			addCriterion("privilege is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeEqualTo(String value) {
			addCriterion("privilege =", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeNotEqualTo(String value) {
			addCriterion("privilege <>", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeGreaterThan(String value) {
			addCriterion("privilege >", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeGreaterThanOrEqualTo(String value) {
			addCriterion("privilege >=", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeLessThan(String value) {
			addCriterion("privilege <", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeLessThanOrEqualTo(String value) {
			addCriterion("privilege <=", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeLike(String value) {
			addCriterion("privilege like", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeNotLike(String value) {
			addCriterion("privilege not like", value, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeIn(List<String> values) {
			addCriterion("privilege in", values, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeNotIn(List<String> values) {
			addCriterion("privilege not in", values, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeBetween(String value1, String value2) {
			addCriterion("privilege between", value1, value2, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andPrivilegeNotBetween(String value1, String value2) {
			addCriterion("privilege not between", value1, value2, "privilege");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidIsNull() {
			addCriterion("unionid is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidIsNotNull() {
			addCriterion("unionid is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidEqualTo(String value) {
			addCriterion("unionid =", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidNotEqualTo(String value) {
			addCriterion("unionid <>", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidGreaterThan(String value) {
			addCriterion("unionid >", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidGreaterThanOrEqualTo(String value) {
			addCriterion("unionid >=", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidLessThan(String value) {
			addCriterion("unionid <", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidLessThanOrEqualTo(String value) {
			addCriterion("unionid <=", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidLike(String value) {
			addCriterion("unionid like", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidNotLike(String value) {
			addCriterion("unionid not like", value, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidIn(List<String> values) {
			addCriterion("unionid in", values, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidNotIn(List<String> values) {
			addCriterion("unionid not in", values, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidBetween(String value1, String value2) {
			addCriterion("unionid between", value1, value2, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUnionidNotBetween(String value1, String value2) {
			addCriterion("unionid not between", value1, value2, "unionid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidIsNull() {
			addCriterion("groupid is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidIsNotNull() {
			addCriterion("groupid is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidEqualTo(String value) {
			addCriterion("groupid =", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidNotEqualTo(String value) {
			addCriterion("groupid <>", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidGreaterThan(String value) {
			addCriterion("groupid >", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidGreaterThanOrEqualTo(String value) {
			addCriterion("groupid >=", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidLessThan(String value) {
			addCriterion("groupid <", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidLessThanOrEqualTo(String value) {
			addCriterion("groupid <=", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidLike(String value) {
			addCriterion("groupid like", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidNotLike(String value) {
			addCriterion("groupid not like", value, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidIn(List<String> values) {
			addCriterion("groupid in", values, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidNotIn(List<String> values) {
			addCriterion("groupid not in", values, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidBetween(String value1, String value2) {
			addCriterion("groupid between", value1, value2, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andGroupidNotBetween(String value1, String value2) {
			addCriterion("groupid not between", value1, value2, "groupid");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableIsNull() {
			addCriterion("flag_enable is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableIsNotNull() {
			addCriterion("flag_enable is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableEqualTo(Integer value) {
			addCriterion("flag_enable =", value, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableNotEqualTo(Integer value) {
			addCriterion("flag_enable <>", value, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableGreaterThan(Integer value) {
			addCriterion("flag_enable >", value, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_enable >=", value, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableLessThan(Integer value) {
			addCriterion("flag_enable <", value, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
			addCriterion("flag_enable <=", value, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableIn(List<Integer> values) {
			addCriterion("flag_enable in", values, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableNotIn(List<Integer> values) {
			addCriterion("flag_enable not in", values, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable between", value1, value2, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_enable not between", value1, value2, "flagEnable");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeIsNull() {
			addCriterion("subscribe_time is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeIsNotNull() {
			addCriterion("subscribe_time is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeEqualTo(String value) {
			addCriterion("subscribe_time =", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeNotEqualTo(String value) {
			addCriterion("subscribe_time <>", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeGreaterThan(String value) {
			addCriterion("subscribe_time >", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeGreaterThanOrEqualTo(String value) {
			addCriterion("subscribe_time >=", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeLessThan(String value) {
			addCriterion("subscribe_time <", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeLessThanOrEqualTo(String value) {
			addCriterion("subscribe_time <=", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeLike(String value) {
			addCriterion("subscribe_time like", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeNotLike(String value) {
			addCriterion("subscribe_time not like", value, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeIn(List<String> values) {
			addCriterion("subscribe_time in", values, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeNotIn(List<String> values) {
			addCriterion("subscribe_time not in", values, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeBetween(String value1, String value2) {
			addCriterion("subscribe_time between", value1, value2, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andSubscribeTimeNotBetween(String value1, String value2) {
			addCriterion("subscribe_time not between", value1, value2, "subscribeTime");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (WxUserExample.Criteria) this;
		}

		public WxUserExample.Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (WxUserExample.Criteria) this;
		}
	}

	public static class Criteria extends WxUserExample.GeneratedCriteria {
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
