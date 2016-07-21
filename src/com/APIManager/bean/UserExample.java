package com.APIManager.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUlIdIsNull() {
            addCriterion("ul_id is null");
            return (Criteria) this;
        }

        public Criteria andUlIdIsNotNull() {
            addCriterion("ul_id is not null");
            return (Criteria) this;
        }

        public Criteria andUlIdEqualTo(Integer value) {
            addCriterion("ul_id =", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotEqualTo(Integer value) {
            addCriterion("ul_id <>", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThan(Integer value) {
            addCriterion("ul_id >", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ul_id >=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThan(Integer value) {
            addCriterion("ul_id <", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThanOrEqualTo(Integer value) {
            addCriterion("ul_id <=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdIn(List<Integer> values) {
            addCriterion("ul_id in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotIn(List<Integer> values) {
            addCriterion("ul_id not in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdBetween(Integer value1, Integer value2) {
            addCriterion("ul_id between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ul_id not between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlNameIsNull() {
            addCriterion("ul_name is null");
            return (Criteria) this;
        }

        public Criteria andUlNameIsNotNull() {
            addCriterion("ul_name is not null");
            return (Criteria) this;
        }

        public Criteria andUlNameEqualTo(String value) {
            addCriterion("ul_name =", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotEqualTo(String value) {
            addCriterion("ul_name <>", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameGreaterThan(String value) {
            addCriterion("ul_name >", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameGreaterThanOrEqualTo(String value) {
            addCriterion("ul_name >=", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameLessThan(String value) {
            addCriterion("ul_name <", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameLessThanOrEqualTo(String value) {
            addCriterion("ul_name <=", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameLike(String value) {
            addCriterion("ul_name like", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotLike(String value) {
            addCriterion("ul_name not like", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameIn(List<String> values) {
            addCriterion("ul_name in", values, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotIn(List<String> values) {
            addCriterion("ul_name not in", values, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameBetween(String value1, String value2) {
            addCriterion("ul_name between", value1, value2, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotBetween(String value1, String value2) {
            addCriterion("ul_name not between", value1, value2, "ulName");
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