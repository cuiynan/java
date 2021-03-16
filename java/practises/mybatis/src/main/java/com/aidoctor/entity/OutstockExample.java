package com.aidoctor.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstockExample() {
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

        public Criteria andFentryIdIsNull() {
            addCriterion("fentry_Id is null");
            return (Criteria) this;
        }

        public Criteria andFentryIdIsNotNull() {
            addCriterion("fentry_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFentryIdEqualTo(Integer value) {
            addCriterion("fentry_Id =", value, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdNotEqualTo(Integer value) {
            addCriterion("fentry_Id <>", value, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdGreaterThan(Integer value) {
            addCriterion("fentry_Id >", value, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fentry_Id >=", value, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdLessThan(Integer value) {
            addCriterion("fentry_Id <", value, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdLessThanOrEqualTo(Integer value) {
            addCriterion("fentry_Id <=", value, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdIn(List<Integer> values) {
            addCriterion("fentry_Id in", values, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdNotIn(List<Integer> values) {
            addCriterion("fentry_Id not in", values, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdBetween(Integer value1, Integer value2) {
            addCriterion("fentry_Id between", value1, value2, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFentryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fentry_Id not between", value1, value2, "fentryId");
            return (Criteria) this;
        }

        public Criteria andFdateIsNull() {
            addCriterion("fdate is null");
            return (Criteria) this;
        }

        public Criteria andFdateIsNotNull() {
            addCriterion("fdate is not null");
            return (Criteria) this;
        }

        public Criteria andFdateEqualTo(Date value) {
            addCriterion("fdate =", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotEqualTo(Date value) {
            addCriterion("fdate <>", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateGreaterThan(Date value) {
            addCriterion("fdate >", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateGreaterThanOrEqualTo(Date value) {
            addCriterion("fdate >=", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateLessThan(Date value) {
            addCriterion("fdate <", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateLessThanOrEqualTo(Date value) {
            addCriterion("fdate <=", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateIn(List<Date> values) {
            addCriterion("fdate in", values, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotIn(List<Date> values) {
            addCriterion("fdate not in", values, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateBetween(Date value1, Date value2) {
            addCriterion("fdate between", value1, value2, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotBetween(Date value1, Date value2) {
            addCriterion("fdate not between", value1, value2, "fdate");
            return (Criteria) this;
        }

        public Criteria andFbillNoIsNull() {
            addCriterion("fbill_no is null");
            return (Criteria) this;
        }

        public Criteria andFbillNoIsNotNull() {
            addCriterion("fbill_no is not null");
            return (Criteria) this;
        }

        public Criteria andFbillNoEqualTo(String value) {
            addCriterion("fbill_no =", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoNotEqualTo(String value) {
            addCriterion("fbill_no <>", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoGreaterThan(String value) {
            addCriterion("fbill_no >", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoGreaterThanOrEqualTo(String value) {
            addCriterion("fbill_no >=", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoLessThan(String value) {
            addCriterion("fbill_no <", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoLessThanOrEqualTo(String value) {
            addCriterion("fbill_no <=", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoLike(String value) {
            addCriterion("fbill_no like", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoNotLike(String value) {
            addCriterion("fbill_no not like", value, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoIn(List<String> values) {
            addCriterion("fbill_no in", values, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoNotIn(List<String> values) {
            addCriterion("fbill_no not in", values, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoBetween(String value1, String value2) {
            addCriterion("fbill_no between", value1, value2, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFbillNoNotBetween(String value1, String value2) {
            addCriterion("fbill_no not between", value1, value2, "fbillNo");
            return (Criteria) this;
        }

        public Criteria andFitemIdIsNull() {
            addCriterion("fitem_id is null");
            return (Criteria) this;
        }

        public Criteria andFitemIdIsNotNull() {
            addCriterion("fitem_id is not null");
            return (Criteria) this;
        }

        public Criteria andFitemIdEqualTo(Integer value) {
            addCriterion("fitem_id =", value, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdNotEqualTo(Integer value) {
            addCriterion("fitem_id <>", value, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdGreaterThan(Integer value) {
            addCriterion("fitem_id >", value, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fitem_id >=", value, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdLessThan(Integer value) {
            addCriterion("fitem_id <", value, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdLessThanOrEqualTo(Integer value) {
            addCriterion("fitem_id <=", value, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdIn(List<Integer> values) {
            addCriterion("fitem_id in", values, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdNotIn(List<Integer> values) {
            addCriterion("fitem_id not in", values, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdBetween(Integer value1, Integer value2) {
            addCriterion("fitem_id between", value1, value2, "fitemId");
            return (Criteria) this;
        }

        public Criteria andFitemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fitem_id not between", value1, value2, "fitemId");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNull() {
            addCriterion("item_number is null");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNotNull() {
            addCriterion("item_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumberEqualTo(String value) {
            addCriterion("item_number =", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotEqualTo(String value) {
            addCriterion("item_number <>", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThan(String value) {
            addCriterion("item_number >", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThanOrEqualTo(String value) {
            addCriterion("item_number >=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThan(String value) {
            addCriterion("item_number <", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThanOrEqualTo(String value) {
            addCriterion("item_number <=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLike(String value) {
            addCriterion("item_number like", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotLike(String value) {
            addCriterion("item_number not like", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberIn(List<String> values) {
            addCriterion("item_number in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotIn(List<String> values) {
            addCriterion("item_number not in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberBetween(String value1, String value2) {
            addCriterion("item_number between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotBetween(String value1, String value2) {
            addCriterion("item_number not between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andFmodelIsNull() {
            addCriterion("fmodel is null");
            return (Criteria) this;
        }

        public Criteria andFmodelIsNotNull() {
            addCriterion("fmodel is not null");
            return (Criteria) this;
        }

        public Criteria andFmodelEqualTo(String value) {
            addCriterion("fmodel =", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotEqualTo(String value) {
            addCriterion("fmodel <>", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelGreaterThan(String value) {
            addCriterion("fmodel >", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelGreaterThanOrEqualTo(String value) {
            addCriterion("fmodel >=", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelLessThan(String value) {
            addCriterion("fmodel <", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelLessThanOrEqualTo(String value) {
            addCriterion("fmodel <=", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelLike(String value) {
            addCriterion("fmodel like", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotLike(String value) {
            addCriterion("fmodel not like", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelIn(List<String> values) {
            addCriterion("fmodel in", values, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotIn(List<String> values) {
            addCriterion("fmodel not in", values, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelBetween(String value1, String value2) {
            addCriterion("fmodel between", value1, value2, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotBetween(String value1, String value2) {
            addCriterion("fmodel not between", value1, value2, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdIsNull() {
            addCriterion("fdc_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdIsNotNull() {
            addCriterion("fdc_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdEqualTo(Integer value) {
            addCriterion("fdc_stock_id =", value, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdNotEqualTo(Integer value) {
            addCriterion("fdc_stock_id <>", value, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdGreaterThan(Integer value) {
            addCriterion("fdc_stock_id >", value, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdc_stock_id >=", value, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdLessThan(Integer value) {
            addCriterion("fdc_stock_id <", value, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("fdc_stock_id <=", value, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdIn(List<Integer> values) {
            addCriterion("fdc_stock_id in", values, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdNotIn(List<Integer> values) {
            addCriterion("fdc_stock_id not in", values, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdBetween(Integer value1, Integer value2) {
            addCriterion("fdc_stock_id between", value1, value2, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fdc_stock_id not between", value1, value2, "fdcStockId");
            return (Criteria) this;
        }

        public Criteria andFdcStockIsNull() {
            addCriterion("fdc_stock is null");
            return (Criteria) this;
        }

        public Criteria andFdcStockIsNotNull() {
            addCriterion("fdc_stock is not null");
            return (Criteria) this;
        }

        public Criteria andFdcStockEqualTo(String value) {
            addCriterion("fdc_stock =", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockNotEqualTo(String value) {
            addCriterion("fdc_stock <>", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockGreaterThan(String value) {
            addCriterion("fdc_stock >", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockGreaterThanOrEqualTo(String value) {
            addCriterion("fdc_stock >=", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockLessThan(String value) {
            addCriterion("fdc_stock <", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockLessThanOrEqualTo(String value) {
            addCriterion("fdc_stock <=", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockLike(String value) {
            addCriterion("fdc_stock like", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockNotLike(String value) {
            addCriterion("fdc_stock not like", value, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockIn(List<String> values) {
            addCriterion("fdc_stock in", values, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockNotIn(List<String> values) {
            addCriterion("fdc_stock not in", values, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockBetween(String value1, String value2) {
            addCriterion("fdc_stock between", value1, value2, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdcStockNotBetween(String value1, String value2) {
            addCriterion("fdc_stock not between", value1, value2, "fdcStock");
            return (Criteria) this;
        }

        public Criteria andFdeptIdIsNull() {
            addCriterion("fdept_id is null");
            return (Criteria) this;
        }

        public Criteria andFdeptIdIsNotNull() {
            addCriterion("fdept_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptIdEqualTo(Integer value) {
            addCriterion("fdept_id =", value, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdNotEqualTo(Integer value) {
            addCriterion("fdept_id <>", value, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdGreaterThan(Integer value) {
            addCriterion("fdept_id >", value, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdept_id >=", value, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdLessThan(Integer value) {
            addCriterion("fdept_id <", value, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("fdept_id <=", value, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdIn(List<Integer> values) {
            addCriterion("fdept_id in", values, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdNotIn(List<Integer> values) {
            addCriterion("fdept_id not in", values, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdBetween(Integer value1, Integer value2) {
            addCriterion("fdept_id between", value1, value2, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andFdeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fdept_id not between", value1, value2, "fdeptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andFempIdIsNull() {
            addCriterion("femp_id is null");
            return (Criteria) this;
        }

        public Criteria andFempIdIsNotNull() {
            addCriterion("femp_id is not null");
            return (Criteria) this;
        }

        public Criteria andFempIdEqualTo(Integer value) {
            addCriterion("femp_id =", value, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdNotEqualTo(Integer value) {
            addCriterion("femp_id <>", value, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdGreaterThan(Integer value) {
            addCriterion("femp_id >", value, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("femp_id >=", value, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdLessThan(Integer value) {
            addCriterion("femp_id <", value, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdLessThanOrEqualTo(Integer value) {
            addCriterion("femp_id <=", value, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdIn(List<Integer> values) {
            addCriterion("femp_id in", values, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdNotIn(List<Integer> values) {
            addCriterion("femp_id not in", values, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdBetween(Integer value1, Integer value2) {
            addCriterion("femp_id between", value1, value2, "fempId");
            return (Criteria) this;
        }

        public Criteria andFempIdNotBetween(Integer value1, Integer value2) {
            addCriterion("femp_id not between", value1, value2, "fempId");
            return (Criteria) this;
        }

        public Criteria andYewuyuanIsNull() {
            addCriterion("yewuyuan is null");
            return (Criteria) this;
        }

        public Criteria andYewuyuanIsNotNull() {
            addCriterion("yewuyuan is not null");
            return (Criteria) this;
        }

        public Criteria andYewuyuanEqualTo(String value) {
            addCriterion("yewuyuan =", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanNotEqualTo(String value) {
            addCriterion("yewuyuan <>", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanGreaterThan(String value) {
            addCriterion("yewuyuan >", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanGreaterThanOrEqualTo(String value) {
            addCriterion("yewuyuan >=", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanLessThan(String value) {
            addCriterion("yewuyuan <", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanLessThanOrEqualTo(String value) {
            addCriterion("yewuyuan <=", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanLike(String value) {
            addCriterion("yewuyuan like", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanNotLike(String value) {
            addCriterion("yewuyuan not like", value, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanIn(List<String> values) {
            addCriterion("yewuyuan in", values, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanNotIn(List<String> values) {
            addCriterion("yewuyuan not in", values, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanBetween(String value1, String value2) {
            addCriterion("yewuyuan between", value1, value2, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andYewuyuanNotBetween(String value1, String value2) {
            addCriterion("yewuyuan not between", value1, value2, "yewuyuan");
            return (Criteria) this;
        }

        public Criteria andFcusIdIsNull() {
            addCriterion("fcus_id is null");
            return (Criteria) this;
        }

        public Criteria andFcusIdIsNotNull() {
            addCriterion("fcus_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcusIdEqualTo(Integer value) {
            addCriterion("fcus_id =", value, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdNotEqualTo(Integer value) {
            addCriterion("fcus_id <>", value, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdGreaterThan(Integer value) {
            addCriterion("fcus_id >", value, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcus_id >=", value, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdLessThan(Integer value) {
            addCriterion("fcus_id <", value, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdLessThanOrEqualTo(Integer value) {
            addCriterion("fcus_id <=", value, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdIn(List<Integer> values) {
            addCriterion("fcus_id in", values, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdNotIn(List<Integer> values) {
            addCriterion("fcus_id not in", values, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdBetween(Integer value1, Integer value2) {
            addCriterion("fcus_id between", value1, value2, "fcusId");
            return (Criteria) this;
        }

        public Criteria andFcusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fcus_id not between", value1, value2, "fcusId");
            return (Criteria) this;
        }

        public Criteria andCusNumIsNull() {
            addCriterion("cus_num is null");
            return (Criteria) this;
        }

        public Criteria andCusNumIsNotNull() {
            addCriterion("cus_num is not null");
            return (Criteria) this;
        }

        public Criteria andCusNumEqualTo(String value) {
            addCriterion("cus_num =", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumNotEqualTo(String value) {
            addCriterion("cus_num <>", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumGreaterThan(String value) {
            addCriterion("cus_num >", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumGreaterThanOrEqualTo(String value) {
            addCriterion("cus_num >=", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumLessThan(String value) {
            addCriterion("cus_num <", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumLessThanOrEqualTo(String value) {
            addCriterion("cus_num <=", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumLike(String value) {
            addCriterion("cus_num like", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumNotLike(String value) {
            addCriterion("cus_num not like", value, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumIn(List<String> values) {
            addCriterion("cus_num in", values, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumNotIn(List<String> values) {
            addCriterion("cus_num not in", values, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumBetween(String value1, String value2) {
            addCriterion("cus_num between", value1, value2, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNumNotBetween(String value1, String value2) {
            addCriterion("cus_num not between", value1, value2, "cusNum");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andEcusIdIsNull() {
            addCriterion("ecus_id is null");
            return (Criteria) this;
        }

        public Criteria andEcusIdIsNotNull() {
            addCriterion("ecus_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcusIdEqualTo(Integer value) {
            addCriterion("ecus_id =", value, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdNotEqualTo(Integer value) {
            addCriterion("ecus_id <>", value, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdGreaterThan(Integer value) {
            addCriterion("ecus_id >", value, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecus_id >=", value, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdLessThan(Integer value) {
            addCriterion("ecus_id <", value, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdLessThanOrEqualTo(Integer value) {
            addCriterion("ecus_id <=", value, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdIn(List<Integer> values) {
            addCriterion("ecus_id in", values, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdNotIn(List<Integer> values) {
            addCriterion("ecus_id not in", values, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdBetween(Integer value1, Integer value2) {
            addCriterion("ecus_id between", value1, value2, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ecus_id not between", value1, value2, "ecusId");
            return (Criteria) this;
        }

        public Criteria andEcusNumIsNull() {
            addCriterion("ecus_num is null");
            return (Criteria) this;
        }

        public Criteria andEcusNumIsNotNull() {
            addCriterion("ecus_num is not null");
            return (Criteria) this;
        }

        public Criteria andEcusNumEqualTo(String value) {
            addCriterion("ecus_num =", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumNotEqualTo(String value) {
            addCriterion("ecus_num <>", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumGreaterThan(String value) {
            addCriterion("ecus_num >", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumGreaterThanOrEqualTo(String value) {
            addCriterion("ecus_num >=", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumLessThan(String value) {
            addCriterion("ecus_num <", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumLessThanOrEqualTo(String value) {
            addCriterion("ecus_num <=", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumLike(String value) {
            addCriterion("ecus_num like", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumNotLike(String value) {
            addCriterion("ecus_num not like", value, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumIn(List<String> values) {
            addCriterion("ecus_num in", values, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumNotIn(List<String> values) {
            addCriterion("ecus_num not in", values, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumBetween(String value1, String value2) {
            addCriterion("ecus_num between", value1, value2, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNumNotBetween(String value1, String value2) {
            addCriterion("ecus_num not between", value1, value2, "ecusNum");
            return (Criteria) this;
        }

        public Criteria andEcusNameIsNull() {
            addCriterion("ecus_name is null");
            return (Criteria) this;
        }

        public Criteria andEcusNameIsNotNull() {
            addCriterion("ecus_name is not null");
            return (Criteria) this;
        }

        public Criteria andEcusNameEqualTo(String value) {
            addCriterion("ecus_name =", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameNotEqualTo(String value) {
            addCriterion("ecus_name <>", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameGreaterThan(String value) {
            addCriterion("ecus_name >", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameGreaterThanOrEqualTo(String value) {
            addCriterion("ecus_name >=", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameLessThan(String value) {
            addCriterion("ecus_name <", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameLessThanOrEqualTo(String value) {
            addCriterion("ecus_name <=", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameLike(String value) {
            addCriterion("ecus_name like", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameNotLike(String value) {
            addCriterion("ecus_name not like", value, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameIn(List<String> values) {
            addCriterion("ecus_name in", values, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameNotIn(List<String> values) {
            addCriterion("ecus_name not in", values, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameBetween(String value1, String value2) {
            addCriterion("ecus_name between", value1, value2, "ecusName");
            return (Criteria) this;
        }

        public Criteria andEcusNameNotBetween(String value1, String value2) {
            addCriterion("ecus_name not between", value1, value2, "ecusName");
            return (Criteria) this;
        }

        public Criteria andFunitIdIsNull() {
            addCriterion("funit_id is null");
            return (Criteria) this;
        }

        public Criteria andFunitIdIsNotNull() {
            addCriterion("funit_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunitIdEqualTo(Integer value) {
            addCriterion("funit_id =", value, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdNotEqualTo(Integer value) {
            addCriterion("funit_id <>", value, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdGreaterThan(Integer value) {
            addCriterion("funit_id >", value, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("funit_id >=", value, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdLessThan(Integer value) {
            addCriterion("funit_id <", value, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdLessThanOrEqualTo(Integer value) {
            addCriterion("funit_id <=", value, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdIn(List<Integer> values) {
            addCriterion("funit_id in", values, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdNotIn(List<Integer> values) {
            addCriterion("funit_id not in", values, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdBetween(Integer value1, Integer value2) {
            addCriterion("funit_id between", value1, value2, "funitId");
            return (Criteria) this;
        }

        public Criteria andFunitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("funit_id not between", value1, value2, "funitId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andFqtyIsNull() {
            addCriterion("fqty is null");
            return (Criteria) this;
        }

        public Criteria andFqtyIsNotNull() {
            addCriterion("fqty is not null");
            return (Criteria) this;
        }

        public Criteria andFqtyEqualTo(BigDecimal value) {
            addCriterion("fqty =", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyNotEqualTo(BigDecimal value) {
            addCriterion("fqty <>", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyGreaterThan(BigDecimal value) {
            addCriterion("fqty >", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fqty >=", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyLessThan(BigDecimal value) {
            addCriterion("fqty <", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fqty <=", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyIn(List<BigDecimal> values) {
            addCriterion("fqty in", values, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyNotIn(List<BigDecimal> values) {
            addCriterion("fqty not in", values, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fqty between", value1, value2, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fqty not between", value1, value2, "fqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyIsNull() {
            addCriterion("fauxqty is null");
            return (Criteria) this;
        }

        public Criteria andFauxqtyIsNotNull() {
            addCriterion("fauxqty is not null");
            return (Criteria) this;
        }

        public Criteria andFauxqtyEqualTo(BigDecimal value) {
            addCriterion("fauxqty =", value, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyNotEqualTo(BigDecimal value) {
            addCriterion("fauxqty <>", value, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyGreaterThan(BigDecimal value) {
            addCriterion("fauxqty >", value, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fauxqty >=", value, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyLessThan(BigDecimal value) {
            addCriterion("fauxqty <", value, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fauxqty <=", value, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyIn(List<BigDecimal> values) {
            addCriterion("fauxqty in", values, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyNotIn(List<BigDecimal> values) {
            addCriterion("fauxqty not in", values, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fauxqty between", value1, value2, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fauxqty not between", value1, value2, "fauxqty");
            return (Criteria) this;
        }

        public Criteria andFauxPriceIsNull() {
            addCriterion("faux_price is null");
            return (Criteria) this;
        }

        public Criteria andFauxPriceIsNotNull() {
            addCriterion("faux_price is not null");
            return (Criteria) this;
        }

        public Criteria andFauxPriceEqualTo(BigDecimal value) {
            addCriterion("faux_price =", value, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceNotEqualTo(BigDecimal value) {
            addCriterion("faux_price <>", value, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceGreaterThan(BigDecimal value) {
            addCriterion("faux_price >", value, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("faux_price >=", value, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceLessThan(BigDecimal value) {
            addCriterion("faux_price <", value, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("faux_price <=", value, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceIn(List<BigDecimal> values) {
            addCriterion("faux_price in", values, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceNotIn(List<BigDecimal> values) {
            addCriterion("faux_price not in", values, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("faux_price between", value1, value2, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFauxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("faux_price not between", value1, value2, "fauxPrice");
            return (Criteria) this;
        }

        public Criteria andFamoutIsNull() {
            addCriterion("famout is null");
            return (Criteria) this;
        }

        public Criteria andFamoutIsNotNull() {
            addCriterion("famout is not null");
            return (Criteria) this;
        }

        public Criteria andFamoutEqualTo(BigDecimal value) {
            addCriterion("famout =", value, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutNotEqualTo(BigDecimal value) {
            addCriterion("famout <>", value, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutGreaterThan(BigDecimal value) {
            addCriterion("famout >", value, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("famout >=", value, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutLessThan(BigDecimal value) {
            addCriterion("famout <", value, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("famout <=", value, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutIn(List<BigDecimal> values) {
            addCriterion("famout in", values, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutNotIn(List<BigDecimal> values) {
            addCriterion("famout not in", values, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("famout between", value1, value2, "famout");
            return (Criteria) this;
        }

        public Criteria andFamoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("famout not between", value1, value2, "famout");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceIsNull() {
            addCriterion("fconsign_price is null");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceIsNotNull() {
            addCriterion("fconsign_price is not null");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceEqualTo(BigDecimal value) {
            addCriterion("fconsign_price =", value, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceNotEqualTo(BigDecimal value) {
            addCriterion("fconsign_price <>", value, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceGreaterThan(BigDecimal value) {
            addCriterion("fconsign_price >", value, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fconsign_price >=", value, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceLessThan(BigDecimal value) {
            addCriterion("fconsign_price <", value, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fconsign_price <=", value, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceIn(List<BigDecimal> values) {
            addCriterion("fconsign_price in", values, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceNotIn(List<BigDecimal> values) {
            addCriterion("fconsign_price not in", values, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fconsign_price between", value1, value2, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fconsign_price not between", value1, value2, "fconsignPrice");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutIsNull() {
            addCriterion("fconsign_amout is null");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutIsNotNull() {
            addCriterion("fconsign_amout is not null");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutEqualTo(BigDecimal value) {
            addCriterion("fconsign_amout =", value, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutNotEqualTo(BigDecimal value) {
            addCriterion("fconsign_amout <>", value, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutGreaterThan(BigDecimal value) {
            addCriterion("fconsign_amout >", value, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fconsign_amout >=", value, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutLessThan(BigDecimal value) {
            addCriterion("fconsign_amout <", value, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fconsign_amout <=", value, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutIn(List<BigDecimal> values) {
            addCriterion("fconsign_amout in", values, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutNotIn(List<BigDecimal> values) {
            addCriterion("fconsign_amout not in", values, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fconsign_amout between", value1, value2, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFconsignAmoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fconsign_amout not between", value1, value2, "fconsignAmout");
            return (Criteria) this;
        }

        public Criteria andFbatchNoIsNull() {
            addCriterion("fbatch_no is null");
            return (Criteria) this;
        }

        public Criteria andFbatchNoIsNotNull() {
            addCriterion("fbatch_no is not null");
            return (Criteria) this;
        }

        public Criteria andFbatchNoEqualTo(String value) {
            addCriterion("fbatch_no =", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoNotEqualTo(String value) {
            addCriterion("fbatch_no <>", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoGreaterThan(String value) {
            addCriterion("fbatch_no >", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("fbatch_no >=", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoLessThan(String value) {
            addCriterion("fbatch_no <", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoLessThanOrEqualTo(String value) {
            addCriterion("fbatch_no <=", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoLike(String value) {
            addCriterion("fbatch_no like", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoNotLike(String value) {
            addCriterion("fbatch_no not like", value, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoIn(List<String> values) {
            addCriterion("fbatch_no in", values, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoNotIn(List<String> values) {
            addCriterion("fbatch_no not in", values, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoBetween(String value1, String value2) {
            addCriterion("fbatch_no between", value1, value2, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andFbatchNoNotBetween(String value1, String value2) {
            addCriterion("fbatch_no not between", value1, value2, "fbatchNo");
            return (Criteria) this;
        }

        public Criteria andSnlistIsNull() {
            addCriterion("snlist is null");
            return (Criteria) this;
        }

        public Criteria andSnlistIsNotNull() {
            addCriterion("snlist is not null");
            return (Criteria) this;
        }

        public Criteria andSnlistEqualTo(String value) {
            addCriterion("snlist =", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistNotEqualTo(String value) {
            addCriterion("snlist <>", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistGreaterThan(String value) {
            addCriterion("snlist >", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistGreaterThanOrEqualTo(String value) {
            addCriterion("snlist >=", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistLessThan(String value) {
            addCriterion("snlist <", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistLessThanOrEqualTo(String value) {
            addCriterion("snlist <=", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistLike(String value) {
            addCriterion("snlist like", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistNotLike(String value) {
            addCriterion("snlist not like", value, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistIn(List<String> values) {
            addCriterion("snlist in", values, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistNotIn(List<String> values) {
            addCriterion("snlist not in", values, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistBetween(String value1, String value2) {
            addCriterion("snlist between", value1, value2, "snlist");
            return (Criteria) this;
        }

        public Criteria andSnlistNotBetween(String value1, String value2) {
            addCriterion("snlist not between", value1, value2, "snlist");
            return (Criteria) this;
        }

        public Criteria andFkperiodIsNull() {
            addCriterion("fkperiod is null");
            return (Criteria) this;
        }

        public Criteria andFkperiodIsNotNull() {
            addCriterion("fkperiod is not null");
            return (Criteria) this;
        }

        public Criteria andFkperiodEqualTo(Integer value) {
            addCriterion("fkperiod =", value, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodNotEqualTo(Integer value) {
            addCriterion("fkperiod <>", value, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodGreaterThan(Integer value) {
            addCriterion("fkperiod >", value, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("fkperiod >=", value, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodLessThan(Integer value) {
            addCriterion("fkperiod <", value, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodLessThanOrEqualTo(Integer value) {
            addCriterion("fkperiod <=", value, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodIn(List<Integer> values) {
            addCriterion("fkperiod in", values, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodNotIn(List<Integer> values) {
            addCriterion("fkperiod not in", values, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodBetween(Integer value1, Integer value2) {
            addCriterion("fkperiod between", value1, value2, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("fkperiod not between", value1, value2, "fkperiod");
            return (Criteria) this;
        }

        public Criteria andFkfDateIsNull() {
            addCriterion("fkf_date is null");
            return (Criteria) this;
        }

        public Criteria andFkfDateIsNotNull() {
            addCriterion("fkf_date is not null");
            return (Criteria) this;
        }

        public Criteria andFkfDateEqualTo(Date value) {
            addCriterion("fkf_date =", value, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateNotEqualTo(Date value) {
            addCriterion("fkf_date <>", value, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateGreaterThan(Date value) {
            addCriterion("fkf_date >", value, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fkf_date >=", value, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateLessThan(Date value) {
            addCriterion("fkf_date <", value, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateLessThanOrEqualTo(Date value) {
            addCriterion("fkf_date <=", value, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateIn(List<Date> values) {
            addCriterion("fkf_date in", values, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateNotIn(List<Date> values) {
            addCriterion("fkf_date not in", values, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateBetween(Date value1, Date value2) {
            addCriterion("fkf_date between", value1, value2, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andFkfDateNotBetween(Date value1, Date value2) {
            addCriterion("fkf_date not between", value1, value2, "fkfDate");
            return (Criteria) this;
        }

        public Criteria andForderBillNoIsNull() {
            addCriterion("forder_bill_no is null");
            return (Criteria) this;
        }

        public Criteria andForderBillNoIsNotNull() {
            addCriterion("forder_bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andForderBillNoEqualTo(String value) {
            addCriterion("forder_bill_no =", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoNotEqualTo(String value) {
            addCriterion("forder_bill_no <>", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoGreaterThan(String value) {
            addCriterion("forder_bill_no >", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("forder_bill_no >=", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoLessThan(String value) {
            addCriterion("forder_bill_no <", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoLessThanOrEqualTo(String value) {
            addCriterion("forder_bill_no <=", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoLike(String value) {
            addCriterion("forder_bill_no like", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoNotLike(String value) {
            addCriterion("forder_bill_no not like", value, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoIn(List<String> values) {
            addCriterion("forder_bill_no in", values, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoNotIn(List<String> values) {
            addCriterion("forder_bill_no not in", values, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoBetween(String value1, String value2) {
            addCriterion("forder_bill_no between", value1, value2, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andForderBillNoNotBetween(String value1, String value2) {
            addCriterion("forder_bill_no not between", value1, value2, "forderBillNo");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andWldhIsNull() {
            addCriterion("wldh is null");
            return (Criteria) this;
        }

        public Criteria andWldhIsNotNull() {
            addCriterion("wldh is not null");
            return (Criteria) this;
        }

        public Criteria andWldhEqualTo(String value) {
            addCriterion("wldh =", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhNotEqualTo(String value) {
            addCriterion("wldh <>", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhGreaterThan(String value) {
            addCriterion("wldh >", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhGreaterThanOrEqualTo(String value) {
            addCriterion("wldh >=", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhLessThan(String value) {
            addCriterion("wldh <", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhLessThanOrEqualTo(String value) {
            addCriterion("wldh <=", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhLike(String value) {
            addCriterion("wldh like", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhNotLike(String value) {
            addCriterion("wldh not like", value, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhIn(List<String> values) {
            addCriterion("wldh in", values, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhNotIn(List<String> values) {
            addCriterion("wldh not in", values, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhBetween(String value1, String value2) {
            addCriterion("wldh between", value1, value2, "wldh");
            return (Criteria) this;
        }

        public Criteria andWldhNotBetween(String value1, String value2) {
            addCriterion("wldh not between", value1, value2, "wldh");
            return (Criteria) this;
        }

        public Criteria andYsdwIsNull() {
            addCriterion("ysdw is null");
            return (Criteria) this;
        }

        public Criteria andYsdwIsNotNull() {
            addCriterion("ysdw is not null");
            return (Criteria) this;
        }

        public Criteria andYsdwEqualTo(String value) {
            addCriterion("ysdw =", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwNotEqualTo(String value) {
            addCriterion("ysdw <>", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwGreaterThan(String value) {
            addCriterion("ysdw >", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwGreaterThanOrEqualTo(String value) {
            addCriterion("ysdw >=", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwLessThan(String value) {
            addCriterion("ysdw <", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwLessThanOrEqualTo(String value) {
            addCriterion("ysdw <=", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwLike(String value) {
            addCriterion("ysdw like", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwNotLike(String value) {
            addCriterion("ysdw not like", value, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwIn(List<String> values) {
            addCriterion("ysdw in", values, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwNotIn(List<String> values) {
            addCriterion("ysdw not in", values, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwBetween(String value1, String value2) {
            addCriterion("ysdw between", value1, value2, "ysdw");
            return (Criteria) this;
        }

        public Criteria andYsdwNotBetween(String value1, String value2) {
            addCriterion("ysdw not between", value1, value2, "ysdw");
            return (Criteria) this;
        }

        public Criteria andDhdhIsNull() {
            addCriterion("dhdh is null");
            return (Criteria) this;
        }

        public Criteria andDhdhIsNotNull() {
            addCriterion("dhdh is not null");
            return (Criteria) this;
        }

        public Criteria andDhdhEqualTo(String value) {
            addCriterion("dhdh =", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotEqualTo(String value) {
            addCriterion("dhdh <>", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhGreaterThan(String value) {
            addCriterion("dhdh >", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhGreaterThanOrEqualTo(String value) {
            addCriterion("dhdh >=", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhLessThan(String value) {
            addCriterion("dhdh <", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhLessThanOrEqualTo(String value) {
            addCriterion("dhdh <=", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhLike(String value) {
            addCriterion("dhdh like", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotLike(String value) {
            addCriterion("dhdh not like", value, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhIn(List<String> values) {
            addCriterion("dhdh in", values, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotIn(List<String> values) {
            addCriterion("dhdh not in", values, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhBetween(String value1, String value2) {
            addCriterion("dhdh between", value1, value2, "dhdh");
            return (Criteria) this;
        }

        public Criteria andDhdhNotBetween(String value1, String value2) {
            addCriterion("dhdh not between", value1, value2, "dhdh");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(String value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(String value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(String value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(String value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(String value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(String value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLike(String value) {
            addCriterion("order_date like", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotLike(String value) {
            addCriterion("order_date not like", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<String> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<String> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(String value1, String value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(String value1, String value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andLlysdhIsNull() {
            addCriterion("llysdh is null");
            return (Criteria) this;
        }

        public Criteria andLlysdhIsNotNull() {
            addCriterion("llysdh is not null");
            return (Criteria) this;
        }

        public Criteria andLlysdhEqualTo(String value) {
            addCriterion("llysdh =", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhNotEqualTo(String value) {
            addCriterion("llysdh <>", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhGreaterThan(String value) {
            addCriterion("llysdh >", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhGreaterThanOrEqualTo(String value) {
            addCriterion("llysdh >=", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhLessThan(String value) {
            addCriterion("llysdh <", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhLessThanOrEqualTo(String value) {
            addCriterion("llysdh <=", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhLike(String value) {
            addCriterion("llysdh like", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhNotLike(String value) {
            addCriterion("llysdh not like", value, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhIn(List<String> values) {
            addCriterion("llysdh in", values, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhNotIn(List<String> values) {
            addCriterion("llysdh not in", values, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhBetween(String value1, String value2) {
            addCriterion("llysdh between", value1, value2, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdhNotBetween(String value1, String value2) {
            addCriterion("llysdh not between", value1, value2, "llysdh");
            return (Criteria) this;
        }

        public Criteria andLlysdwIsNull() {
            addCriterion("llysdw is null");
            return (Criteria) this;
        }

        public Criteria andLlysdwIsNotNull() {
            addCriterion("llysdw is not null");
            return (Criteria) this;
        }

        public Criteria andLlysdwEqualTo(String value) {
            addCriterion("llysdw =", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwNotEqualTo(String value) {
            addCriterion("llysdw <>", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwGreaterThan(String value) {
            addCriterion("llysdw >", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwGreaterThanOrEqualTo(String value) {
            addCriterion("llysdw >=", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwLessThan(String value) {
            addCriterion("llysdw <", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwLessThanOrEqualTo(String value) {
            addCriterion("llysdw <=", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwLike(String value) {
            addCriterion("llysdw like", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwNotLike(String value) {
            addCriterion("llysdw not like", value, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwIn(List<String> values) {
            addCriterion("llysdw in", values, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwNotIn(List<String> values) {
            addCriterion("llysdw not in", values, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwBetween(String value1, String value2) {
            addCriterion("llysdw between", value1, value2, "llysdw");
            return (Criteria) this;
        }

        public Criteria andLlysdwNotBetween(String value1, String value2) {
            addCriterion("llysdw not between", value1, value2, "llysdw");
            return (Criteria) this;
        }

        public Criteria andFpwldhIsNull() {
            addCriterion("fpwldh is null");
            return (Criteria) this;
        }

        public Criteria andFpwldhIsNotNull() {
            addCriterion("fpwldh is not null");
            return (Criteria) this;
        }

        public Criteria andFpwldhEqualTo(String value) {
            addCriterion("fpwldh =", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhNotEqualTo(String value) {
            addCriterion("fpwldh <>", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhGreaterThan(String value) {
            addCriterion("fpwldh >", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhGreaterThanOrEqualTo(String value) {
            addCriterion("fpwldh >=", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhLessThan(String value) {
            addCriterion("fpwldh <", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhLessThanOrEqualTo(String value) {
            addCriterion("fpwldh <=", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhLike(String value) {
            addCriterion("fpwldh like", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhNotLike(String value) {
            addCriterion("fpwldh not like", value, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhIn(List<String> values) {
            addCriterion("fpwldh in", values, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhNotIn(List<String> values) {
            addCriterion("fpwldh not in", values, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhBetween(String value1, String value2) {
            addCriterion("fpwldh between", value1, value2, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpwldhNotBetween(String value1, String value2) {
            addCriterion("fpwldh not between", value1, value2, "fpwldh");
            return (Criteria) this;
        }

        public Criteria andFpysdwIsNull() {
            addCriterion("fpysdw is null");
            return (Criteria) this;
        }

        public Criteria andFpysdwIsNotNull() {
            addCriterion("fpysdw is not null");
            return (Criteria) this;
        }

        public Criteria andFpysdwEqualTo(String value) {
            addCriterion("fpysdw =", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwNotEqualTo(String value) {
            addCriterion("fpysdw <>", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwGreaterThan(String value) {
            addCriterion("fpysdw >", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwGreaterThanOrEqualTo(String value) {
            addCriterion("fpysdw >=", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwLessThan(String value) {
            addCriterion("fpysdw <", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwLessThanOrEqualTo(String value) {
            addCriterion("fpysdw <=", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwLike(String value) {
            addCriterion("fpysdw like", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwNotLike(String value) {
            addCriterion("fpysdw not like", value, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwIn(List<String> values) {
            addCriterion("fpysdw in", values, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwNotIn(List<String> values) {
            addCriterion("fpysdw not in", values, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwBetween(String value1, String value2) {
            addCriterion("fpysdw between", value1, value2, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andFpysdwNotBetween(String value1, String value2) {
            addCriterion("fpysdw not between", value1, value2, "fpysdw");
            return (Criteria) this;
        }

        public Criteria andPkidIsNull() {
            addCriterion("pkid is null");
            return (Criteria) this;
        }

        public Criteria andPkidIsNotNull() {
            addCriterion("pkid is not null");
            return (Criteria) this;
        }

        public Criteria andPkidEqualTo(String value) {
            addCriterion("pkid =", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotEqualTo(String value) {
            addCriterion("pkid <>", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThan(String value) {
            addCriterion("pkid >", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidGreaterThanOrEqualTo(String value) {
            addCriterion("pkid >=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThan(String value) {
            addCriterion("pkid <", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLessThanOrEqualTo(String value) {
            addCriterion("pkid <=", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidLike(String value) {
            addCriterion("pkid like", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotLike(String value) {
            addCriterion("pkid not like", value, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidIn(List<String> values) {
            addCriterion("pkid in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotIn(List<String> values) {
            addCriterion("pkid not in", values, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidBetween(String value1, String value2) {
            addCriterion("pkid between", value1, value2, "pkid");
            return (Criteria) this;
        }

        public Criteria andPkidNotBetween(String value1, String value2) {
            addCriterion("pkid not between", value1, value2, "pkid");
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