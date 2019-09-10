package com.aidoctor.decisiontree.entity;

import java.util.ArrayList;
import java.util.List;

public class SystemRefSymptomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemRefSymptomExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeIsNull() {
            addCriterion("sympyom_code is null");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeIsNotNull() {
            addCriterion("sympyom_code is not null");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeEqualTo(String value) {
            addCriterion("sympyom_code =", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeNotEqualTo(String value) {
            addCriterion("sympyom_code <>", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeGreaterThan(String value) {
            addCriterion("sympyom_code >", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sympyom_code >=", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeLessThan(String value) {
            addCriterion("sympyom_code <", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeLessThanOrEqualTo(String value) {
            addCriterion("sympyom_code <=", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeLike(String value) {
            addCriterion("sympyom_code like", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeNotLike(String value) {
            addCriterion("sympyom_code not like", value, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeIn(List<String> values) {
            addCriterion("sympyom_code in", values, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeNotIn(List<String> values) {
            addCriterion("sympyom_code not in", values, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeBetween(String value1, String value2) {
            addCriterion("sympyom_code between", value1, value2, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomCodeNotBetween(String value1, String value2) {
            addCriterion("sympyom_code not between", value1, value2, "sympyomCode");
            return (Criteria) this;
        }

        public Criteria andSympyomNameIsNull() {
            addCriterion("sympyom_name is null");
            return (Criteria) this;
        }

        public Criteria andSympyomNameIsNotNull() {
            addCriterion("sympyom_name is not null");
            return (Criteria) this;
        }

        public Criteria andSympyomNameEqualTo(String value) {
            addCriterion("sympyom_name =", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameNotEqualTo(String value) {
            addCriterion("sympyom_name <>", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameGreaterThan(String value) {
            addCriterion("sympyom_name >", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameGreaterThanOrEqualTo(String value) {
            addCriterion("sympyom_name >=", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameLessThan(String value) {
            addCriterion("sympyom_name <", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameLessThanOrEqualTo(String value) {
            addCriterion("sympyom_name <=", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameLike(String value) {
            addCriterion("sympyom_name like", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameNotLike(String value) {
            addCriterion("sympyom_name not like", value, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameIn(List<String> values) {
            addCriterion("sympyom_name in", values, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameNotIn(List<String> values) {
            addCriterion("sympyom_name not in", values, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameBetween(String value1, String value2) {
            addCriterion("sympyom_name between", value1, value2, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andSympyomNameNotBetween(String value1, String value2) {
            addCriterion("sympyom_name not between", value1, value2, "sympyomName");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumIsNull() {
            addCriterion("decision_tree_num is null");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumIsNotNull() {
            addCriterion("decision_tree_num is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumEqualTo(String value) {
            addCriterion("decision_tree_num =", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumNotEqualTo(String value) {
            addCriterion("decision_tree_num <>", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumGreaterThan(String value) {
            addCriterion("decision_tree_num >", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumGreaterThanOrEqualTo(String value) {
            addCriterion("decision_tree_num >=", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumLessThan(String value) {
            addCriterion("decision_tree_num <", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumLessThanOrEqualTo(String value) {
            addCriterion("decision_tree_num <=", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumLike(String value) {
            addCriterion("decision_tree_num like", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumNotLike(String value) {
            addCriterion("decision_tree_num not like", value, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumIn(List<String> values) {
            addCriterion("decision_tree_num in", values, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumNotIn(List<String> values) {
            addCriterion("decision_tree_num not in", values, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumBetween(String value1, String value2) {
            addCriterion("decision_tree_num between", value1, value2, "decisionTreeNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeNumNotBetween(String value1, String value2) {
            addCriterion("decision_tree_num not between", value1, value2, "decisionTreeNum");
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