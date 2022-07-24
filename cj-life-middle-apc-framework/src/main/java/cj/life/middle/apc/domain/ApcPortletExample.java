package cj.life.middle.apc.domain;

import java.util.ArrayList;
import java.util.List;

public class ApcPortletExample {
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
    public ApcPortletExample() {
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

        public Criteria andPortletIdIsNull() {
            addCriterion("portlet_id is null");
            return (Criteria) this;
        }

        public Criteria andPortletIdIsNotNull() {
            addCriterion("portlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortletIdEqualTo(String value) {
            addCriterion("portlet_id =", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotEqualTo(String value) {
            addCriterion("portlet_id <>", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdGreaterThan(String value) {
            addCriterion("portlet_id >", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdGreaterThanOrEqualTo(String value) {
            addCriterion("portlet_id >=", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLessThan(String value) {
            addCriterion("portlet_id <", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLessThanOrEqualTo(String value) {
            addCriterion("portlet_id <=", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLike(String value) {
            addCriterion("portlet_id like", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotLike(String value) {
            addCriterion("portlet_id not like", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdIn(List<String> values) {
            addCriterion("portlet_id in", values, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotIn(List<String> values) {
            addCriterion("portlet_id not in", values, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdBetween(String value1, String value2) {
            addCriterion("portlet_id between", value1, value2, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotBetween(String value1, String value2) {
            addCriterion("portlet_id not between", value1, value2, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletNameIsNull() {
            addCriterion("portlet_name is null");
            return (Criteria) this;
        }

        public Criteria andPortletNameIsNotNull() {
            addCriterion("portlet_name is not null");
            return (Criteria) this;
        }

        public Criteria andPortletNameEqualTo(String value) {
            addCriterion("portlet_name =", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotEqualTo(String value) {
            addCriterion("portlet_name <>", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameGreaterThan(String value) {
            addCriterion("portlet_name >", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameGreaterThanOrEqualTo(String value) {
            addCriterion("portlet_name >=", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameLessThan(String value) {
            addCriterion("portlet_name <", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameLessThanOrEqualTo(String value) {
            addCriterion("portlet_name <=", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameLike(String value) {
            addCriterion("portlet_name like", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotLike(String value) {
            addCriterion("portlet_name not like", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameIn(List<String> values) {
            addCriterion("portlet_name in", values, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotIn(List<String> values) {
            addCriterion("portlet_name not in", values, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameBetween(String value1, String value2) {
            addCriterion("portlet_name between", value1, value2, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotBetween(String value1, String value2) {
            addCriterion("portlet_name not between", value1, value2, "portletName");
            return (Criteria) this;
        }

        public Criteria andShowModeIsNull() {
            addCriterion("show_mode is null");
            return (Criteria) this;
        }

        public Criteria andShowModeIsNotNull() {
            addCriterion("show_mode is not null");
            return (Criteria) this;
        }

        public Criteria andShowModeEqualTo(String value) {
            addCriterion("show_mode =", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeNotEqualTo(String value) {
            addCriterion("show_mode <>", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeGreaterThan(String value) {
            addCriterion("show_mode >", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeGreaterThanOrEqualTo(String value) {
            addCriterion("show_mode >=", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeLessThan(String value) {
            addCriterion("show_mode <", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeLessThanOrEqualTo(String value) {
            addCriterion("show_mode <=", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeLike(String value) {
            addCriterion("show_mode like", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeNotLike(String value) {
            addCriterion("show_mode not like", value, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeIn(List<String> values) {
            addCriterion("show_mode in", values, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeNotIn(List<String> values) {
            addCriterion("show_mode not in", values, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeBetween(String value1, String value2) {
            addCriterion("show_mode between", value1, value2, "showMode");
            return (Criteria) this;
        }

        public Criteria andShowModeNotBetween(String value1, String value2) {
            addCriterion("show_mode not between", value1, value2, "showMode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPortletNoteIsNull() {
            addCriterion("portlet_note is null");
            return (Criteria) this;
        }

        public Criteria andPortletNoteIsNotNull() {
            addCriterion("portlet_note is not null");
            return (Criteria) this;
        }

        public Criteria andPortletNoteEqualTo(String value) {
            addCriterion("portlet_note =", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteNotEqualTo(String value) {
            addCriterion("portlet_note <>", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteGreaterThan(String value) {
            addCriterion("portlet_note >", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteGreaterThanOrEqualTo(String value) {
            addCriterion("portlet_note >=", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteLessThan(String value) {
            addCriterion("portlet_note <", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteLessThanOrEqualTo(String value) {
            addCriterion("portlet_note <=", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteLike(String value) {
            addCriterion("portlet_note like", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteNotLike(String value) {
            addCriterion("portlet_note not like", value, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteIn(List<String> values) {
            addCriterion("portlet_note in", values, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteNotIn(List<String> values) {
            addCriterion("portlet_note not in", values, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteBetween(String value1, String value2) {
            addCriterion("portlet_note between", value1, value2, "portletNote");
            return (Criteria) this;
        }

        public Criteria andPortletNoteNotBetween(String value1, String value2) {
            addCriterion("portlet_note not between", value1, value2, "portletNote");
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