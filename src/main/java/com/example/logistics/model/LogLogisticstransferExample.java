package com.example.logistics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogLogisticstransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogLogisticstransferExample() {
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

        public Criteria andTransferintIsNull() {
            addCriterion("TransferInt is null");
            return (Criteria) this;
        }

        public Criteria andTransferintIsNotNull() {
            addCriterion("TransferInt is not null");
            return (Criteria) this;
        }

        public Criteria andTransferintEqualTo(String value) {
            addCriterion("TransferInt =", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotEqualTo(String value) {
            addCriterion("TransferInt <>", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintGreaterThan(String value) {
            addCriterion("TransferInt >", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintGreaterThanOrEqualTo(String value) {
            addCriterion("TransferInt >=", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintLessThan(String value) {
            addCriterion("TransferInt <", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintLessThanOrEqualTo(String value) {
            addCriterion("TransferInt <=", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintLike(String value) {
            addCriterion("TransferInt like", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotLike(String value) {
            addCriterion("TransferInt not like", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintIn(List<String> values) {
            addCriterion("TransferInt in", values, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotIn(List<String> values) {
            addCriterion("TransferInt not in", values, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintBetween(String value1, String value2) {
            addCriterion("TransferInt between", value1, value2, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotBetween(String value1, String value2) {
            addCriterion("TransferInt not between", value1, value2, "transferint");
            return (Criteria) this;
        }

        public Criteria andStartstationIsNull() {
            addCriterion("StartStation is null");
            return (Criteria) this;
        }

        public Criteria andStartstationIsNotNull() {
            addCriterion("StartStation is not null");
            return (Criteria) this;
        }

        public Criteria andStartstationEqualTo(String value) {
            addCriterion("StartStation =", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationNotEqualTo(String value) {
            addCriterion("StartStation <>", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationGreaterThan(String value) {
            addCriterion("StartStation >", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationGreaterThanOrEqualTo(String value) {
            addCriterion("StartStation >=", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationLessThan(String value) {
            addCriterion("StartStation <", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationLessThanOrEqualTo(String value) {
            addCriterion("StartStation <=", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationLike(String value) {
            addCriterion("StartStation like", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationNotLike(String value) {
            addCriterion("StartStation not like", value, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationIn(List<String> values) {
            addCriterion("StartStation in", values, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationNotIn(List<String> values) {
            addCriterion("StartStation not in", values, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationBetween(String value1, String value2) {
            addCriterion("StartStation between", value1, value2, "startstation");
            return (Criteria) this;
        }

        public Criteria andStartstationNotBetween(String value1, String value2) {
            addCriterion("StartStation not between", value1, value2, "startstation");
            return (Criteria) this;
        }

        public Criteria andEndstationIsNull() {
            addCriterion("EndStation is null");
            return (Criteria) this;
        }

        public Criteria andEndstationIsNotNull() {
            addCriterion("EndStation is not null");
            return (Criteria) this;
        }

        public Criteria andEndstationEqualTo(String value) {
            addCriterion("EndStation =", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotEqualTo(String value) {
            addCriterion("EndStation <>", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationGreaterThan(String value) {
            addCriterion("EndStation >", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationGreaterThanOrEqualTo(String value) {
            addCriterion("EndStation >=", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationLessThan(String value) {
            addCriterion("EndStation <", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationLessThanOrEqualTo(String value) {
            addCriterion("EndStation <=", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationLike(String value) {
            addCriterion("EndStation like", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotLike(String value) {
            addCriterion("EndStation not like", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationIn(List<String> values) {
            addCriterion("EndStation in", values, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotIn(List<String> values) {
            addCriterion("EndStation not in", values, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationBetween(String value1, String value2) {
            addCriterion("EndStation between", value1, value2, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotBetween(String value1, String value2) {
            addCriterion("EndStation not between", value1, value2, "endstation");
            return (Criteria) this;
        }

        public Criteria andDispatcherIsNull() {
            addCriterion("Dispatcher is null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIsNotNull() {
            addCriterion("Dispatcher is not null");
            return (Criteria) this;
        }

        public Criteria andDispatcherEqualTo(String value) {
            addCriterion("Dispatcher =", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotEqualTo(String value) {
            addCriterion("Dispatcher <>", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherGreaterThan(String value) {
            addCriterion("Dispatcher >", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherGreaterThanOrEqualTo(String value) {
            addCriterion("Dispatcher >=", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLessThan(String value) {
            addCriterion("Dispatcher <", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLessThanOrEqualTo(String value) {
            addCriterion("Dispatcher <=", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLike(String value) {
            addCriterion("Dispatcher like", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotLike(String value) {
            addCriterion("Dispatcher not like", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherIn(List<String> values) {
            addCriterion("Dispatcher in", values, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotIn(List<String> values) {
            addCriterion("Dispatcher not in", values, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherBetween(String value1, String value2) {
            addCriterion("Dispatcher between", value1, value2, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotBetween(String value1, String value2) {
            addCriterion("Dispatcher not between", value1, value2, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("Driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("Driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("Driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("Driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("Driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("Driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("Driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("Driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("Driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("Driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("Driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("Driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("Driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("Driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIsNull() {
            addCriterion("DeliveryPerson is null");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIsNotNull() {
            addCriterion("DeliveryPerson is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonEqualTo(Integer value) {
            addCriterion("DeliveryPerson =", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotEqualTo(Integer value) {
            addCriterion("DeliveryPerson <>", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonGreaterThan(Integer value) {
            addCriterion("DeliveryPerson >", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeliveryPerson >=", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLessThan(Integer value) {
            addCriterion("DeliveryPerson <", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLessThanOrEqualTo(Integer value) {
            addCriterion("DeliveryPerson <=", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIn(List<Integer> values) {
            addCriterion("DeliveryPerson in", values, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotIn(List<Integer> values) {
            addCriterion("DeliveryPerson not in", values, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryPerson between", value1, value2, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryPerson not between", value1, value2, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("DeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("DeliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("DeliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("DeliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("DeliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("DeliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("DeliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("DeliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("DeliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("DeliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("DeliveryDate not between", value1, value2, "deliverydate");
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