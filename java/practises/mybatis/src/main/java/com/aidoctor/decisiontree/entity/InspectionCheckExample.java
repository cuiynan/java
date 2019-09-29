package com.aidoctor.decisiontree.entity;

import java.util.ArrayList;
import java.util.List;

public class InspectionCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionCheckExample() {
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

        public Criteria andIdEqualTo(Short value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
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

        public Criteria andSonCodeIsNull() {
            addCriterion("son_code is null");
            return (Criteria) this;
        }

        public Criteria andSonCodeIsNotNull() {
            addCriterion("son_code is not null");
            return (Criteria) this;
        }

        public Criteria andSonCodeEqualTo(String value) {
            addCriterion("son_code =", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeNotEqualTo(String value) {
            addCriterion("son_code <>", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeGreaterThan(String value) {
            addCriterion("son_code >", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("son_code >=", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeLessThan(String value) {
            addCriterion("son_code <", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeLessThanOrEqualTo(String value) {
            addCriterion("son_code <=", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeLike(String value) {
            addCriterion("son_code like", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeNotLike(String value) {
            addCriterion("son_code not like", value, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeIn(List<String> values) {
            addCriterion("son_code in", values, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeNotIn(List<String> values) {
            addCriterion("son_code not in", values, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeBetween(String value1, String value2) {
            addCriterion("son_code between", value1, value2, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonCodeNotBetween(String value1, String value2) {
            addCriterion("son_code not between", value1, value2, "sonCode");
            return (Criteria) this;
        }

        public Criteria andSonNameIsNull() {
            addCriterion("son_name is null");
            return (Criteria) this;
        }

        public Criteria andSonNameIsNotNull() {
            addCriterion("son_name is not null");
            return (Criteria) this;
        }

        public Criteria andSonNameEqualTo(String value) {
            addCriterion("son_name =", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameNotEqualTo(String value) {
            addCriterion("son_name <>", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameGreaterThan(String value) {
            addCriterion("son_name >", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameGreaterThanOrEqualTo(String value) {
            addCriterion("son_name >=", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameLessThan(String value) {
            addCriterion("son_name <", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameLessThanOrEqualTo(String value) {
            addCriterion("son_name <=", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameLike(String value) {
            addCriterion("son_name like", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameNotLike(String value) {
            addCriterion("son_name not like", value, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameIn(List<String> values) {
            addCriterion("son_name in", values, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameNotIn(List<String> values) {
            addCriterion("son_name not in", values, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameBetween(String value1, String value2) {
            addCriterion("son_name between", value1, value2, "sonName");
            return (Criteria) this;
        }

        public Criteria andSonNameNotBetween(String value1, String value2) {
            addCriterion("son_name not between", value1, value2, "sonName");
            return (Criteria) this;
        }

        public Criteria andTz1IsNull() {
            addCriterion("TZ1 is null");
            return (Criteria) this;
        }

        public Criteria andTz1IsNotNull() {
            addCriterion("TZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andTz1EqualTo(Short value) {
            addCriterion("TZ1 =", value, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1NotEqualTo(Short value) {
            addCriterion("TZ1 <>", value, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1GreaterThan(Short value) {
            addCriterion("TZ1 >", value, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1GreaterThanOrEqualTo(Short value) {
            addCriterion("TZ1 >=", value, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1LessThan(Short value) {
            addCriterion("TZ1 <", value, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1LessThanOrEqualTo(Short value) {
            addCriterion("TZ1 <=", value, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1In(List<Short> values) {
            addCriterion("TZ1 in", values, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1NotIn(List<Short> values) {
            addCriterion("TZ1 not in", values, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1Between(Short value1, Short value2) {
            addCriterion("TZ1 between", value1, value2, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz1NotBetween(Short value1, Short value2) {
            addCriterion("TZ1 not between", value1, value2, "tz1");
            return (Criteria) this;
        }

        public Criteria andTz2IsNull() {
            addCriterion("TZ2 is null");
            return (Criteria) this;
        }

        public Criteria andTz2IsNotNull() {
            addCriterion("TZ2 is not null");
            return (Criteria) this;
        }

        public Criteria andTz2EqualTo(Short value) {
            addCriterion("TZ2 =", value, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2NotEqualTo(Short value) {
            addCriterion("TZ2 <>", value, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2GreaterThan(Short value) {
            addCriterion("TZ2 >", value, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2GreaterThanOrEqualTo(Short value) {
            addCriterion("TZ2 >=", value, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2LessThan(Short value) {
            addCriterion("TZ2 <", value, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2LessThanOrEqualTo(Short value) {
            addCriterion("TZ2 <=", value, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2In(List<Short> values) {
            addCriterion("TZ2 in", values, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2NotIn(List<Short> values) {
            addCriterion("TZ2 not in", values, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2Between(Short value1, Short value2) {
            addCriterion("TZ2 between", value1, value2, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz2NotBetween(Short value1, Short value2) {
            addCriterion("TZ2 not between", value1, value2, "tz2");
            return (Criteria) this;
        }

        public Criteria andTz3IsNull() {
            addCriterion("TZ3 is null");
            return (Criteria) this;
        }

        public Criteria andTz3IsNotNull() {
            addCriterion("TZ3 is not null");
            return (Criteria) this;
        }

        public Criteria andTz3EqualTo(Short value) {
            addCriterion("TZ3 =", value, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3NotEqualTo(Short value) {
            addCriterion("TZ3 <>", value, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3GreaterThan(Short value) {
            addCriterion("TZ3 >", value, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3GreaterThanOrEqualTo(Short value) {
            addCriterion("TZ3 >=", value, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3LessThan(Short value) {
            addCriterion("TZ3 <", value, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3LessThanOrEqualTo(Short value) {
            addCriterion("TZ3 <=", value, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3In(List<Short> values) {
            addCriterion("TZ3 in", values, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3NotIn(List<Short> values) {
            addCriterion("TZ3 not in", values, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3Between(Short value1, Short value2) {
            addCriterion("TZ3 between", value1, value2, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz3NotBetween(Short value1, Short value2) {
            addCriterion("TZ3 not between", value1, value2, "tz3");
            return (Criteria) this;
        }

        public Criteria andTz4IsNull() {
            addCriterion("TZ4 is null");
            return (Criteria) this;
        }

        public Criteria andTz4IsNotNull() {
            addCriterion("TZ4 is not null");
            return (Criteria) this;
        }

        public Criteria andTz4EqualTo(Short value) {
            addCriterion("TZ4 =", value, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4NotEqualTo(Short value) {
            addCriterion("TZ4 <>", value, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4GreaterThan(Short value) {
            addCriterion("TZ4 >", value, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4GreaterThanOrEqualTo(Short value) {
            addCriterion("TZ4 >=", value, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4LessThan(Short value) {
            addCriterion("TZ4 <", value, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4LessThanOrEqualTo(Short value) {
            addCriterion("TZ4 <=", value, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4In(List<Short> values) {
            addCriterion("TZ4 in", values, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4NotIn(List<Short> values) {
            addCriterion("TZ4 not in", values, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4Between(Short value1, Short value2) {
            addCriterion("TZ4 between", value1, value2, "tz4");
            return (Criteria) this;
        }

        public Criteria andTz4NotBetween(Short value1, Short value2) {
            addCriterion("TZ4 not between", value1, value2, "tz4");
            return (Criteria) this;
        }

        public Criteria andJc1IsNull() {
            addCriterion("JC1 is null");
            return (Criteria) this;
        }

        public Criteria andJc1IsNotNull() {
            addCriterion("JC1 is not null");
            return (Criteria) this;
        }

        public Criteria andJc1EqualTo(Short value) {
            addCriterion("JC1 =", value, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1NotEqualTo(Short value) {
            addCriterion("JC1 <>", value, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1GreaterThan(Short value) {
            addCriterion("JC1 >", value, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1GreaterThanOrEqualTo(Short value) {
            addCriterion("JC1 >=", value, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1LessThan(Short value) {
            addCriterion("JC1 <", value, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1LessThanOrEqualTo(Short value) {
            addCriterion("JC1 <=", value, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1In(List<Short> values) {
            addCriterion("JC1 in", values, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1NotIn(List<Short> values) {
            addCriterion("JC1 not in", values, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1Between(Short value1, Short value2) {
            addCriterion("JC1 between", value1, value2, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc1NotBetween(Short value1, Short value2) {
            addCriterion("JC1 not between", value1, value2, "jc1");
            return (Criteria) this;
        }

        public Criteria andJc2IsNull() {
            addCriterion("JC2 is null");
            return (Criteria) this;
        }

        public Criteria andJc2IsNotNull() {
            addCriterion("JC2 is not null");
            return (Criteria) this;
        }

        public Criteria andJc2EqualTo(Short value) {
            addCriterion("JC2 =", value, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2NotEqualTo(Short value) {
            addCriterion("JC2 <>", value, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2GreaterThan(Short value) {
            addCriterion("JC2 >", value, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2GreaterThanOrEqualTo(Short value) {
            addCriterion("JC2 >=", value, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2LessThan(Short value) {
            addCriterion("JC2 <", value, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2LessThanOrEqualTo(Short value) {
            addCriterion("JC2 <=", value, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2In(List<Short> values) {
            addCriterion("JC2 in", values, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2NotIn(List<Short> values) {
            addCriterion("JC2 not in", values, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2Between(Short value1, Short value2) {
            addCriterion("JC2 between", value1, value2, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc2NotBetween(Short value1, Short value2) {
            addCriterion("JC2 not between", value1, value2, "jc2");
            return (Criteria) this;
        }

        public Criteria andJc3IsNull() {
            addCriterion("JC3 is null");
            return (Criteria) this;
        }

        public Criteria andJc3IsNotNull() {
            addCriterion("JC3 is not null");
            return (Criteria) this;
        }

        public Criteria andJc3EqualTo(Short value) {
            addCriterion("JC3 =", value, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3NotEqualTo(Short value) {
            addCriterion("JC3 <>", value, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3GreaterThan(Short value) {
            addCriterion("JC3 >", value, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3GreaterThanOrEqualTo(Short value) {
            addCriterion("JC3 >=", value, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3LessThan(Short value) {
            addCriterion("JC3 <", value, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3LessThanOrEqualTo(Short value) {
            addCriterion("JC3 <=", value, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3In(List<Short> values) {
            addCriterion("JC3 in", values, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3NotIn(List<Short> values) {
            addCriterion("JC3 not in", values, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3Between(Short value1, Short value2) {
            addCriterion("JC3 between", value1, value2, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc3NotBetween(Short value1, Short value2) {
            addCriterion("JC3 not between", value1, value2, "jc3");
            return (Criteria) this;
        }

        public Criteria andJc4IsNull() {
            addCriterion("JC4 is null");
            return (Criteria) this;
        }

        public Criteria andJc4IsNotNull() {
            addCriterion("JC4 is not null");
            return (Criteria) this;
        }

        public Criteria andJc4EqualTo(Short value) {
            addCriterion("JC4 =", value, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4NotEqualTo(Short value) {
            addCriterion("JC4 <>", value, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4GreaterThan(Short value) {
            addCriterion("JC4 >", value, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4GreaterThanOrEqualTo(Short value) {
            addCriterion("JC4 >=", value, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4LessThan(Short value) {
            addCriterion("JC4 <", value, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4LessThanOrEqualTo(Short value) {
            addCriterion("JC4 <=", value, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4In(List<Short> values) {
            addCriterion("JC4 in", values, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4NotIn(List<Short> values) {
            addCriterion("JC4 not in", values, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4Between(Short value1, Short value2) {
            addCriterion("JC4 between", value1, value2, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc4NotBetween(Short value1, Short value2) {
            addCriterion("JC4 not between", value1, value2, "jc4");
            return (Criteria) this;
        }

        public Criteria andJc5IsNull() {
            addCriterion("JC5 is null");
            return (Criteria) this;
        }

        public Criteria andJc5IsNotNull() {
            addCriterion("JC5 is not null");
            return (Criteria) this;
        }

        public Criteria andJc5EqualTo(Short value) {
            addCriterion("JC5 =", value, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5NotEqualTo(Short value) {
            addCriterion("JC5 <>", value, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5GreaterThan(Short value) {
            addCriterion("JC5 >", value, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5GreaterThanOrEqualTo(Short value) {
            addCriterion("JC5 >=", value, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5LessThan(Short value) {
            addCriterion("JC5 <", value, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5LessThanOrEqualTo(Short value) {
            addCriterion("JC5 <=", value, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5In(List<Short> values) {
            addCriterion("JC5 in", values, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5NotIn(List<Short> values) {
            addCriterion("JC5 not in", values, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5Between(Short value1, Short value2) {
            addCriterion("JC5 between", value1, value2, "jc5");
            return (Criteria) this;
        }

        public Criteria andJc5NotBetween(Short value1, Short value2) {
            addCriterion("JC5 not between", value1, value2, "jc5");
            return (Criteria) this;
        }

        public Criteria andXcg1IsNull() {
            addCriterion("XCG1 is null");
            return (Criteria) this;
        }

        public Criteria andXcg1IsNotNull() {
            addCriterion("XCG1 is not null");
            return (Criteria) this;
        }

        public Criteria andXcg1EqualTo(Short value) {
            addCriterion("XCG1 =", value, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1NotEqualTo(Short value) {
            addCriterion("XCG1 <>", value, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1GreaterThan(Short value) {
            addCriterion("XCG1 >", value, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1GreaterThanOrEqualTo(Short value) {
            addCriterion("XCG1 >=", value, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1LessThan(Short value) {
            addCriterion("XCG1 <", value, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1LessThanOrEqualTo(Short value) {
            addCriterion("XCG1 <=", value, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1In(List<Short> values) {
            addCriterion("XCG1 in", values, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1NotIn(List<Short> values) {
            addCriterion("XCG1 not in", values, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1Between(Short value1, Short value2) {
            addCriterion("XCG1 between", value1, value2, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg1NotBetween(Short value1, Short value2) {
            addCriterion("XCG1 not between", value1, value2, "xcg1");
            return (Criteria) this;
        }

        public Criteria andXcg2IsNull() {
            addCriterion("XCG2 is null");
            return (Criteria) this;
        }

        public Criteria andXcg2IsNotNull() {
            addCriterion("XCG2 is not null");
            return (Criteria) this;
        }

        public Criteria andXcg2EqualTo(Short value) {
            addCriterion("XCG2 =", value, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2NotEqualTo(Short value) {
            addCriterion("XCG2 <>", value, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2GreaterThan(Short value) {
            addCriterion("XCG2 >", value, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2GreaterThanOrEqualTo(Short value) {
            addCriterion("XCG2 >=", value, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2LessThan(Short value) {
            addCriterion("XCG2 <", value, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2LessThanOrEqualTo(Short value) {
            addCriterion("XCG2 <=", value, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2In(List<Short> values) {
            addCriterion("XCG2 in", values, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2NotIn(List<Short> values) {
            addCriterion("XCG2 not in", values, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2Between(Short value1, Short value2) {
            addCriterion("XCG2 between", value1, value2, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg2NotBetween(Short value1, Short value2) {
            addCriterion("XCG2 not between", value1, value2, "xcg2");
            return (Criteria) this;
        }

        public Criteria andXcg3IsNull() {
            addCriterion("XCG3 is null");
            return (Criteria) this;
        }

        public Criteria andXcg3IsNotNull() {
            addCriterion("XCG3 is not null");
            return (Criteria) this;
        }

        public Criteria andXcg3EqualTo(Short value) {
            addCriterion("XCG3 =", value, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3NotEqualTo(Short value) {
            addCriterion("XCG3 <>", value, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3GreaterThan(Short value) {
            addCriterion("XCG3 >", value, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3GreaterThanOrEqualTo(Short value) {
            addCriterion("XCG3 >=", value, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3LessThan(Short value) {
            addCriterion("XCG3 <", value, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3LessThanOrEqualTo(Short value) {
            addCriterion("XCG3 <=", value, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3In(List<Short> values) {
            addCriterion("XCG3 in", values, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3NotIn(List<Short> values) {
            addCriterion("XCG3 not in", values, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3Between(Short value1, Short value2) {
            addCriterion("XCG3 between", value1, value2, "xcg3");
            return (Criteria) this;
        }

        public Criteria andXcg3NotBetween(Short value1, Short value2) {
            addCriterion("XCG3 not between", value1, value2, "xcg3");
            return (Criteria) this;
        }

        public Criteria andX1IsNull() {
            addCriterion("X1 is null");
            return (Criteria) this;
        }

        public Criteria andX1IsNotNull() {
            addCriterion("X1 is not null");
            return (Criteria) this;
        }

        public Criteria andX1EqualTo(Short value) {
            addCriterion("X1 =", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotEqualTo(Short value) {
            addCriterion("X1 <>", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThan(Short value) {
            addCriterion("X1 >", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThanOrEqualTo(Short value) {
            addCriterion("X1 >=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThan(Short value) {
            addCriterion("X1 <", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThanOrEqualTo(Short value) {
            addCriterion("X1 <=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1In(List<Short> values) {
            addCriterion("X1 in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotIn(List<Short> values) {
            addCriterion("X1 not in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1Between(Short value1, Short value2) {
            addCriterion("X1 between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotBetween(Short value1, Short value2) {
            addCriterion("X1 not between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX2IsNull() {
            addCriterion("X2 is null");
            return (Criteria) this;
        }

        public Criteria andX2IsNotNull() {
            addCriterion("X2 is not null");
            return (Criteria) this;
        }

        public Criteria andX2EqualTo(Short value) {
            addCriterion("X2 =", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotEqualTo(Short value) {
            addCriterion("X2 <>", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThan(Short value) {
            addCriterion("X2 >", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThanOrEqualTo(Short value) {
            addCriterion("X2 >=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThan(Short value) {
            addCriterion("X2 <", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThanOrEqualTo(Short value) {
            addCriterion("X2 <=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2In(List<Short> values) {
            addCriterion("X2 in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotIn(List<Short> values) {
            addCriterion("X2 not in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2Between(Short value1, Short value2) {
            addCriterion("X2 between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotBetween(Short value1, Short value2) {
            addCriterion("X2 not between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX3IsNull() {
            addCriterion("X3 is null");
            return (Criteria) this;
        }

        public Criteria andX3IsNotNull() {
            addCriterion("X3 is not null");
            return (Criteria) this;
        }

        public Criteria andX3EqualTo(Short value) {
            addCriterion("X3 =", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotEqualTo(Short value) {
            addCriterion("X3 <>", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3GreaterThan(Short value) {
            addCriterion("X3 >", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3GreaterThanOrEqualTo(Short value) {
            addCriterion("X3 >=", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3LessThan(Short value) {
            addCriterion("X3 <", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3LessThanOrEqualTo(Short value) {
            addCriterion("X3 <=", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3In(List<Short> values) {
            addCriterion("X3 in", values, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotIn(List<Short> values) {
            addCriterion("X3 not in", values, "x3");
            return (Criteria) this;
        }

        public Criteria andX3Between(Short value1, Short value2) {
            addCriterion("X3 between", value1, value2, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotBetween(Short value1, Short value2) {
            addCriterion("X3 not between", value1, value2, "x3");
            return (Criteria) this;
        }

        public Criteria andX4IsNull() {
            addCriterion("X4 is null");
            return (Criteria) this;
        }

        public Criteria andX4IsNotNull() {
            addCriterion("X4 is not null");
            return (Criteria) this;
        }

        public Criteria andX4EqualTo(Short value) {
            addCriterion("X4 =", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotEqualTo(Short value) {
            addCriterion("X4 <>", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4GreaterThan(Short value) {
            addCriterion("X4 >", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4GreaterThanOrEqualTo(Short value) {
            addCriterion("X4 >=", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4LessThan(Short value) {
            addCriterion("X4 <", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4LessThanOrEqualTo(Short value) {
            addCriterion("X4 <=", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4In(List<Short> values) {
            addCriterion("X4 in", values, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotIn(List<Short> values) {
            addCriterion("X4 not in", values, "x4");
            return (Criteria) this;
        }

        public Criteria andX4Between(Short value1, Short value2) {
            addCriterion("X4 between", value1, value2, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotBetween(Short value1, Short value2) {
            addCriterion("X4 not between", value1, value2, "x4");
            return (Criteria) this;
        }

        public Criteria andX5IsNull() {
            addCriterion("X5 is null");
            return (Criteria) this;
        }

        public Criteria andX5IsNotNull() {
            addCriterion("X5 is not null");
            return (Criteria) this;
        }

        public Criteria andX5EqualTo(Short value) {
            addCriterion("X5 =", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotEqualTo(Short value) {
            addCriterion("X5 <>", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5GreaterThan(Short value) {
            addCriterion("X5 >", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5GreaterThanOrEqualTo(Short value) {
            addCriterion("X5 >=", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5LessThan(Short value) {
            addCriterion("X5 <", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5LessThanOrEqualTo(Short value) {
            addCriterion("X5 <=", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5In(List<Short> values) {
            addCriterion("X5 in", values, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotIn(List<Short> values) {
            addCriterion("X5 not in", values, "x5");
            return (Criteria) this;
        }

        public Criteria andX5Between(Short value1, Short value2) {
            addCriterion("X5 between", value1, value2, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotBetween(Short value1, Short value2) {
            addCriterion("X5 not between", value1, value2, "x5");
            return (Criteria) this;
        }

        public Criteria andX6IsNull() {
            addCriterion("X6 is null");
            return (Criteria) this;
        }

        public Criteria andX6IsNotNull() {
            addCriterion("X6 is not null");
            return (Criteria) this;
        }

        public Criteria andX6EqualTo(Short value) {
            addCriterion("X6 =", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6NotEqualTo(Short value) {
            addCriterion("X6 <>", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6GreaterThan(Short value) {
            addCriterion("X6 >", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6GreaterThanOrEqualTo(Short value) {
            addCriterion("X6 >=", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6LessThan(Short value) {
            addCriterion("X6 <", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6LessThanOrEqualTo(Short value) {
            addCriterion("X6 <=", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6In(List<Short> values) {
            addCriterion("X6 in", values, "x6");
            return (Criteria) this;
        }

        public Criteria andX6NotIn(List<Short> values) {
            addCriterion("X6 not in", values, "x6");
            return (Criteria) this;
        }

        public Criteria andX6Between(Short value1, Short value2) {
            addCriterion("X6 between", value1, value2, "x6");
            return (Criteria) this;
        }

        public Criteria andX6NotBetween(Short value1, Short value2) {
            addCriterion("X6 not between", value1, value2, "x6");
            return (Criteria) this;
        }

        public Criteria andX7IsNull() {
            addCriterion("X7 is null");
            return (Criteria) this;
        }

        public Criteria andX7IsNotNull() {
            addCriterion("X7 is not null");
            return (Criteria) this;
        }

        public Criteria andX7EqualTo(Short value) {
            addCriterion("X7 =", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7NotEqualTo(Short value) {
            addCriterion("X7 <>", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7GreaterThan(Short value) {
            addCriterion("X7 >", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7GreaterThanOrEqualTo(Short value) {
            addCriterion("X7 >=", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7LessThan(Short value) {
            addCriterion("X7 <", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7LessThanOrEqualTo(Short value) {
            addCriterion("X7 <=", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7In(List<Short> values) {
            addCriterion("X7 in", values, "x7");
            return (Criteria) this;
        }

        public Criteria andX7NotIn(List<Short> values) {
            addCriterion("X7 not in", values, "x7");
            return (Criteria) this;
        }

        public Criteria andX7Between(Short value1, Short value2) {
            addCriterion("X7 between", value1, value2, "x7");
            return (Criteria) this;
        }

        public Criteria andX7NotBetween(Short value1, Short value2) {
            addCriterion("X7 not between", value1, value2, "x7");
            return (Criteria) this;
        }

        public Criteria andX8IsNull() {
            addCriterion("X8 is null");
            return (Criteria) this;
        }

        public Criteria andX8IsNotNull() {
            addCriterion("X8 is not null");
            return (Criteria) this;
        }

        public Criteria andX8EqualTo(Short value) {
            addCriterion("X8 =", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8NotEqualTo(Short value) {
            addCriterion("X8 <>", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8GreaterThan(Short value) {
            addCriterion("X8 >", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8GreaterThanOrEqualTo(Short value) {
            addCriterion("X8 >=", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8LessThan(Short value) {
            addCriterion("X8 <", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8LessThanOrEqualTo(Short value) {
            addCriterion("X8 <=", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8In(List<Short> values) {
            addCriterion("X8 in", values, "x8");
            return (Criteria) this;
        }

        public Criteria andX8NotIn(List<Short> values) {
            addCriterion("X8 not in", values, "x8");
            return (Criteria) this;
        }

        public Criteria andX8Between(Short value1, Short value2) {
            addCriterion("X8 between", value1, value2, "x8");
            return (Criteria) this;
        }

        public Criteria andX8NotBetween(Short value1, Short value2) {
            addCriterion("X8 not between", value1, value2, "x8");
            return (Criteria) this;
        }

        public Criteria andX9IsNull() {
            addCriterion("X9 is null");
            return (Criteria) this;
        }

        public Criteria andX9IsNotNull() {
            addCriterion("X9 is not null");
            return (Criteria) this;
        }

        public Criteria andX9EqualTo(Short value) {
            addCriterion("X9 =", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9NotEqualTo(Short value) {
            addCriterion("X9 <>", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9GreaterThan(Short value) {
            addCriterion("X9 >", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9GreaterThanOrEqualTo(Short value) {
            addCriterion("X9 >=", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9LessThan(Short value) {
            addCriterion("X9 <", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9LessThanOrEqualTo(Short value) {
            addCriterion("X9 <=", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9In(List<Short> values) {
            addCriterion("X9 in", values, "x9");
            return (Criteria) this;
        }

        public Criteria andX9NotIn(List<Short> values) {
            addCriterion("X9 not in", values, "x9");
            return (Criteria) this;
        }

        public Criteria andX9Between(Short value1, Short value2) {
            addCriterion("X9 between", value1, value2, "x9");
            return (Criteria) this;
        }

        public Criteria andX9NotBetween(Short value1, Short value2) {
            addCriterion("X9 not between", value1, value2, "x9");
            return (Criteria) this;
        }

        public Criteria andCt1IsNull() {
            addCriterion("CT1 is null");
            return (Criteria) this;
        }

        public Criteria andCt1IsNotNull() {
            addCriterion("CT1 is not null");
            return (Criteria) this;
        }

        public Criteria andCt1EqualTo(Short value) {
            addCriterion("CT1 =", value, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1NotEqualTo(Short value) {
            addCriterion("CT1 <>", value, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1GreaterThan(Short value) {
            addCriterion("CT1 >", value, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1GreaterThanOrEqualTo(Short value) {
            addCriterion("CT1 >=", value, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1LessThan(Short value) {
            addCriterion("CT1 <", value, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1LessThanOrEqualTo(Short value) {
            addCriterion("CT1 <=", value, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1In(List<Short> values) {
            addCriterion("CT1 in", values, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1NotIn(List<Short> values) {
            addCriterion("CT1 not in", values, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1Between(Short value1, Short value2) {
            addCriterion("CT1 between", value1, value2, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt1NotBetween(Short value1, Short value2) {
            addCriterion("CT1 not between", value1, value2, "ct1");
            return (Criteria) this;
        }

        public Criteria andCt2IsNull() {
            addCriterion("CT2 is null");
            return (Criteria) this;
        }

        public Criteria andCt2IsNotNull() {
            addCriterion("CT2 is not null");
            return (Criteria) this;
        }

        public Criteria andCt2EqualTo(Short value) {
            addCriterion("CT2 =", value, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2NotEqualTo(Short value) {
            addCriterion("CT2 <>", value, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2GreaterThan(Short value) {
            addCriterion("CT2 >", value, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2GreaterThanOrEqualTo(Short value) {
            addCriterion("CT2 >=", value, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2LessThan(Short value) {
            addCriterion("CT2 <", value, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2LessThanOrEqualTo(Short value) {
            addCriterion("CT2 <=", value, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2In(List<Short> values) {
            addCriterion("CT2 in", values, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2NotIn(List<Short> values) {
            addCriterion("CT2 not in", values, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2Between(Short value1, Short value2) {
            addCriterion("CT2 between", value1, value2, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt2NotBetween(Short value1, Short value2) {
            addCriterion("CT2 not between", value1, value2, "ct2");
            return (Criteria) this;
        }

        public Criteria andCt3IsNull() {
            addCriterion("CT3 is null");
            return (Criteria) this;
        }

        public Criteria andCt3IsNotNull() {
            addCriterion("CT3 is not null");
            return (Criteria) this;
        }

        public Criteria andCt3EqualTo(Short value) {
            addCriterion("CT3 =", value, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3NotEqualTo(Short value) {
            addCriterion("CT3 <>", value, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3GreaterThan(Short value) {
            addCriterion("CT3 >", value, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3GreaterThanOrEqualTo(Short value) {
            addCriterion("CT3 >=", value, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3LessThan(Short value) {
            addCriterion("CT3 <", value, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3LessThanOrEqualTo(Short value) {
            addCriterion("CT3 <=", value, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3In(List<Short> values) {
            addCriterion("CT3 in", values, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3NotIn(List<Short> values) {
            addCriterion("CT3 not in", values, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3Between(Short value1, Short value2) {
            addCriterion("CT3 between", value1, value2, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt3NotBetween(Short value1, Short value2) {
            addCriterion("CT3 not between", value1, value2, "ct3");
            return (Criteria) this;
        }

        public Criteria andCt4IsNull() {
            addCriterion("CT4 is null");
            return (Criteria) this;
        }

        public Criteria andCt4IsNotNull() {
            addCriterion("CT4 is not null");
            return (Criteria) this;
        }

        public Criteria andCt4EqualTo(Short value) {
            addCriterion("CT4 =", value, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4NotEqualTo(Short value) {
            addCriterion("CT4 <>", value, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4GreaterThan(Short value) {
            addCriterion("CT4 >", value, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4GreaterThanOrEqualTo(Short value) {
            addCriterion("CT4 >=", value, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4LessThan(Short value) {
            addCriterion("CT4 <", value, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4LessThanOrEqualTo(Short value) {
            addCriterion("CT4 <=", value, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4In(List<Short> values) {
            addCriterion("CT4 in", values, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4NotIn(List<Short> values) {
            addCriterion("CT4 not in", values, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4Between(Short value1, Short value2) {
            addCriterion("CT4 between", value1, value2, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt4NotBetween(Short value1, Short value2) {
            addCriterion("CT4 not between", value1, value2, "ct4");
            return (Criteria) this;
        }

        public Criteria andCt5IsNull() {
            addCriterion("CT5 is null");
            return (Criteria) this;
        }

        public Criteria andCt5IsNotNull() {
            addCriterion("CT5 is not null");
            return (Criteria) this;
        }

        public Criteria andCt5EqualTo(Short value) {
            addCriterion("CT5 =", value, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5NotEqualTo(Short value) {
            addCriterion("CT5 <>", value, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5GreaterThan(Short value) {
            addCriterion("CT5 >", value, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5GreaterThanOrEqualTo(Short value) {
            addCriterion("CT5 >=", value, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5LessThan(Short value) {
            addCriterion("CT5 <", value, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5LessThanOrEqualTo(Short value) {
            addCriterion("CT5 <=", value, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5In(List<Short> values) {
            addCriterion("CT5 in", values, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5NotIn(List<Short> values) {
            addCriterion("CT5 not in", values, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5Between(Short value1, Short value2) {
            addCriterion("CT5 between", value1, value2, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt5NotBetween(Short value1, Short value2) {
            addCriterion("CT5 not between", value1, value2, "ct5");
            return (Criteria) this;
        }

        public Criteria andCt6IsNull() {
            addCriterion("CT6 is null");
            return (Criteria) this;
        }

        public Criteria andCt6IsNotNull() {
            addCriterion("CT6 is not null");
            return (Criteria) this;
        }

        public Criteria andCt6EqualTo(Short value) {
            addCriterion("CT6 =", value, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6NotEqualTo(Short value) {
            addCriterion("CT6 <>", value, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6GreaterThan(Short value) {
            addCriterion("CT6 >", value, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6GreaterThanOrEqualTo(Short value) {
            addCriterion("CT6 >=", value, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6LessThan(Short value) {
            addCriterion("CT6 <", value, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6LessThanOrEqualTo(Short value) {
            addCriterion("CT6 <=", value, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6In(List<Short> values) {
            addCriterion("CT6 in", values, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6NotIn(List<Short> values) {
            addCriterion("CT6 not in", values, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6Between(Short value1, Short value2) {
            addCriterion("CT6 between", value1, value2, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt6NotBetween(Short value1, Short value2) {
            addCriterion("CT6 not between", value1, value2, "ct6");
            return (Criteria) this;
        }

        public Criteria andCt7IsNull() {
            addCriterion("CT7 is null");
            return (Criteria) this;
        }

        public Criteria andCt7IsNotNull() {
            addCriterion("CT7 is not null");
            return (Criteria) this;
        }

        public Criteria andCt7EqualTo(Short value) {
            addCriterion("CT7 =", value, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7NotEqualTo(Short value) {
            addCriterion("CT7 <>", value, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7GreaterThan(Short value) {
            addCriterion("CT7 >", value, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7GreaterThanOrEqualTo(Short value) {
            addCriterion("CT7 >=", value, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7LessThan(Short value) {
            addCriterion("CT7 <", value, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7LessThanOrEqualTo(Short value) {
            addCriterion("CT7 <=", value, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7In(List<Short> values) {
            addCriterion("CT7 in", values, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7NotIn(List<Short> values) {
            addCriterion("CT7 not in", values, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7Between(Short value1, Short value2) {
            addCriterion("CT7 between", value1, value2, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt7NotBetween(Short value1, Short value2) {
            addCriterion("CT7 not between", value1, value2, "ct7");
            return (Criteria) this;
        }

        public Criteria andCt8IsNull() {
            addCriterion("CT8 is null");
            return (Criteria) this;
        }

        public Criteria andCt8IsNotNull() {
            addCriterion("CT8 is not null");
            return (Criteria) this;
        }

        public Criteria andCt8EqualTo(Short value) {
            addCriterion("CT8 =", value, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8NotEqualTo(Short value) {
            addCriterion("CT8 <>", value, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8GreaterThan(Short value) {
            addCriterion("CT8 >", value, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8GreaterThanOrEqualTo(Short value) {
            addCriterion("CT8 >=", value, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8LessThan(Short value) {
            addCriterion("CT8 <", value, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8LessThanOrEqualTo(Short value) {
            addCriterion("CT8 <=", value, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8In(List<Short> values) {
            addCriterion("CT8 in", values, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8NotIn(List<Short> values) {
            addCriterion("CT8 not in", values, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8Between(Short value1, Short value2) {
            addCriterion("CT8 between", value1, value2, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt8NotBetween(Short value1, Short value2) {
            addCriterion("CT8 not between", value1, value2, "ct8");
            return (Criteria) this;
        }

        public Criteria andCt9IsNull() {
            addCriterion("CT9 is null");
            return (Criteria) this;
        }

        public Criteria andCt9IsNotNull() {
            addCriterion("CT9 is not null");
            return (Criteria) this;
        }

        public Criteria andCt9EqualTo(Short value) {
            addCriterion("CT9 =", value, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9NotEqualTo(Short value) {
            addCriterion("CT9 <>", value, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9GreaterThan(Short value) {
            addCriterion("CT9 >", value, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9GreaterThanOrEqualTo(Short value) {
            addCriterion("CT9 >=", value, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9LessThan(Short value) {
            addCriterion("CT9 <", value, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9LessThanOrEqualTo(Short value) {
            addCriterion("CT9 <=", value, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9In(List<Short> values) {
            addCriterion("CT9 in", values, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9NotIn(List<Short> values) {
            addCriterion("CT9 not in", values, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9Between(Short value1, Short value2) {
            addCriterion("CT9 between", value1, value2, "ct9");
            return (Criteria) this;
        }

        public Criteria andCt9NotBetween(Short value1, Short value2) {
            addCriterion("CT9 not between", value1, value2, "ct9");
            return (Criteria) this;
        }

        public Criteria andFtq1IsNull() {
            addCriterion("FTQ1 is null");
            return (Criteria) this;
        }

        public Criteria andFtq1IsNotNull() {
            addCriterion("FTQ1 is not null");
            return (Criteria) this;
        }

        public Criteria andFtq1EqualTo(Short value) {
            addCriterion("FTQ1 =", value, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1NotEqualTo(Short value) {
            addCriterion("FTQ1 <>", value, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1GreaterThan(Short value) {
            addCriterion("FTQ1 >", value, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1GreaterThanOrEqualTo(Short value) {
            addCriterion("FTQ1 >=", value, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1LessThan(Short value) {
            addCriterion("FTQ1 <", value, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1LessThanOrEqualTo(Short value) {
            addCriterion("FTQ1 <=", value, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1In(List<Short> values) {
            addCriterion("FTQ1 in", values, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1NotIn(List<Short> values) {
            addCriterion("FTQ1 not in", values, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1Between(Short value1, Short value2) {
            addCriterion("FTQ1 between", value1, value2, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq1NotBetween(Short value1, Short value2) {
            addCriterion("FTQ1 not between", value1, value2, "ftq1");
            return (Criteria) this;
        }

        public Criteria andFtq2IsNull() {
            addCriterion("FTQ2 is null");
            return (Criteria) this;
        }

        public Criteria andFtq2IsNotNull() {
            addCriterion("FTQ2 is not null");
            return (Criteria) this;
        }

        public Criteria andFtq2EqualTo(Short value) {
            addCriterion("FTQ2 =", value, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2NotEqualTo(Short value) {
            addCriterion("FTQ2 <>", value, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2GreaterThan(Short value) {
            addCriterion("FTQ2 >", value, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2GreaterThanOrEqualTo(Short value) {
            addCriterion("FTQ2 >=", value, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2LessThan(Short value) {
            addCriterion("FTQ2 <", value, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2LessThanOrEqualTo(Short value) {
            addCriterion("FTQ2 <=", value, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2In(List<Short> values) {
            addCriterion("FTQ2 in", values, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2NotIn(List<Short> values) {
            addCriterion("FTQ2 not in", values, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2Between(Short value1, Short value2) {
            addCriterion("FTQ2 between", value1, value2, "ftq2");
            return (Criteria) this;
        }

        public Criteria andFtq2NotBetween(Short value1, Short value2) {
            addCriterion("FTQ2 not between", value1, value2, "ftq2");
            return (Criteria) this;
        }

        public Criteria andByt1IsNull() {
            addCriterion("BYT1 is null");
            return (Criteria) this;
        }

        public Criteria andByt1IsNotNull() {
            addCriterion("BYT1 is not null");
            return (Criteria) this;
        }

        public Criteria andByt1EqualTo(Short value) {
            addCriterion("BYT1 =", value, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1NotEqualTo(Short value) {
            addCriterion("BYT1 <>", value, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1GreaterThan(Short value) {
            addCriterion("BYT1 >", value, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT1 >=", value, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1LessThan(Short value) {
            addCriterion("BYT1 <", value, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1LessThanOrEqualTo(Short value) {
            addCriterion("BYT1 <=", value, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1In(List<Short> values) {
            addCriterion("BYT1 in", values, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1NotIn(List<Short> values) {
            addCriterion("BYT1 not in", values, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1Between(Short value1, Short value2) {
            addCriterion("BYT1 between", value1, value2, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt1NotBetween(Short value1, Short value2) {
            addCriterion("BYT1 not between", value1, value2, "byt1");
            return (Criteria) this;
        }

        public Criteria andByt2IsNull() {
            addCriterion("BYT2 is null");
            return (Criteria) this;
        }

        public Criteria andByt2IsNotNull() {
            addCriterion("BYT2 is not null");
            return (Criteria) this;
        }

        public Criteria andByt2EqualTo(Short value) {
            addCriterion("BYT2 =", value, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2NotEqualTo(Short value) {
            addCriterion("BYT2 <>", value, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2GreaterThan(Short value) {
            addCriterion("BYT2 >", value, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT2 >=", value, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2LessThan(Short value) {
            addCriterion("BYT2 <", value, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2LessThanOrEqualTo(Short value) {
            addCriterion("BYT2 <=", value, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2In(List<Short> values) {
            addCriterion("BYT2 in", values, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2NotIn(List<Short> values) {
            addCriterion("BYT2 not in", values, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2Between(Short value1, Short value2) {
            addCriterion("BYT2 between", value1, value2, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt2NotBetween(Short value1, Short value2) {
            addCriterion("BYT2 not between", value1, value2, "byt2");
            return (Criteria) this;
        }

        public Criteria andByt3IsNull() {
            addCriterion("BYT3 is null");
            return (Criteria) this;
        }

        public Criteria andByt3IsNotNull() {
            addCriterion("BYT3 is not null");
            return (Criteria) this;
        }

        public Criteria andByt3EqualTo(Short value) {
            addCriterion("BYT3 =", value, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3NotEqualTo(Short value) {
            addCriterion("BYT3 <>", value, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3GreaterThan(Short value) {
            addCriterion("BYT3 >", value, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT3 >=", value, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3LessThan(Short value) {
            addCriterion("BYT3 <", value, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3LessThanOrEqualTo(Short value) {
            addCriterion("BYT3 <=", value, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3In(List<Short> values) {
            addCriterion("BYT3 in", values, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3NotIn(List<Short> values) {
            addCriterion("BYT3 not in", values, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3Between(Short value1, Short value2) {
            addCriterion("BYT3 between", value1, value2, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt3NotBetween(Short value1, Short value2) {
            addCriterion("BYT3 not between", value1, value2, "byt3");
            return (Criteria) this;
        }

        public Criteria andByt4IsNull() {
            addCriterion("BYT4 is null");
            return (Criteria) this;
        }

        public Criteria andByt4IsNotNull() {
            addCriterion("BYT4 is not null");
            return (Criteria) this;
        }

        public Criteria andByt4EqualTo(Short value) {
            addCriterion("BYT4 =", value, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4NotEqualTo(Short value) {
            addCriterion("BYT4 <>", value, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4GreaterThan(Short value) {
            addCriterion("BYT4 >", value, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT4 >=", value, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4LessThan(Short value) {
            addCriterion("BYT4 <", value, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4LessThanOrEqualTo(Short value) {
            addCriterion("BYT4 <=", value, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4In(List<Short> values) {
            addCriterion("BYT4 in", values, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4NotIn(List<Short> values) {
            addCriterion("BYT4 not in", values, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4Between(Short value1, Short value2) {
            addCriterion("BYT4 between", value1, value2, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt4NotBetween(Short value1, Short value2) {
            addCriterion("BYT4 not between", value1, value2, "byt4");
            return (Criteria) this;
        }

        public Criteria andByt5IsNull() {
            addCriterion("BYT5 is null");
            return (Criteria) this;
        }

        public Criteria andByt5IsNotNull() {
            addCriterion("BYT5 is not null");
            return (Criteria) this;
        }

        public Criteria andByt5EqualTo(Short value) {
            addCriterion("BYT5 =", value, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5NotEqualTo(Short value) {
            addCriterion("BYT5 <>", value, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5GreaterThan(Short value) {
            addCriterion("BYT5 >", value, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT5 >=", value, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5LessThan(Short value) {
            addCriterion("BYT5 <", value, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5LessThanOrEqualTo(Short value) {
            addCriterion("BYT5 <=", value, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5In(List<Short> values) {
            addCriterion("BYT5 in", values, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5NotIn(List<Short> values) {
            addCriterion("BYT5 not in", values, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5Between(Short value1, Short value2) {
            addCriterion("BYT5 between", value1, value2, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt5NotBetween(Short value1, Short value2) {
            addCriterion("BYT5 not between", value1, value2, "byt5");
            return (Criteria) this;
        }

        public Criteria andByt6IsNull() {
            addCriterion("BYT6 is null");
            return (Criteria) this;
        }

        public Criteria andByt6IsNotNull() {
            addCriterion("BYT6 is not null");
            return (Criteria) this;
        }

        public Criteria andByt6EqualTo(Short value) {
            addCriterion("BYT6 =", value, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6NotEqualTo(Short value) {
            addCriterion("BYT6 <>", value, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6GreaterThan(Short value) {
            addCriterion("BYT6 >", value, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT6 >=", value, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6LessThan(Short value) {
            addCriterion("BYT6 <", value, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6LessThanOrEqualTo(Short value) {
            addCriterion("BYT6 <=", value, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6In(List<Short> values) {
            addCriterion("BYT6 in", values, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6NotIn(List<Short> values) {
            addCriterion("BYT6 not in", values, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6Between(Short value1, Short value2) {
            addCriterion("BYT6 between", value1, value2, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt6NotBetween(Short value1, Short value2) {
            addCriterion("BYT6 not between", value1, value2, "byt6");
            return (Criteria) this;
        }

        public Criteria andByt7IsNull() {
            addCriterion("BYT7 is null");
            return (Criteria) this;
        }

        public Criteria andByt7IsNotNull() {
            addCriterion("BYT7 is not null");
            return (Criteria) this;
        }

        public Criteria andByt7EqualTo(Short value) {
            addCriterion("BYT7 =", value, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7NotEqualTo(Short value) {
            addCriterion("BYT7 <>", value, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7GreaterThan(Short value) {
            addCriterion("BYT7 >", value, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7GreaterThanOrEqualTo(Short value) {
            addCriterion("BYT7 >=", value, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7LessThan(Short value) {
            addCriterion("BYT7 <", value, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7LessThanOrEqualTo(Short value) {
            addCriterion("BYT7 <=", value, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7In(List<Short> values) {
            addCriterion("BYT7 in", values, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7NotIn(List<Short> values) {
            addCriterion("BYT7 not in", values, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7Between(Short value1, Short value2) {
            addCriterion("BYT7 between", value1, value2, "byt7");
            return (Criteria) this;
        }

        public Criteria andByt7NotBetween(Short value1, Short value2) {
            addCriterion("BYT7 not between", value1, value2, "byt7");
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