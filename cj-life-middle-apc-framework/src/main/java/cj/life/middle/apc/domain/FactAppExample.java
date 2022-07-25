package cj.life.middle.apc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FactAppExample {
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
    public FactAppExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(String value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(String value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(String value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(String value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(String value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(String value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLike(String value) {
            addCriterion("cate_id like", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotLike(String value) {
            addCriterion("cate_id not like", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<String> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<String> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(String value1, String value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(String value1, String value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("terminal_id is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("terminal_id is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("terminal_id =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("terminal_id <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("terminal_id >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_id >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("terminal_id <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("terminal_id <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("terminal_id like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("terminal_id not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("terminal_id in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("terminal_id not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("terminal_id between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("terminal_id not between", value1, value2, "terminalId");
            return (Criteria) this;
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

        public Criteria andChargeModeIsNull() {
            addCriterion("charge_mode is null");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNotNull() {
            addCriterion("charge_mode is not null");
            return (Criteria) this;
        }

        public Criteria andChargeModeEqualTo(String value) {
            addCriterion("charge_mode =", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotEqualTo(String value) {
            addCriterion("charge_mode <>", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThan(String value) {
            addCriterion("charge_mode >", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_mode >=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThan(String value) {
            addCriterion("charge_mode <", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThanOrEqualTo(String value) {
            addCriterion("charge_mode <=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLike(String value) {
            addCriterion("charge_mode like", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotLike(String value) {
            addCriterion("charge_mode not like", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeIn(List<String> values) {
            addCriterion("charge_mode in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotIn(List<String> values) {
            addCriterion("charge_mode not in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeBetween(String value1, String value2) {
            addCriterion("charge_mode between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotBetween(String value1, String value2) {
            addCriterion("charge_mode not between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppIconIsNull() {
            addCriterion("app_icon is null");
            return (Criteria) this;
        }

        public Criteria andAppIconIsNotNull() {
            addCriterion("app_icon is not null");
            return (Criteria) this;
        }

        public Criteria andAppIconEqualTo(String value) {
            addCriterion("app_icon =", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconNotEqualTo(String value) {
            addCriterion("app_icon <>", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconGreaterThan(String value) {
            addCriterion("app_icon >", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconGreaterThanOrEqualTo(String value) {
            addCriterion("app_icon >=", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconLessThan(String value) {
            addCriterion("app_icon <", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconLessThanOrEqualTo(String value) {
            addCriterion("app_icon <=", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconLike(String value) {
            addCriterion("app_icon like", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconNotLike(String value) {
            addCriterion("app_icon not like", value, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconIn(List<String> values) {
            addCriterion("app_icon in", values, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconNotIn(List<String> values) {
            addCriterion("app_icon not in", values, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconBetween(String value1, String value2) {
            addCriterion("app_icon between", value1, value2, "appIcon");
            return (Criteria) this;
        }

        public Criteria andAppIconNotBetween(String value1, String value2) {
            addCriterion("app_icon not between", value1, value2, "appIcon");
            return (Criteria) this;
        }

        public Criteria andNewestVersionIsNull() {
            addCriterion("newest_version is null");
            return (Criteria) this;
        }

        public Criteria andNewestVersionIsNotNull() {
            addCriterion("newest_version is not null");
            return (Criteria) this;
        }

        public Criteria andNewestVersionEqualTo(String value) {
            addCriterion("newest_version =", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionNotEqualTo(String value) {
            addCriterion("newest_version <>", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionGreaterThan(String value) {
            addCriterion("newest_version >", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionGreaterThanOrEqualTo(String value) {
            addCriterion("newest_version >=", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionLessThan(String value) {
            addCriterion("newest_version <", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionLessThanOrEqualTo(String value) {
            addCriterion("newest_version <=", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionLike(String value) {
            addCriterion("newest_version like", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionNotLike(String value) {
            addCriterion("newest_version not like", value, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionIn(List<String> values) {
            addCriterion("newest_version in", values, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionNotIn(List<String> values) {
            addCriterion("newest_version not in", values, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionBetween(String value1, String value2) {
            addCriterion("newest_version between", value1, value2, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andNewestVersionNotBetween(String value1, String value2) {
            addCriterion("newest_version not between", value1, value2, "newestVersion");
            return (Criteria) this;
        }

        public Criteria andPubTimeIsNull() {
            addCriterion("pub_time is null");
            return (Criteria) this;
        }

        public Criteria andPubTimeIsNotNull() {
            addCriterion("pub_time is not null");
            return (Criteria) this;
        }

        public Criteria andPubTimeEqualTo(String value) {
            addCriterion("pub_time =", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotEqualTo(String value) {
            addCriterion("pub_time <>", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeGreaterThan(String value) {
            addCriterion("pub_time >", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pub_time >=", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeLessThan(String value) {
            addCriterion("pub_time <", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeLessThanOrEqualTo(String value) {
            addCriterion("pub_time <=", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeLike(String value) {
            addCriterion("pub_time like", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotLike(String value) {
            addCriterion("pub_time not like", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeIn(List<String> values) {
            addCriterion("pub_time in", values, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotIn(List<String> values) {
            addCriterion("pub_time not in", values, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeBetween(String value1, String value2) {
            addCriterion("pub_time between", value1, value2, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotBetween(String value1, String value2) {
            addCriterion("pub_time not between", value1, value2, "pubTime");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperIsNull() {
            addCriterion("app_developer is null");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperIsNotNull() {
            addCriterion("app_developer is not null");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperEqualTo(String value) {
            addCriterion("app_developer =", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperNotEqualTo(String value) {
            addCriterion("app_developer <>", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperGreaterThan(String value) {
            addCriterion("app_developer >", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("app_developer >=", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperLessThan(String value) {
            addCriterion("app_developer <", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperLessThanOrEqualTo(String value) {
            addCriterion("app_developer <=", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperLike(String value) {
            addCriterion("app_developer like", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperNotLike(String value) {
            addCriterion("app_developer not like", value, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperIn(List<String> values) {
            addCriterion("app_developer in", values, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperNotIn(List<String> values) {
            addCriterion("app_developer not in", values, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperBetween(String value1, String value2) {
            addCriterion("app_developer between", value1, value2, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppDeveloperNotBetween(String value1, String value2) {
            addCriterion("app_developer not between", value1, value2, "appDeveloper");
            return (Criteria) this;
        }

        public Criteria andAppSupplierIsNull() {
            addCriterion("app_supplier is null");
            return (Criteria) this;
        }

        public Criteria andAppSupplierIsNotNull() {
            addCriterion("app_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andAppSupplierEqualTo(String value) {
            addCriterion("app_supplier =", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierNotEqualTo(String value) {
            addCriterion("app_supplier <>", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierGreaterThan(String value) {
            addCriterion("app_supplier >", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("app_supplier >=", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierLessThan(String value) {
            addCriterion("app_supplier <", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierLessThanOrEqualTo(String value) {
            addCriterion("app_supplier <=", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierLike(String value) {
            addCriterion("app_supplier like", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierNotLike(String value) {
            addCriterion("app_supplier not like", value, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierIn(List<String> values) {
            addCriterion("app_supplier in", values, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierNotIn(List<String> values) {
            addCriterion("app_supplier not in", values, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierBetween(String value1, String value2) {
            addCriterion("app_supplier between", value1, value2, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppSupplierNotBetween(String value1, String value2) {
            addCriterion("app_supplier not between", value1, value2, "appSupplier");
            return (Criteria) this;
        }

        public Criteria andAppTenantIsNull() {
            addCriterion("app_tenant is null");
            return (Criteria) this;
        }

        public Criteria andAppTenantIsNotNull() {
            addCriterion("app_tenant is not null");
            return (Criteria) this;
        }

        public Criteria andAppTenantEqualTo(String value) {
            addCriterion("app_tenant =", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantNotEqualTo(String value) {
            addCriterion("app_tenant <>", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantGreaterThan(String value) {
            addCriterion("app_tenant >", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantGreaterThanOrEqualTo(String value) {
            addCriterion("app_tenant >=", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantLessThan(String value) {
            addCriterion("app_tenant <", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantLessThanOrEqualTo(String value) {
            addCriterion("app_tenant <=", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantLike(String value) {
            addCriterion("app_tenant like", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantNotLike(String value) {
            addCriterion("app_tenant not like", value, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantIn(List<String> values) {
            addCriterion("app_tenant in", values, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantNotIn(List<String> values) {
            addCriterion("app_tenant not in", values, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantBetween(String value1, String value2) {
            addCriterion("app_tenant between", value1, value2, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppTenantNotBetween(String value1, String value2) {
            addCriterion("app_tenant not between", value1, value2, "appTenant");
            return (Criteria) this;
        }

        public Criteria andAppSloganIsNull() {
            addCriterion("app_slogan is null");
            return (Criteria) this;
        }

        public Criteria andAppSloganIsNotNull() {
            addCriterion("app_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andAppSloganEqualTo(String value) {
            addCriterion("app_slogan =", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganNotEqualTo(String value) {
            addCriterion("app_slogan <>", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganGreaterThan(String value) {
            addCriterion("app_slogan >", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganGreaterThanOrEqualTo(String value) {
            addCriterion("app_slogan >=", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganLessThan(String value) {
            addCriterion("app_slogan <", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganLessThanOrEqualTo(String value) {
            addCriterion("app_slogan <=", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganLike(String value) {
            addCriterion("app_slogan like", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganNotLike(String value) {
            addCriterion("app_slogan not like", value, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganIn(List<String> values) {
            addCriterion("app_slogan in", values, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganNotIn(List<String> values) {
            addCriterion("app_slogan not in", values, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganBetween(String value1, String value2) {
            addCriterion("app_slogan between", value1, value2, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andAppSloganNotBetween(String value1, String value2) {
            addCriterion("app_slogan not between", value1, value2, "appSlogan");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceIsNull() {
            addCriterion("empl_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceIsNotNull() {
            addCriterion("empl_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceEqualTo(BigDecimal value) {
            addCriterion("empl_unit_price =", value, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("empl_unit_price <>", value, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("empl_unit_price >", value, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("empl_unit_price >=", value, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceLessThan(BigDecimal value) {
            addCriterion("empl_unit_price <", value, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("empl_unit_price <=", value, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceIn(List<BigDecimal> values) {
            addCriterion("empl_unit_price in", values, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("empl_unit_price not in", values, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("empl_unit_price between", value1, value2, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andEmplUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("empl_unit_price not between", value1, value2, "emplUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceIsNull() {
            addCriterion("tenant_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceIsNotNull() {
            addCriterion("tenant_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceEqualTo(BigDecimal value) {
            addCriterion("tenant_unit_price =", value, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("tenant_unit_price <>", value, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("tenant_unit_price >", value, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tenant_unit_price >=", value, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceLessThan(BigDecimal value) {
            addCriterion("tenant_unit_price <", value, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tenant_unit_price <=", value, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceIn(List<BigDecimal> values) {
            addCriterion("tenant_unit_price in", values, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("tenant_unit_price not in", values, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tenant_unit_price between", value1, value2, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTenantUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tenant_unit_price not between", value1, value2, "tenantUnitPrice");
            return (Criteria) this;
        }

        public Criteria andAppNoteIsNull() {
            addCriterion("app_note is null");
            return (Criteria) this;
        }

        public Criteria andAppNoteIsNotNull() {
            addCriterion("app_note is not null");
            return (Criteria) this;
        }

        public Criteria andAppNoteEqualTo(String value) {
            addCriterion("app_note =", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteNotEqualTo(String value) {
            addCriterion("app_note <>", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteGreaterThan(String value) {
            addCriterion("app_note >", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteGreaterThanOrEqualTo(String value) {
            addCriterion("app_note >=", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteLessThan(String value) {
            addCriterion("app_note <", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteLessThanOrEqualTo(String value) {
            addCriterion("app_note <=", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteLike(String value) {
            addCriterion("app_note like", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteNotLike(String value) {
            addCriterion("app_note not like", value, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteIn(List<String> values) {
            addCriterion("app_note in", values, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteNotIn(List<String> values) {
            addCriterion("app_note not in", values, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteBetween(String value1, String value2) {
            addCriterion("app_note between", value1, value2, "appNote");
            return (Criteria) this;
        }

        public Criteria andAppNoteNotBetween(String value1, String value2) {
            addCriterion("app_note not between", value1, value2, "appNote");
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