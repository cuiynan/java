package com.aidoctor.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andFitemidIsNull() {
            addCriterion("FItemID is null");
            return (Criteria) this;
        }

        public Criteria andFitemidIsNotNull() {
            addCriterion("FItemID is not null");
            return (Criteria) this;
        }

        public Criteria andFitemidEqualTo(Integer value) {
            addCriterion("FItemID =", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidNotEqualTo(Integer value) {
            addCriterion("FItemID <>", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidGreaterThan(Integer value) {
            addCriterion("FItemID >", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FItemID >=", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidLessThan(Integer value) {
            addCriterion("FItemID <", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidLessThanOrEqualTo(Integer value) {
            addCriterion("FItemID <=", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidIn(List<Integer> values) {
            addCriterion("FItemID in", values, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidNotIn(List<Integer> values) {
            addCriterion("FItemID not in", values, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidBetween(Integer value1, Integer value2) {
            addCriterion("FItemID between", value1, value2, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("FItemID not between", value1, value2, "fitemid");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LoginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LoginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LoginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LoginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LoginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LoginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LoginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LoginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LoginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LoginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LoginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LoginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIsNull() {
            addCriterion("FDescription is null");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIsNotNull() {
            addCriterion("FDescription is not null");
            return (Criteria) this;
        }

        public Criteria andFdescriptionEqualTo(String value) {
            addCriterion("FDescription =", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotEqualTo(String value) {
            addCriterion("FDescription <>", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionGreaterThan(String value) {
            addCriterion("FDescription >", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("FDescription >=", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLessThan(String value) {
            addCriterion("FDescription <", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLessThanOrEqualTo(String value) {
            addCriterion("FDescription <=", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLike(String value) {
            addCriterion("FDescription like", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotLike(String value) {
            addCriterion("FDescription not like", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIn(List<String> values) {
            addCriterion("FDescription in", values, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotIn(List<String> values) {
            addCriterion("FDescription not in", values, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionBetween(String value1, String value2) {
            addCriterion("FDescription between", value1, value2, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotBetween(String value1, String value2) {
            addCriterion("FDescription not between", value1, value2, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFforbiddenIsNull() {
            addCriterion("FForbidden is null");
            return (Criteria) this;
        }

        public Criteria andFforbiddenIsNotNull() {
            addCriterion("FForbidden is not null");
            return (Criteria) this;
        }

        public Criteria andFforbiddenEqualTo(Boolean value) {
            addCriterion("FForbidden =", value, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenNotEqualTo(Boolean value) {
            addCriterion("FForbidden <>", value, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenGreaterThan(Boolean value) {
            addCriterion("FForbidden >", value, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FForbidden >=", value, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenLessThan(Boolean value) {
            addCriterion("FForbidden <", value, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenLessThanOrEqualTo(Boolean value) {
            addCriterion("FForbidden <=", value, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenIn(List<Boolean> values) {
            addCriterion("FForbidden in", values, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenNotIn(List<Boolean> values) {
            addCriterion("FForbidden not in", values, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenBetween(Boolean value1, Boolean value2) {
            addCriterion("FForbidden between", value1, value2, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFforbiddenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FForbidden not between", value1, value2, "fforbidden");
            return (Criteria) this;
        }

        public Criteria andFusertypeidIsNull() {
            addCriterion("FUserTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFusertypeidIsNotNull() {
            addCriterion("FUserTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFusertypeidEqualTo(Integer value) {
            addCriterion("FUserTypeID =", value, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidNotEqualTo(Integer value) {
            addCriterion("FUserTypeID <>", value, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidGreaterThan(Integer value) {
            addCriterion("FUserTypeID >", value, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUserTypeID >=", value, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidLessThan(Integer value) {
            addCriterion("FUserTypeID <", value, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FUserTypeID <=", value, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidIn(List<Integer> values) {
            addCriterion("FUserTypeID in", values, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidNotIn(List<Integer> values) {
            addCriterion("FUserTypeID not in", values, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidBetween(Integer value1, Integer value2) {
            addCriterion("FUserTypeID between", value1, value2, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FUserTypeID not between", value1, value2, "fusertypeid");
            return (Criteria) this;
        }

        public Criteria andFusertypenameIsNull() {
            addCriterion("FUserTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFusertypenameIsNotNull() {
            addCriterion("FUserTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFusertypenameEqualTo(String value) {
            addCriterion("FUserTypeName =", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameNotEqualTo(String value) {
            addCriterion("FUserTypeName <>", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameGreaterThan(String value) {
            addCriterion("FUserTypeName >", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameGreaterThanOrEqualTo(String value) {
            addCriterion("FUserTypeName >=", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameLessThan(String value) {
            addCriterion("FUserTypeName <", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameLessThanOrEqualTo(String value) {
            addCriterion("FUserTypeName <=", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameLike(String value) {
            addCriterion("FUserTypeName like", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameNotLike(String value) {
            addCriterion("FUserTypeName not like", value, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameIn(List<String> values) {
            addCriterion("FUserTypeName in", values, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameNotIn(List<String> values) {
            addCriterion("FUserTypeName not in", values, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameBetween(String value1, String value2) {
            addCriterion("FUserTypeName between", value1, value2, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFusertypenameNotBetween(String value1, String value2) {
            addCriterion("FUserTypeName not between", value1, value2, "fusertypename");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIsNull() {
            addCriterion("FCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIsNotNull() {
            addCriterion("FCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeEqualTo(Date value) {
            addCriterion("FCreateTime =", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotEqualTo(Date value) {
            addCriterion("FCreateTime <>", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeGreaterThan(Date value) {
            addCriterion("FCreateTime >", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FCreateTime >=", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeLessThan(Date value) {
            addCriterion("FCreateTime <", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("FCreateTime <=", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIn(List<Date> values) {
            addCriterion("FCreateTime in", values, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotIn(List<Date> values) {
            addCriterion("FCreateTime not in", values, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeBetween(Date value1, Date value2) {
            addCriterion("FCreateTime between", value1, value2, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("FCreateTime not between", value1, value2, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andUserclassIsNull() {
            addCriterion("UserClass is null");
            return (Criteria) this;
        }

        public Criteria andUserclassIsNotNull() {
            addCriterion("UserClass is not null");
            return (Criteria) this;
        }

        public Criteria andUserclassEqualTo(String value) {
            addCriterion("UserClass =", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassNotEqualTo(String value) {
            addCriterion("UserClass <>", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassGreaterThan(String value) {
            addCriterion("UserClass >", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassGreaterThanOrEqualTo(String value) {
            addCriterion("UserClass >=", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassLessThan(String value) {
            addCriterion("UserClass <", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassLessThanOrEqualTo(String value) {
            addCriterion("UserClass <=", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassLike(String value) {
            addCriterion("UserClass like", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassNotLike(String value) {
            addCriterion("UserClass not like", value, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassIn(List<String> values) {
            addCriterion("UserClass in", values, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassNotIn(List<String> values) {
            addCriterion("UserClass not in", values, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassBetween(String value1, String value2) {
            addCriterion("UserClass between", value1, value2, "userclass");
            return (Criteria) this;
        }

        public Criteria andUserclassNotBetween(String value1, String value2) {
            addCriterion("UserClass not between", value1, value2, "userclass");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNull() {
            addCriterion("ObjectID is null");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNotNull() {
            addCriterion("ObjectID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidEqualTo(Integer value) {
            addCriterion("ObjectID =", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotEqualTo(Integer value) {
            addCriterion("ObjectID <>", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThan(Integer value) {
            addCriterion("ObjectID >", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ObjectID >=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThan(Integer value) {
            addCriterion("ObjectID <", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThanOrEqualTo(Integer value) {
            addCriterion("ObjectID <=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidIn(List<Integer> values) {
            addCriterion("ObjectID in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotIn(List<Integer> values) {
            addCriterion("ObjectID not in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidBetween(Integer value1, Integer value2) {
            addCriterion("ObjectID between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("ObjectID not between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectnumIsNull() {
            addCriterion("ObjectNum is null");
            return (Criteria) this;
        }

        public Criteria andObjectnumIsNotNull() {
            addCriterion("ObjectNum is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnumEqualTo(String value) {
            addCriterion("ObjectNum =", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumNotEqualTo(String value) {
            addCriterion("ObjectNum <>", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumGreaterThan(String value) {
            addCriterion("ObjectNum >", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectNum >=", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumLessThan(String value) {
            addCriterion("ObjectNum <", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumLessThanOrEqualTo(String value) {
            addCriterion("ObjectNum <=", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumLike(String value) {
            addCriterion("ObjectNum like", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumNotLike(String value) {
            addCriterion("ObjectNum not like", value, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumIn(List<String> values) {
            addCriterion("ObjectNum in", values, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumNotIn(List<String> values) {
            addCriterion("ObjectNum not in", values, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumBetween(String value1, String value2) {
            addCriterion("ObjectNum between", value1, value2, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnumNotBetween(String value1, String value2) {
            addCriterion("ObjectNum not between", value1, value2, "objectnum");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNull() {
            addCriterion("ObjectName is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNotNull() {
            addCriterion("ObjectName is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameEqualTo(String value) {
            addCriterion("ObjectName =", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotEqualTo(String value) {
            addCriterion("ObjectName <>", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThan(String value) {
            addCriterion("ObjectName >", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectName >=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThan(String value) {
            addCriterion("ObjectName <", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThanOrEqualTo(String value) {
            addCriterion("ObjectName <=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLike(String value) {
            addCriterion("ObjectName like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotLike(String value) {
            addCriterion("ObjectName not like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIn(List<String> values) {
            addCriterion("ObjectName in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotIn(List<String> values) {
            addCriterion("ObjectName not in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameBetween(String value1, String value2) {
            addCriterion("ObjectName between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotBetween(String value1, String value2) {
            addCriterion("ObjectName not between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNull() {
            addCriterion("WxOpenId is null");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNotNull() {
            addCriterion("WxOpenId is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenidEqualTo(String value) {
            addCriterion("WxOpenId =", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotEqualTo(String value) {
            addCriterion("WxOpenId <>", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThan(String value) {
            addCriterion("WxOpenId >", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("WxOpenId >=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThan(String value) {
            addCriterion("WxOpenId <", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThanOrEqualTo(String value) {
            addCriterion("WxOpenId <=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLike(String value) {
            addCriterion("WxOpenId like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotLike(String value) {
            addCriterion("WxOpenId not like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidIn(List<String> values) {
            addCriterion("WxOpenId in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotIn(List<String> values) {
            addCriterion("WxOpenId not in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidBetween(String value1, String value2) {
            addCriterion("WxOpenId between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotBetween(String value1, String value2) {
            addCriterion("WxOpenId not between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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