package com.dagather.fonme.exchange.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExCurrencyInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public ExCurrencyInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEciidIsNull() {
            addCriterion("eciid is null");
            return (Criteria) this;
        }

        public Criteria andEciidIsNotNull() {
            addCriterion("eciid is not null");
            return (Criteria) this;
        }

        public Criteria andEciidEqualTo(Long value) {
            addCriterion("eciid =", value, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidNotEqualTo(Long value) {
            addCriterion("eciid <>", value, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidGreaterThan(Long value) {
            addCriterion("eciid >", value, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidGreaterThanOrEqualTo(Long value) {
            addCriterion("eciid >=", value, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidLessThan(Long value) {
            addCriterion("eciid <", value, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidLessThanOrEqualTo(Long value) {
            addCriterion("eciid <=", value, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidIn(List<Long> values) {
            addCriterion("eciid in", values, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidNotIn(List<Long> values) {
            addCriterion("eciid not in", values, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidBetween(Long value1, Long value2) {
            addCriterion("eciid between", value1, value2, "eciid");
            return (Criteria) this;
        }

        public Criteria andEciidNotBetween(Long value1, Long value2) {
            addCriterion("eciid not between", value1, value2, "eciid");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhIsNull() {
            addCriterion("currency_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhIsNotNull() {
            addCriterion("currency_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhEqualTo(String value) {
            addCriterion("currency_name_zh =", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhNotEqualTo(String value) {
            addCriterion("currency_name_zh <>", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhGreaterThan(String value) {
            addCriterion("currency_name_zh >", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("currency_name_zh >=", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhLessThan(String value) {
            addCriterion("currency_name_zh <", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhLessThanOrEqualTo(String value) {
            addCriterion("currency_name_zh <=", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhLike(String value) {
            addCriterion("currency_name_zh like", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhNotLike(String value) {
            addCriterion("currency_name_zh not like", value, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhIn(List<String> values) {
            addCriterion("currency_name_zh in", values, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhNotIn(List<String> values) {
            addCriterion("currency_name_zh not in", values, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhBetween(String value1, String value2) {
            addCriterion("currency_name_zh between", value1, value2, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameZhNotBetween(String value1, String value2) {
            addCriterion("currency_name_zh not between", value1, value2, "currencyNameZh");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnIsNull() {
            addCriterion("currency_name_en is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnIsNotNull() {
            addCriterion("currency_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnEqualTo(String value) {
            addCriterion("currency_name_en =", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnNotEqualTo(String value) {
            addCriterion("currency_name_en <>", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnGreaterThan(String value) {
            addCriterion("currency_name_en >", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("currency_name_en >=", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnLessThan(String value) {
            addCriterion("currency_name_en <", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnLessThanOrEqualTo(String value) {
            addCriterion("currency_name_en <=", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnLike(String value) {
            addCriterion("currency_name_en like", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnNotLike(String value) {
            addCriterion("currency_name_en not like", value, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnIn(List<String> values) {
            addCriterion("currency_name_en in", values, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnNotIn(List<String> values) {
            addCriterion("currency_name_en not in", values, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnBetween(String value1, String value2) {
            addCriterion("currency_name_en between", value1, value2, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEnNotBetween(String value1, String value2) {
            addCriterion("currency_name_en not between", value1, value2, "currencyNameEn");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("currency_code is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("currency_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("currency_code =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("currency_code <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("currency_code >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_code >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("currency_code <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("currency_code <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("currency_code like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("currency_code not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("currency_code in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("currency_code not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("currency_code between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("currency_code not between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andFlagEnableIsNull() {
            addCriterion("flag_enable is null");
            return (Criteria) this;
        }

        public Criteria andFlagEnableIsNotNull() {
            addCriterion("flag_enable is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEnableEqualTo(Integer value) {
            addCriterion("flag_enable =", value, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableNotEqualTo(Integer value) {
            addCriterion("flag_enable <>", value, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableGreaterThan(Integer value) {
            addCriterion("flag_enable >", value, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_enable >=", value, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableLessThan(Integer value) {
            addCriterion("flag_enable <", value, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableLessThanOrEqualTo(Integer value) {
            addCriterion("flag_enable <=", value, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableIn(List<Integer> values) {
            addCriterion("flag_enable in", values, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableNotIn(List<Integer> values) {
            addCriterion("flag_enable not in", values, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableBetween(Integer value1, Integer value2) {
            addCriterion("flag_enable between", value1, value2, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andFlagEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_enable not between", value1, value2, "flagEnable");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fm_ex_currency_info
     *
     * @mbggenerated
     */
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
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
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