package com.aidoctor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetailItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailItemsExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("record_id like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("record_id not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("detail_id like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("detail_id not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlIsNull() {
            addCriterion("part_picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlIsNotNull() {
            addCriterion("part_picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlEqualTo(String value) {
            addCriterion("part_picture_url =", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlNotEqualTo(String value) {
            addCriterion("part_picture_url <>", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlGreaterThan(String value) {
            addCriterion("part_picture_url >", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("part_picture_url >=", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlLessThan(String value) {
            addCriterion("part_picture_url <", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("part_picture_url <=", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlLike(String value) {
            addCriterion("part_picture_url like", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlNotLike(String value) {
            addCriterion("part_picture_url not like", value, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlIn(List<String> values) {
            addCriterion("part_picture_url in", values, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlNotIn(List<String> values) {
            addCriterion("part_picture_url not in", values, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlBetween(String value1, String value2) {
            addCriterion("part_picture_url between", value1, value2, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureUrlNotBetween(String value1, String value2) {
            addCriterion("part_picture_url not between", value1, value2, "partPictureUrl");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultIsNull() {
            addCriterion("part_picture_result is null");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultIsNotNull() {
            addCriterion("part_picture_result is not null");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultEqualTo(String value) {
            addCriterion("part_picture_result =", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultNotEqualTo(String value) {
            addCriterion("part_picture_result <>", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultGreaterThan(String value) {
            addCriterion("part_picture_result >", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultGreaterThanOrEqualTo(String value) {
            addCriterion("part_picture_result >=", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultLessThan(String value) {
            addCriterion("part_picture_result <", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultLessThanOrEqualTo(String value) {
            addCriterion("part_picture_result <=", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultLike(String value) {
            addCriterion("part_picture_result like", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultNotLike(String value) {
            addCriterion("part_picture_result not like", value, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultIn(List<String> values) {
            addCriterion("part_picture_result in", values, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultNotIn(List<String> values) {
            addCriterion("part_picture_result not in", values, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultBetween(String value1, String value2) {
            addCriterion("part_picture_result between", value1, value2, "partPictureResult");
            return (Criteria) this;
        }

        public Criteria andPartPictureResultNotBetween(String value1, String value2) {
            addCriterion("part_picture_result not between", value1, value2, "partPictureResult");
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