package com.aidoctor.decisiontree.entity;

import java.util.ArrayList;
import java.util.List;

public class DiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseExample() {
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

        public Criteria andDiseaseCodeIsNull() {
            addCriterion("disease_code is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIsNotNull() {
            addCriterion("disease_code is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeEqualTo(String value) {
            addCriterion("disease_code =", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotEqualTo(String value) {
            addCriterion("disease_code <>", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeGreaterThan(String value) {
            addCriterion("disease_code >", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("disease_code >=", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLessThan(String value) {
            addCriterion("disease_code <", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLessThanOrEqualTo(String value) {
            addCriterion("disease_code <=", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLike(String value) {
            addCriterion("disease_code like", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotLike(String value) {
            addCriterion("disease_code not like", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIn(List<String> values) {
            addCriterion("disease_code in", values, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotIn(List<String> values) {
            addCriterion("disease_code not in", values, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeBetween(String value1, String value2) {
            addCriterion("disease_code between", value1, value2, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotBetween(String value1, String value2) {
            addCriterion("disease_code not between", value1, value2, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNull() {
            addCriterion("disease_name is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNotNull() {
            addCriterion("disease_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameEqualTo(String value) {
            addCriterion("disease_name =", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotEqualTo(String value) {
            addCriterion("disease_name <>", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThan(String value) {
            addCriterion("disease_name >", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("disease_name >=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThan(String value) {
            addCriterion("disease_name <", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThanOrEqualTo(String value) {
            addCriterion("disease_name <=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLike(String value) {
            addCriterion("disease_name like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotLike(String value) {
            addCriterion("disease_name not like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIn(List<String> values) {
            addCriterion("disease_name in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotIn(List<String> values) {
            addCriterion("disease_name not in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameBetween(String value1, String value2) {
            addCriterion("disease_name between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotBetween(String value1, String value2) {
            addCriterion("disease_name not between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Short value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Short value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Short value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Short value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Short value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Short value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Short> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Short> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Short value1, Short value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Short value1, Short value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumIsNull() {
            addCriterion("team_num is null");
            return (Criteria) this;
        }

        public Criteria andTeamNumIsNotNull() {
            addCriterion("team_num is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNumEqualTo(Integer value) {
            addCriterion("team_num =", value, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumNotEqualTo(Integer value) {
            addCriterion("team_num <>", value, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumGreaterThan(Integer value) {
            addCriterion("team_num >", value, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_num >=", value, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumLessThan(Integer value) {
            addCriterion("team_num <", value, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumLessThanOrEqualTo(Integer value) {
            addCriterion("team_num <=", value, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumIn(List<Integer> values) {
            addCriterion("team_num in", values, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumNotIn(List<Integer> values) {
            addCriterion("team_num not in", values, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumBetween(Integer value1, Integer value2) {
            addCriterion("team_num between", value1, value2, "teamNum");
            return (Criteria) this;
        }

        public Criteria andTeamNumNotBetween(Integer value1, Integer value2) {
            addCriterion("team_num not between", value1, value2, "teamNum");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeIsNull() {
            addCriterion("decision_tree_code is null");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeIsNotNull() {
            addCriterion("decision_tree_code is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeEqualTo(Short value) {
            addCriterion("decision_tree_code =", value, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeNotEqualTo(Short value) {
            addCriterion("decision_tree_code <>", value, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeGreaterThan(Short value) {
            addCriterion("decision_tree_code >", value, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("decision_tree_code >=", value, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeLessThan(Short value) {
            addCriterion("decision_tree_code <", value, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeLessThanOrEqualTo(Short value) {
            addCriterion("decision_tree_code <=", value, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeIn(List<Short> values) {
            addCriterion("decision_tree_code in", values, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeNotIn(List<Short> values) {
            addCriterion("decision_tree_code not in", values, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeBetween(Short value1, Short value2) {
            addCriterion("decision_tree_code between", value1, value2, "decisionTreeCode");
            return (Criteria) this;
        }

        public Criteria andDecisionTreeCodeNotBetween(Short value1, Short value2) {
            addCriterion("decision_tree_code not between", value1, value2, "decisionTreeCode");
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