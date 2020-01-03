package com.example.logistics.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasSubstituteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasSubstituteExample() {
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

        public Criteria andEmpnoIsNull() {
            addCriterion("EmpNo is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EmpNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(String value) {
            addCriterion("EmpNo =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(String value) {
            addCriterion("EmpNo <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(String value) {
            addCriterion("EmpNo >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpNo >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(String value) {
            addCriterion("EmpNo <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(String value) {
            addCriterion("EmpNo <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLike(String value) {
            addCriterion("EmpNo like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotLike(String value) {
            addCriterion("EmpNo not like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<String> values) {
            addCriterion("EmpNo in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<String> values) {
            addCriterion("EmpNo not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(String value1, String value2) {
            addCriterion("EmpNo between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(String value1, String value2) {
            addCriterion("EmpNo not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EmpName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EmpName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EmpName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EmpName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EmpName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EmpName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EmpName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EmpName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EmpName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EmpName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EmpName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EmpName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EmpName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EmpName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("MobileNo is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("MobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(Integer value) {
            addCriterion("MobileNo =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(Integer value) {
            addCriterion("MobileNo <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(Integer value) {
            addCriterion("MobileNo >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MobileNo >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(Integer value) {
            addCriterion("MobileNo <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(Integer value) {
            addCriterion("MobileNo <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<Integer> values) {
            addCriterion("MobileNo in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<Integer> values) {
            addCriterion("MobileNo not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(Integer value1, Integer value2) {
            addCriterion("MobileNo between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(Integer value1, Integer value2) {
            addCriterion("MobileNo not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPdaIsNull() {
            addCriterion("PDA is null");
            return (Criteria) this;
        }

        public Criteria andPdaIsNotNull() {
            addCriterion("PDA is not null");
            return (Criteria) this;
        }

        public Criteria andPdaEqualTo(Boolean value) {
            addCriterion("PDA =", value, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaNotEqualTo(Boolean value) {
            addCriterion("PDA <>", value, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaGreaterThan(Boolean value) {
            addCriterion("PDA >", value, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PDA >=", value, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaLessThan(Boolean value) {
            addCriterion("PDA <", value, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaLessThanOrEqualTo(Boolean value) {
            addCriterion("PDA <=", value, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaIn(List<Boolean> values) {
            addCriterion("PDA in", values, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaNotIn(List<Boolean> values) {
            addCriterion("PDA not in", values, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaBetween(Boolean value1, Boolean value2) {
            addCriterion("PDA between", value1, value2, "pda");
            return (Criteria) this;
        }

        public Criteria andPdaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PDA not between", value1, value2, "pda");
            return (Criteria) this;
        }

        public Criteria andStandardkgIsNull() {
            addCriterion("StandardKg is null");
            return (Criteria) this;
        }

        public Criteria andStandardkgIsNotNull() {
            addCriterion("StandardKg is not null");
            return (Criteria) this;
        }

        public Criteria andStandardkgEqualTo(BigDecimal value) {
            addCriterion("StandardKg =", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgNotEqualTo(BigDecimal value) {
            addCriterion("StandardKg <>", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgGreaterThan(BigDecimal value) {
            addCriterion("StandardKg >", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardKg >=", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgLessThan(BigDecimal value) {
            addCriterion("StandardKg <", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardKg <=", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgIn(List<BigDecimal> values) {
            addCriterion("StandardKg in", values, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgNotIn(List<BigDecimal> values) {
            addCriterion("StandardKg not in", values, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardKg between", value1, value2, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardKg not between", value1, value2, "standardkg");
            return (Criteria) this;
        }

        public Criteria andModelsIsNull() {
            addCriterion("Models is null");
            return (Criteria) this;
        }

        public Criteria andModelsIsNotNull() {
            addCriterion("Models is not null");
            return (Criteria) this;
        }

        public Criteria andModelsEqualTo(BigDecimal value) {
            addCriterion("Models =", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotEqualTo(BigDecimal value) {
            addCriterion("Models <>", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsGreaterThan(BigDecimal value) {
            addCriterion("Models >", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Models >=", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsLessThan(BigDecimal value) {
            addCriterion("Models <", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Models <=", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsIn(List<BigDecimal> values) {
            addCriterion("Models in", values, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotIn(List<BigDecimal> values) {
            addCriterion("Models not in", values, "models");
            return (Criteria) this;
        }

        public Criteria andModelsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Models between", value1, value2, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Models not between", value1, value2, "models");
            return (Criteria) this;
        }

        public Criteria andPlateintIsNull() {
            addCriterion("PlateInt is null");
            return (Criteria) this;
        }

        public Criteria andPlateintIsNotNull() {
            addCriterion("PlateInt is not null");
            return (Criteria) this;
        }

        public Criteria andPlateintEqualTo(String value) {
            addCriterion("PlateInt =", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintNotEqualTo(String value) {
            addCriterion("PlateInt <>", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintGreaterThan(String value) {
            addCriterion("PlateInt >", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintGreaterThanOrEqualTo(String value) {
            addCriterion("PlateInt >=", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintLessThan(String value) {
            addCriterion("PlateInt <", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintLessThanOrEqualTo(String value) {
            addCriterion("PlateInt <=", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintLike(String value) {
            addCriterion("PlateInt like", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintNotLike(String value) {
            addCriterion("PlateInt not like", value, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintIn(List<String> values) {
            addCriterion("PlateInt in", values, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintNotIn(List<String> values) {
            addCriterion("PlateInt not in", values, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintBetween(String value1, String value2) {
            addCriterion("PlateInt between", value1, value2, "plateint");
            return (Criteria) this;
        }

        public Criteria andPlateintNotBetween(String value1, String value2) {
            addCriterion("PlateInt not between", value1, value2, "plateint");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkIsNull() {
            addCriterion("InvalidateMark is null");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkIsNotNull() {
            addCriterion("InvalidateMark is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkEqualTo(String value) {
            addCriterion("InvalidateMark =", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkNotEqualTo(String value) {
            addCriterion("InvalidateMark <>", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkGreaterThan(String value) {
            addCriterion("InvalidateMark >", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkGreaterThanOrEqualTo(String value) {
            addCriterion("InvalidateMark >=", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkLessThan(String value) {
            addCriterion("InvalidateMark <", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkLessThanOrEqualTo(String value) {
            addCriterion("InvalidateMark <=", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkLike(String value) {
            addCriterion("InvalidateMark like", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkNotLike(String value) {
            addCriterion("InvalidateMark not like", value, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkIn(List<String> values) {
            addCriterion("InvalidateMark in", values, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkNotIn(List<String> values) {
            addCriterion("InvalidateMark not in", values, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkBetween(String value1, String value2) {
            addCriterion("InvalidateMark between", value1, value2, "invalidatemark");
            return (Criteria) this;
        }

        public Criteria andInvalidatemarkNotBetween(String value1, String value2) {
            addCriterion("InvalidateMark not between", value1, value2, "invalidatemark");
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