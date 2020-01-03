package com.example.logistics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BasStandartimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasStandartimeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTimenameIsNull() {
            addCriterion("TimeName is null");
            return (Criteria) this;
        }

        public Criteria andTimenameIsNotNull() {
            addCriterion("TimeName is not null");
            return (Criteria) this;
        }

        public Criteria andTimenameEqualTo(String value) {
            addCriterion("TimeName =", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameNotEqualTo(String value) {
            addCriterion("TimeName <>", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameGreaterThan(String value) {
            addCriterion("TimeName >", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameGreaterThanOrEqualTo(String value) {
            addCriterion("TimeName >=", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameLessThan(String value) {
            addCriterion("TimeName <", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameLessThanOrEqualTo(String value) {
            addCriterion("TimeName <=", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameLike(String value) {
            addCriterion("TimeName like", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameNotLike(String value) {
            addCriterion("TimeName not like", value, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameIn(List<String> values) {
            addCriterion("TimeName in", values, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameNotIn(List<String> values) {
            addCriterion("TimeName not in", values, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameBetween(String value1, String value2) {
            addCriterion("TimeName between", value1, value2, "timename");
            return (Criteria) this;
        }

        public Criteria andTimenameNotBetween(String value1, String value2) {
            addCriterion("TimeName not between", value1, value2, "timename");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIsNull() {
            addCriterion("SubordinateUnit is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIsNotNull() {
            addCriterion("SubordinateUnit is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitEqualTo(Integer value) {
            addCriterion("SubordinateUnit =", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotEqualTo(Integer value) {
            addCriterion("SubordinateUnit <>", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThan(Integer value) {
            addCriterion("SubordinateUnit >", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubordinateUnit >=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThan(Integer value) {
            addCriterion("SubordinateUnit <", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThanOrEqualTo(Integer value) {
            addCriterion("SubordinateUnit <=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIn(List<Integer> values) {
            addCriterion("SubordinateUnit in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotIn(List<Integer> values) {
            addCriterion("SubordinateUnit not in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitBetween(Integer value1, Integer value2) {
            addCriterion("SubordinateUnit between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotBetween(Integer value1, Integer value2) {
            addCriterion("SubordinateUnit not between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeIsNull() {
            addCriterion("WorkingTime is null");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeIsNotNull() {
            addCriterion("WorkingTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("WorkingTime =", value, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("WorkingTime <>", value, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("WorkingTime >", value, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WorkingTime >=", value, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeLessThan(Date value) {
            addCriterionForJDBCDate("WorkingTime <", value, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WorkingTime <=", value, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("WorkingTime in", values, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("WorkingTime not in", values, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WorkingTime between", value1, value2, "workingtime");
            return (Criteria) this;
        }

        public Criteria andWorkingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WorkingTime not between", value1, value2, "workingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeIsNull() {
            addCriterion("ClosingTime is null");
            return (Criteria) this;
        }

        public Criteria andClosingtimeIsNotNull() {
            addCriterion("ClosingTime is not null");
            return (Criteria) this;
        }

        public Criteria andClosingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingTime =", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingTime <>", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ClosingTime >", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingTime >=", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeLessThan(Date value) {
            addCriterionForJDBCDate("ClosingTime <", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingTime <=", value, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ClosingTime in", values, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ClosingTime not in", values, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ClosingTime between", value1, value2, "closingtime");
            return (Criteria) this;
        }

        public Criteria andClosingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ClosingTime not between", value1, value2, "closingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeIsNull() {
            addCriterion("SaturdayWorkingTime is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeIsNotNull() {
            addCriterion("SaturdayWorkingTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayWorkingTime =", value, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayWorkingTime <>", value, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SaturdayWorkingTime >", value, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayWorkingTime >=", value, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeLessThan(Date value) {
            addCriterionForJDBCDate("SaturdayWorkingTime <", value, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayWorkingTime <=", value, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SaturdayWorkingTime in", values, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SaturdayWorkingTime not in", values, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SaturdayWorkingTime between", value1, value2, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayworkingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SaturdayWorkingTime not between", value1, value2, "saturdayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeIsNull() {
            addCriterion("SaturdayClosingTime is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeIsNotNull() {
            addCriterion("SaturdayClosingTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayClosingTime =", value, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayClosingTime <>", value, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SaturdayClosingTime >", value, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayClosingTime >=", value, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeLessThan(Date value) {
            addCriterionForJDBCDate("SaturdayClosingTime <", value, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SaturdayClosingTime <=", value, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SaturdayClosingTime in", values, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SaturdayClosingTime not in", values, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SaturdayClosingTime between", value1, value2, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSaturdayclosingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SaturdayClosingTime not between", value1, value2, "saturdayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeIsNull() {
            addCriterion("SundayWorkingTime is null");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeIsNotNull() {
            addCriterion("SundayWorkingTime is not null");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SundayWorkingTime =", value, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SundayWorkingTime <>", value, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SundayWorkingTime >", value, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SundayWorkingTime >=", value, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeLessThan(Date value) {
            addCriterionForJDBCDate("SundayWorkingTime <", value, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SundayWorkingTime <=", value, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SundayWorkingTime in", values, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SundayWorkingTime not in", values, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SundayWorkingTime between", value1, value2, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayworkingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SundayWorkingTime not between", value1, value2, "sundayworkingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeIsNull() {
            addCriterion("SundayClosingTime is null");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeIsNotNull() {
            addCriterion("SundayClosingTime is not null");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SundayClosingTime =", value, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SundayClosingTime <>", value, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SundayClosingTime >", value, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SundayClosingTime >=", value, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeLessThan(Date value) {
            addCriterionForJDBCDate("SundayClosingTime <", value, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SundayClosingTime <=", value, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SundayClosingTime in", values, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SundayClosingTime not in", values, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SundayClosingTime between", value1, value2, "sundayclosingtime");
            return (Criteria) this;
        }

        public Criteria andSundayclosingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SundayClosingTime not between", value1, value2, "sundayclosingtime");
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