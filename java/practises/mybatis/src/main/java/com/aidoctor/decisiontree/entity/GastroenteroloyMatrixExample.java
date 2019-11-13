package com.aidoctor.decisiontree.entity;

import java.util.ArrayList;
import java.util.List;

public class GastroenteroloyMatrixExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GastroenteroloyMatrixExample() {
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

        public Criteria andDiseaseTeamIsNull() {
            addCriterion("disease_team is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamIsNotNull() {
            addCriterion("disease_team is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamEqualTo(String value) {
            addCriterion("disease_team =", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamNotEqualTo(String value) {
            addCriterion("disease_team <>", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamGreaterThan(String value) {
            addCriterion("disease_team >", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamGreaterThanOrEqualTo(String value) {
            addCriterion("disease_team >=", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamLessThan(String value) {
            addCriterion("disease_team <", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamLessThanOrEqualTo(String value) {
            addCriterion("disease_team <=", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamLike(String value) {
            addCriterion("disease_team like", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamNotLike(String value) {
            addCriterion("disease_team not like", value, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamIn(List<String> values) {
            addCriterion("disease_team in", values, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamNotIn(List<String> values) {
            addCriterion("disease_team not in", values, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamBetween(String value1, String value2) {
            addCriterion("disease_team between", value1, value2, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andDiseaseTeamNotBetween(String value1, String value2) {
            addCriterion("disease_team not between", value1, value2, "diseaseTeam");
            return (Criteria) this;
        }

        public Criteria andSympyom1IsNull() {
            addCriterion("sympyom1 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom1IsNotNull() {
            addCriterion("sympyom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom1EqualTo(Short value) {
            addCriterion("sympyom1 =", value, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1NotEqualTo(Short value) {
            addCriterion("sympyom1 <>", value, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1GreaterThan(Short value) {
            addCriterion("sympyom1 >", value, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom1 >=", value, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1LessThan(Short value) {
            addCriterion("sympyom1 <", value, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1LessThanOrEqualTo(Short value) {
            addCriterion("sympyom1 <=", value, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1In(List<Short> values) {
            addCriterion("sympyom1 in", values, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1NotIn(List<Short> values) {
            addCriterion("sympyom1 not in", values, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1Between(Short value1, Short value2) {
            addCriterion("sympyom1 between", value1, value2, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom1NotBetween(Short value1, Short value2) {
            addCriterion("sympyom1 not between", value1, value2, "sympyom1");
            return (Criteria) this;
        }

        public Criteria andSympyom2IsNull() {
            addCriterion("sympyom2 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom2IsNotNull() {
            addCriterion("sympyom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom2EqualTo(Short value) {
            addCriterion("sympyom2 =", value, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2NotEqualTo(Short value) {
            addCriterion("sympyom2 <>", value, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2GreaterThan(Short value) {
            addCriterion("sympyom2 >", value, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom2 >=", value, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2LessThan(Short value) {
            addCriterion("sympyom2 <", value, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2LessThanOrEqualTo(Short value) {
            addCriterion("sympyom2 <=", value, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2In(List<Short> values) {
            addCriterion("sympyom2 in", values, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2NotIn(List<Short> values) {
            addCriterion("sympyom2 not in", values, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2Between(Short value1, Short value2) {
            addCriterion("sympyom2 between", value1, value2, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom2NotBetween(Short value1, Short value2) {
            addCriterion("sympyom2 not between", value1, value2, "sympyom2");
            return (Criteria) this;
        }

        public Criteria andSympyom3IsNull() {
            addCriterion("sympyom3 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom3IsNotNull() {
            addCriterion("sympyom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom3EqualTo(Short value) {
            addCriterion("sympyom3 =", value, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3NotEqualTo(Short value) {
            addCriterion("sympyom3 <>", value, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3GreaterThan(Short value) {
            addCriterion("sympyom3 >", value, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom3 >=", value, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3LessThan(Short value) {
            addCriterion("sympyom3 <", value, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3LessThanOrEqualTo(Short value) {
            addCriterion("sympyom3 <=", value, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3In(List<Short> values) {
            addCriterion("sympyom3 in", values, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3NotIn(List<Short> values) {
            addCriterion("sympyom3 not in", values, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3Between(Short value1, Short value2) {
            addCriterion("sympyom3 between", value1, value2, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom3NotBetween(Short value1, Short value2) {
            addCriterion("sympyom3 not between", value1, value2, "sympyom3");
            return (Criteria) this;
        }

        public Criteria andSympyom4IsNull() {
            addCriterion("sympyom4 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom4IsNotNull() {
            addCriterion("sympyom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom4EqualTo(Short value) {
            addCriterion("sympyom4 =", value, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4NotEqualTo(Short value) {
            addCriterion("sympyom4 <>", value, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4GreaterThan(Short value) {
            addCriterion("sympyom4 >", value, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom4 >=", value, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4LessThan(Short value) {
            addCriterion("sympyom4 <", value, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4LessThanOrEqualTo(Short value) {
            addCriterion("sympyom4 <=", value, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4In(List<Short> values) {
            addCriterion("sympyom4 in", values, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4NotIn(List<Short> values) {
            addCriterion("sympyom4 not in", values, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4Between(Short value1, Short value2) {
            addCriterion("sympyom4 between", value1, value2, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom4NotBetween(Short value1, Short value2) {
            addCriterion("sympyom4 not between", value1, value2, "sympyom4");
            return (Criteria) this;
        }

        public Criteria andSympyom5IsNull() {
            addCriterion("sympyom5 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom5IsNotNull() {
            addCriterion("sympyom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom5EqualTo(Short value) {
            addCriterion("sympyom5 =", value, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5NotEqualTo(Short value) {
            addCriterion("sympyom5 <>", value, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5GreaterThan(Short value) {
            addCriterion("sympyom5 >", value, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom5 >=", value, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5LessThan(Short value) {
            addCriterion("sympyom5 <", value, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5LessThanOrEqualTo(Short value) {
            addCriterion("sympyom5 <=", value, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5In(List<Short> values) {
            addCriterion("sympyom5 in", values, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5NotIn(List<Short> values) {
            addCriterion("sympyom5 not in", values, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5Between(Short value1, Short value2) {
            addCriterion("sympyom5 between", value1, value2, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom5NotBetween(Short value1, Short value2) {
            addCriterion("sympyom5 not between", value1, value2, "sympyom5");
            return (Criteria) this;
        }

        public Criteria andSympyom6IsNull() {
            addCriterion("sympyom6 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom6IsNotNull() {
            addCriterion("sympyom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom6EqualTo(Short value) {
            addCriterion("sympyom6 =", value, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6NotEqualTo(Short value) {
            addCriterion("sympyom6 <>", value, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6GreaterThan(Short value) {
            addCriterion("sympyom6 >", value, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom6 >=", value, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6LessThan(Short value) {
            addCriterion("sympyom6 <", value, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6LessThanOrEqualTo(Short value) {
            addCriterion("sympyom6 <=", value, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6In(List<Short> values) {
            addCriterion("sympyom6 in", values, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6NotIn(List<Short> values) {
            addCriterion("sympyom6 not in", values, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6Between(Short value1, Short value2) {
            addCriterion("sympyom6 between", value1, value2, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom6NotBetween(Short value1, Short value2) {
            addCriterion("sympyom6 not between", value1, value2, "sympyom6");
            return (Criteria) this;
        }

        public Criteria andSympyom7IsNull() {
            addCriterion("sympyom7 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom7IsNotNull() {
            addCriterion("sympyom7 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom7EqualTo(Short value) {
            addCriterion("sympyom7 =", value, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7NotEqualTo(Short value) {
            addCriterion("sympyom7 <>", value, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7GreaterThan(Short value) {
            addCriterion("sympyom7 >", value, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom7 >=", value, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7LessThan(Short value) {
            addCriterion("sympyom7 <", value, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7LessThanOrEqualTo(Short value) {
            addCriterion("sympyom7 <=", value, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7In(List<Short> values) {
            addCriterion("sympyom7 in", values, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7NotIn(List<Short> values) {
            addCriterion("sympyom7 not in", values, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7Between(Short value1, Short value2) {
            addCriterion("sympyom7 between", value1, value2, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom7NotBetween(Short value1, Short value2) {
            addCriterion("sympyom7 not between", value1, value2, "sympyom7");
            return (Criteria) this;
        }

        public Criteria andSympyom8IsNull() {
            addCriterion("sympyom8 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom8IsNotNull() {
            addCriterion("sympyom8 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom8EqualTo(Short value) {
            addCriterion("sympyom8 =", value, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8NotEqualTo(Short value) {
            addCriterion("sympyom8 <>", value, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8GreaterThan(Short value) {
            addCriterion("sympyom8 >", value, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom8 >=", value, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8LessThan(Short value) {
            addCriterion("sympyom8 <", value, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8LessThanOrEqualTo(Short value) {
            addCriterion("sympyom8 <=", value, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8In(List<Short> values) {
            addCriterion("sympyom8 in", values, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8NotIn(List<Short> values) {
            addCriterion("sympyom8 not in", values, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8Between(Short value1, Short value2) {
            addCriterion("sympyom8 between", value1, value2, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom8NotBetween(Short value1, Short value2) {
            addCriterion("sympyom8 not between", value1, value2, "sympyom8");
            return (Criteria) this;
        }

        public Criteria andSympyom9IsNull() {
            addCriterion("sympyom9 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom9IsNotNull() {
            addCriterion("sympyom9 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom9EqualTo(Short value) {
            addCriterion("sympyom9 =", value, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9NotEqualTo(Short value) {
            addCriterion("sympyom9 <>", value, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9GreaterThan(Short value) {
            addCriterion("sympyom9 >", value, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom9 >=", value, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9LessThan(Short value) {
            addCriterion("sympyom9 <", value, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9LessThanOrEqualTo(Short value) {
            addCriterion("sympyom9 <=", value, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9In(List<Short> values) {
            addCriterion("sympyom9 in", values, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9NotIn(List<Short> values) {
            addCriterion("sympyom9 not in", values, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9Between(Short value1, Short value2) {
            addCriterion("sympyom9 between", value1, value2, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom9NotBetween(Short value1, Short value2) {
            addCriterion("sympyom9 not between", value1, value2, "sympyom9");
            return (Criteria) this;
        }

        public Criteria andSympyom10IsNull() {
            addCriterion("sympyom10 is null");
            return (Criteria) this;
        }

        public Criteria andSympyom10IsNotNull() {
            addCriterion("sympyom10 is not null");
            return (Criteria) this;
        }

        public Criteria andSympyom10EqualTo(Short value) {
            addCriterion("sympyom10 =", value, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10NotEqualTo(Short value) {
            addCriterion("sympyom10 <>", value, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10GreaterThan(Short value) {
            addCriterion("sympyom10 >", value, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10GreaterThanOrEqualTo(Short value) {
            addCriterion("sympyom10 >=", value, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10LessThan(Short value) {
            addCriterion("sympyom10 <", value, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10LessThanOrEqualTo(Short value) {
            addCriterion("sympyom10 <=", value, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10In(List<Short> values) {
            addCriterion("sympyom10 in", values, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10NotIn(List<Short> values) {
            addCriterion("sympyom10 not in", values, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10Between(Short value1, Short value2) {
            addCriterion("sympyom10 between", value1, value2, "sympyom10");
            return (Criteria) this;
        }

        public Criteria andSympyom10NotBetween(Short value1, Short value2) {
            addCriterion("sympyom10 not between", value1, value2, "sympyom10");
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