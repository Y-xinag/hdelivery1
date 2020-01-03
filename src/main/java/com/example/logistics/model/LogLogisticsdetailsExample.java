package com.example.logistics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogLogisticsdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogLogisticsdetailsExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogisticsintIsNull() {
            addCriterion("LogisticsInt is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsintIsNotNull() {
            addCriterion("LogisticsInt is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsintEqualTo(String value) {
            addCriterion("LogisticsInt =", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintNotEqualTo(String value) {
            addCriterion("LogisticsInt <>", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintGreaterThan(String value) {
            addCriterion("LogisticsInt >", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintGreaterThanOrEqualTo(String value) {
            addCriterion("LogisticsInt >=", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintLessThan(String value) {
            addCriterion("LogisticsInt <", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintLessThanOrEqualTo(String value) {
            addCriterion("LogisticsInt <=", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintLike(String value) {
            addCriterion("LogisticsInt like", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintNotLike(String value) {
            addCriterion("LogisticsInt not like", value, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintIn(List<String> values) {
            addCriterion("LogisticsInt in", values, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintNotIn(List<String> values) {
            addCriterion("LogisticsInt not in", values, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintBetween(String value1, String value2) {
            addCriterion("LogisticsInt between", value1, value2, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andLogisticsintNotBetween(String value1, String value2) {
            addCriterion("LogisticsInt not between", value1, value2, "logisticsint");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateIsNull() {
            addCriterion("ExpectArrivalDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateIsNotNull() {
            addCriterion("ExpectArrivalDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateEqualTo(Date value) {
            addCriterion("ExpectArrivalDate =", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateNotEqualTo(Date value) {
            addCriterion("ExpectArrivalDate <>", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateGreaterThan(Date value) {
            addCriterion("ExpectArrivalDate >", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpectArrivalDate >=", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateLessThan(Date value) {
            addCriterion("ExpectArrivalDate <", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateLessThanOrEqualTo(Date value) {
            addCriterion("ExpectArrivalDate <=", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateIn(List<Date> values) {
            addCriterion("ExpectArrivalDate in", values, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateNotIn(List<Date> values) {
            addCriterion("ExpectArrivalDate not in", values, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateBetween(Date value1, Date value2) {
            addCriterion("ExpectArrivalDate between", value1, value2, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateNotBetween(Date value1, Date value2) {
            addCriterion("ExpectArrivalDate not between", value1, value2, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateIsNull() {
            addCriterion("ActualArrivalDate is null");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateIsNotNull() {
            addCriterion("ActualArrivalDate is not null");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateEqualTo(Date value) {
            addCriterion("ActualArrivalDate =", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateNotEqualTo(Date value) {
            addCriterion("ActualArrivalDate <>", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateGreaterThan(Date value) {
            addCriterion("ActualArrivalDate >", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("ActualArrivalDate >=", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateLessThan(Date value) {
            addCriterion("ActualArrivalDate <", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateLessThanOrEqualTo(Date value) {
            addCriterion("ActualArrivalDate <=", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateIn(List<Date> values) {
            addCriterion("ActualArrivalDate in", values, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateNotIn(List<Date> values) {
            addCriterion("ActualArrivalDate not in", values, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateBetween(Date value1, Date value2) {
            addCriterion("ActualArrivalDate between", value1, value2, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateNotBetween(Date value1, Date value2) {
            addCriterion("ActualArrivalDate not between", value1, value2, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateIsNull() {
            addCriterion("ExpectDepartureDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateIsNotNull() {
            addCriterion("ExpectDepartureDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateEqualTo(Date value) {
            addCriterion("ExpectDepartureDate =", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateNotEqualTo(Date value) {
            addCriterion("ExpectDepartureDate <>", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateGreaterThan(Date value) {
            addCriterion("ExpectDepartureDate >", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpectDepartureDate >=", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateLessThan(Date value) {
            addCriterion("ExpectDepartureDate <", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateLessThanOrEqualTo(Date value) {
            addCriterion("ExpectDepartureDate <=", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateIn(List<Date> values) {
            addCriterion("ExpectDepartureDate in", values, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateNotIn(List<Date> values) {
            addCriterion("ExpectDepartureDate not in", values, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateBetween(Date value1, Date value2) {
            addCriterion("ExpectDepartureDate between", value1, value2, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateNotBetween(Date value1, Date value2) {
            addCriterion("ExpectDepartureDate not between", value1, value2, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateIsNull() {
            addCriterion("ActualDepartureDate is null");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateIsNotNull() {
            addCriterion("ActualDepartureDate is not null");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateEqualTo(Date value) {
            addCriterion("ActualDepartureDate =", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateNotEqualTo(Date value) {
            addCriterion("ActualDepartureDate <>", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateGreaterThan(Date value) {
            addCriterion("ActualDepartureDate >", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ActualDepartureDate >=", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateLessThan(Date value) {
            addCriterion("ActualDepartureDate <", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateLessThanOrEqualTo(Date value) {
            addCriterion("ActualDepartureDate <=", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateIn(List<Date> values) {
            addCriterion("ActualDepartureDate in", values, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateNotIn(List<Date> values) {
            addCriterion("ActualDepartureDate not in", values, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateBetween(Date value1, Date value2) {
            addCriterion("ActualDepartureDate between", value1, value2, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateNotBetween(Date value1, Date value2) {
            addCriterion("ActualDepartureDate not between", value1, value2, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andOperationpersonIsNull() {
            addCriterion("OperationPerson is null");
            return (Criteria) this;
        }

        public Criteria andOperationpersonIsNotNull() {
            addCriterion("OperationPerson is not null");
            return (Criteria) this;
        }

        public Criteria andOperationpersonEqualTo(String value) {
            addCriterion("OperationPerson =", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonNotEqualTo(String value) {
            addCriterion("OperationPerson <>", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonGreaterThan(String value) {
            addCriterion("OperationPerson >", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonGreaterThanOrEqualTo(String value) {
            addCriterion("OperationPerson >=", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonLessThan(String value) {
            addCriterion("OperationPerson <", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonLessThanOrEqualTo(String value) {
            addCriterion("OperationPerson <=", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonLike(String value) {
            addCriterion("OperationPerson like", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonNotLike(String value) {
            addCriterion("OperationPerson not like", value, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonIn(List<String> values) {
            addCriterion("OperationPerson in", values, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonNotIn(List<String> values) {
            addCriterion("OperationPerson not in", values, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonBetween(String value1, String value2) {
            addCriterion("OperationPerson between", value1, value2, "operationperson");
            return (Criteria) this;
        }

        public Criteria andOperationpersonNotBetween(String value1, String value2) {
            addCriterion("OperationPerson not between", value1, value2, "operationperson");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeIsNull() {
            addCriterion("LogisticsType is null");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeIsNotNull() {
            addCriterion("LogisticsType is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeEqualTo(String value) {
            addCriterion("LogisticsType =", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeNotEqualTo(String value) {
            addCriterion("LogisticsType <>", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeGreaterThan(String value) {
            addCriterion("LogisticsType >", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeGreaterThanOrEqualTo(String value) {
            addCriterion("LogisticsType >=", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeLessThan(String value) {
            addCriterion("LogisticsType <", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeLessThanOrEqualTo(String value) {
            addCriterion("LogisticsType <=", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeLike(String value) {
            addCriterion("LogisticsType like", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeNotLike(String value) {
            addCriterion("LogisticsType not like", value, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeIn(List<String> values) {
            addCriterion("LogisticsType in", values, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeNotIn(List<String> values) {
            addCriterion("LogisticsType not in", values, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeBetween(String value1, String value2) {
            addCriterion("LogisticsType between", value1, value2, "logisticstype");
            return (Criteria) this;
        }

        public Criteria andLogisticstypeNotBetween(String value1, String value2) {
            addCriterion("LogisticsType not between", value1, value2, "logisticstype");
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