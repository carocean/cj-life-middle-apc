package cj.life.middle.apc.domain;

import java.util.ArrayList;
import java.util.List;

public class DimCountryExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public DimCountryExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(String value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(String value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(String value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(String value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(String value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLike(String value) {
            addCriterion("country_id like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotLike(String value) {
            addCriterion("country_id not like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<String> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<String> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(String value1, String value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(String value1, String value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNull() {
            addCriterion("cn_name is null");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNotNull() {
            addCriterion("cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNameEqualTo(String value) {
            addCriterion("cn_name =", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotEqualTo(String value) {
            addCriterion("cn_name <>", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThan(String value) {
            addCriterion("cn_name >", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_name >=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThan(String value) {
            addCriterion("cn_name <", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThanOrEqualTo(String value) {
            addCriterion("cn_name <=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLike(String value) {
            addCriterion("cn_name like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotLike(String value) {
            addCriterion("cn_name not like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameIn(List<String> values) {
            addCriterion("cn_name in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotIn(List<String> values) {
            addCriterion("cn_name not in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameBetween(String value1, String value2) {
            addCriterion("cn_name between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotBetween(String value1, String value2) {
            addCriterion("cn_name not between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeIsNull() {
            addCriterion("alpha2_code is null");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeIsNotNull() {
            addCriterion("alpha2_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeEqualTo(String value) {
            addCriterion("alpha2_code =", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeNotEqualTo(String value) {
            addCriterion("alpha2_code <>", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeGreaterThan(String value) {
            addCriterion("alpha2_code >", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("alpha2_code >=", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeLessThan(String value) {
            addCriterion("alpha2_code <", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeLessThanOrEqualTo(String value) {
            addCriterion("alpha2_code <=", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeLike(String value) {
            addCriterion("alpha2_code like", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeNotLike(String value) {
            addCriterion("alpha2_code not like", value, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeIn(List<String> values) {
            addCriterion("alpha2_code in", values, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeNotIn(List<String> values) {
            addCriterion("alpha2_code not in", values, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeBetween(String value1, String value2) {
            addCriterion("alpha2_code between", value1, value2, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha2CodeNotBetween(String value1, String value2) {
            addCriterion("alpha2_code not between", value1, value2, "alpha2Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeIsNull() {
            addCriterion("alpha3_code is null");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeIsNotNull() {
            addCriterion("alpha3_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeEqualTo(String value) {
            addCriterion("alpha3_code =", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeNotEqualTo(String value) {
            addCriterion("alpha3_code <>", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeGreaterThan(String value) {
            addCriterion("alpha3_code >", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("alpha3_code >=", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeLessThan(String value) {
            addCriterion("alpha3_code <", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeLessThanOrEqualTo(String value) {
            addCriterion("alpha3_code <=", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeLike(String value) {
            addCriterion("alpha3_code like", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeNotLike(String value) {
            addCriterion("alpha3_code not like", value, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeIn(List<String> values) {
            addCriterion("alpha3_code in", values, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeNotIn(List<String> values) {
            addCriterion("alpha3_code not in", values, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeBetween(String value1, String value2) {
            addCriterion("alpha3_code between", value1, value2, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andAlpha3CodeNotBetween(String value1, String value2) {
            addCriterion("alpha3_code not between", value1, value2, "alpha3Code");
            return (Criteria) this;
        }

        public Criteria andNumericCodeIsNull() {
            addCriterion("numeric_code is null");
            return (Criteria) this;
        }

        public Criteria andNumericCodeIsNotNull() {
            addCriterion("numeric_code is not null");
            return (Criteria) this;
        }

        public Criteria andNumericCodeEqualTo(String value) {
            addCriterion("numeric_code =", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeNotEqualTo(String value) {
            addCriterion("numeric_code <>", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeGreaterThan(String value) {
            addCriterion("numeric_code >", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeGreaterThanOrEqualTo(String value) {
            addCriterion("numeric_code >=", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeLessThan(String value) {
            addCriterion("numeric_code <", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeLessThanOrEqualTo(String value) {
            addCriterion("numeric_code <=", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeLike(String value) {
            addCriterion("numeric_code like", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeNotLike(String value) {
            addCriterion("numeric_code not like", value, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeIn(List<String> values) {
            addCriterion("numeric_code in", values, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeNotIn(List<String> values) {
            addCriterion("numeric_code not in", values, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeBetween(String value1, String value2) {
            addCriterion("numeric_code between", value1, value2, "numericCode");
            return (Criteria) this;
        }

        public Criteria andNumericCodeNotBetween(String value1, String value2) {
            addCriterion("numeric_code not between", value1, value2, "numericCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
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