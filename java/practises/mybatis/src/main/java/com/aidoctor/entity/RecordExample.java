package com.aidoctor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNull() {
            addCriterion("picture_id is null");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNotNull() {
            addCriterion("picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPictureIdEqualTo(String value) {
            addCriterion("picture_id =", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotEqualTo(String value) {
            addCriterion("picture_id <>", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThan(String value) {
            addCriterion("picture_id >", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThanOrEqualTo(String value) {
            addCriterion("picture_id >=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThan(String value) {
            addCriterion("picture_id <", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThanOrEqualTo(String value) {
            addCriterion("picture_id <=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLike(String value) {
            addCriterion("picture_id like", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotLike(String value) {
            addCriterion("picture_id not like", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIn(List<String> values) {
            addCriterion("picture_id in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotIn(List<String> values) {
            addCriterion("picture_id not in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdBetween(String value1, String value2) {
            addCriterion("picture_id between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotBetween(String value1, String value2) {
            addCriterion("picture_id not between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andRescalefactorIsNull() {
            addCriterion("rescaleFactor is null");
            return (Criteria) this;
        }

        public Criteria andRescalefactorIsNotNull() {
            addCriterion("rescaleFactor is not null");
            return (Criteria) this;
        }

        public Criteria andRescalefactorEqualTo(Double value) {
            addCriterion("rescaleFactor =", value, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorNotEqualTo(Double value) {
            addCriterion("rescaleFactor <>", value, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorGreaterThan(Double value) {
            addCriterion("rescaleFactor >", value, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorGreaterThanOrEqualTo(Double value) {
            addCriterion("rescaleFactor >=", value, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorLessThan(Double value) {
            addCriterion("rescaleFactor <", value, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorLessThanOrEqualTo(Double value) {
            addCriterion("rescaleFactor <=", value, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorIn(List<Double> values) {
            addCriterion("rescaleFactor in", values, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorNotIn(List<Double> values) {
            addCriterion("rescaleFactor not in", values, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorBetween(Double value1, Double value2) {
            addCriterion("rescaleFactor between", value1, value2, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRescalefactorNotBetween(Double value1, Double value2) {
            addCriterion("rescaleFactor not between", value1, value2, "rescalefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorIsNull() {
            addCriterion("rotateFactor is null");
            return (Criteria) this;
        }

        public Criteria andRotatefactorIsNotNull() {
            addCriterion("rotateFactor is not null");
            return (Criteria) this;
        }

        public Criteria andRotatefactorEqualTo(Integer value) {
            addCriterion("rotateFactor =", value, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorNotEqualTo(Integer value) {
            addCriterion("rotateFactor <>", value, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorGreaterThan(Integer value) {
            addCriterion("rotateFactor >", value, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorGreaterThanOrEqualTo(Integer value) {
            addCriterion("rotateFactor >=", value, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorLessThan(Integer value) {
            addCriterion("rotateFactor <", value, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorLessThanOrEqualTo(Integer value) {
            addCriterion("rotateFactor <=", value, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorIn(List<Integer> values) {
            addCriterion("rotateFactor in", values, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorNotIn(List<Integer> values) {
            addCriterion("rotateFactor not in", values, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorBetween(Integer value1, Integer value2) {
            addCriterion("rotateFactor between", value1, value2, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andRotatefactorNotBetween(Integer value1, Integer value2) {
            addCriterion("rotateFactor not between", value1, value2, "rotatefactor");
            return (Criteria) this;
        }

        public Criteria andChklisttypeIsNull() {
            addCriterion("chklistType is null");
            return (Criteria) this;
        }

        public Criteria andChklisttypeIsNotNull() {
            addCriterion("chklistType is not null");
            return (Criteria) this;
        }

        public Criteria andChklisttypeEqualTo(String value) {
            addCriterion("chklistType =", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeNotEqualTo(String value) {
            addCriterion("chklistType <>", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeGreaterThan(String value) {
            addCriterion("chklistType >", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeGreaterThanOrEqualTo(String value) {
            addCriterion("chklistType >=", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeLessThan(String value) {
            addCriterion("chklistType <", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeLessThanOrEqualTo(String value) {
            addCriterion("chklistType <=", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeLike(String value) {
            addCriterion("chklistType like", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeNotLike(String value) {
            addCriterion("chklistType not like", value, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeIn(List<String> values) {
            addCriterion("chklistType in", values, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeNotIn(List<String> values) {
            addCriterion("chklistType not in", values, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeBetween(String value1, String value2) {
            addCriterion("chklistType between", value1, value2, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChklisttypeNotBetween(String value1, String value2) {
            addCriterion("chklistType not between", value1, value2, "chklisttype");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNull() {
            addCriterion("reportTime is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("reportTime is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(Date value) {
            addCriterion("reportTime =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(Date value) {
            addCriterion("reportTime <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(Date value) {
            addCriterion("reportTime >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reportTime >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(Date value) {
            addCriterion("reportTime <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(Date value) {
            addCriterion("reportTime <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<Date> values) {
            addCriterion("reportTime in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<Date> values) {
            addCriterion("reportTime not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(Date value1, Date value2) {
            addCriterion("reportTime between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(Date value1, Date value2) {
            addCriterion("reportTime not between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalIsNull() {
            addCriterion("checkHospital is null");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalIsNotNull() {
            addCriterion("checkHospital is not null");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalEqualTo(String value) {
            addCriterion("checkHospital =", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalNotEqualTo(String value) {
            addCriterion("checkHospital <>", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalGreaterThan(String value) {
            addCriterion("checkHospital >", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalGreaterThanOrEqualTo(String value) {
            addCriterion("checkHospital >=", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalLessThan(String value) {
            addCriterion("checkHospital <", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalLessThanOrEqualTo(String value) {
            addCriterion("checkHospital <=", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalLike(String value) {
            addCriterion("checkHospital like", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalNotLike(String value) {
            addCriterion("checkHospital not like", value, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalIn(List<String> values) {
            addCriterion("checkHospital in", values, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalNotIn(List<String> values) {
            addCriterion("checkHospital not in", values, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalBetween(String value1, String value2) {
            addCriterion("checkHospital between", value1, value2, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andCheckhospitalNotBetween(String value1, String value2) {
            addCriterion("checkHospital not between", value1, value2, "checkhospital");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andHeadinfoIsNull() {
            addCriterion("headInfo is null");
            return (Criteria) this;
        }

        public Criteria andHeadinfoIsNotNull() {
            addCriterion("headInfo is not null");
            return (Criteria) this;
        }

        public Criteria andHeadinfoEqualTo(String value) {
            addCriterion("headInfo =", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoNotEqualTo(String value) {
            addCriterion("headInfo <>", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoGreaterThan(String value) {
            addCriterion("headInfo >", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoGreaterThanOrEqualTo(String value) {
            addCriterion("headInfo >=", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoLessThan(String value) {
            addCriterion("headInfo <", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoLessThanOrEqualTo(String value) {
            addCriterion("headInfo <=", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoLike(String value) {
            addCriterion("headInfo like", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoNotLike(String value) {
            addCriterion("headInfo not like", value, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoIn(List<String> values) {
            addCriterion("headInfo in", values, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoNotIn(List<String> values) {
            addCriterion("headInfo not in", values, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoBetween(String value1, String value2) {
            addCriterion("headInfo between", value1, value2, "headinfo");
            return (Criteria) this;
        }

        public Criteria andHeadinfoNotBetween(String value1, String value2) {
            addCriterion("headInfo not between", value1, value2, "headinfo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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