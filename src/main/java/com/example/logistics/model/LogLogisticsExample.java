package com.example.logistics.model;

import java.util.ArrayList;
import java.util.List;

public class LogLogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogLogisticsExample() {
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

        public Criteria andLinenameIsNull() {
            addCriterion("LineName is null");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNotNull() {
            addCriterion("LineName is not null");
            return (Criteria) this;
        }

        public Criteria andLinenameEqualTo(String value) {
            addCriterion("LineName =", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotEqualTo(String value) {
            addCriterion("LineName <>", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThan(String value) {
            addCriterion("LineName >", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThanOrEqualTo(String value) {
            addCriterion("LineName >=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThan(String value) {
            addCriterion("LineName <", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThanOrEqualTo(String value) {
            addCriterion("LineName <=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLike(String value) {
            addCriterion("LineName like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotLike(String value) {
            addCriterion("LineName not like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameIn(List<String> values) {
            addCriterion("LineName in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotIn(List<String> values) {
            addCriterion("LineName not in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameBetween(String value1, String value2) {
            addCriterion("LineName between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotBetween(String value1, String value2) {
            addCriterion("LineName not between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andStartcompanyIsNull() {
            addCriterion("StartCompany is null");
            return (Criteria) this;
        }

        public Criteria andStartcompanyIsNotNull() {
            addCriterion("StartCompany is not null");
            return (Criteria) this;
        }

        public Criteria andStartcompanyEqualTo(String value) {
            addCriterion("StartCompany =", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyNotEqualTo(String value) {
            addCriterion("StartCompany <>", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyGreaterThan(String value) {
            addCriterion("StartCompany >", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("StartCompany >=", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyLessThan(String value) {
            addCriterion("StartCompany <", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyLessThanOrEqualTo(String value) {
            addCriterion("StartCompany <=", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyLike(String value) {
            addCriterion("StartCompany like", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyNotLike(String value) {
            addCriterion("StartCompany not like", value, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyIn(List<String> values) {
            addCriterion("StartCompany in", values, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyNotIn(List<String> values) {
            addCriterion("StartCompany not in", values, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyBetween(String value1, String value2) {
            addCriterion("StartCompany between", value1, value2, "startcompany");
            return (Criteria) this;
        }

        public Criteria andStartcompanyNotBetween(String value1, String value2) {
            addCriterion("StartCompany not between", value1, value2, "startcompany");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonIsNull() {
            addCriterion("GeneratePerson is null");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonIsNotNull() {
            addCriterion("GeneratePerson is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonEqualTo(String value) {
            addCriterion("GeneratePerson =", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonNotEqualTo(String value) {
            addCriterion("GeneratePerson <>", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonGreaterThan(String value) {
            addCriterion("GeneratePerson >", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonGreaterThanOrEqualTo(String value) {
            addCriterion("GeneratePerson >=", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonLessThan(String value) {
            addCriterion("GeneratePerson <", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonLessThanOrEqualTo(String value) {
            addCriterion("GeneratePerson <=", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonLike(String value) {
            addCriterion("GeneratePerson like", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonNotLike(String value) {
            addCriterion("GeneratePerson not like", value, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonIn(List<String> values) {
            addCriterion("GeneratePerson in", values, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonNotIn(List<String> values) {
            addCriterion("GeneratePerson not in", values, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonBetween(String value1, String value2) {
            addCriterion("GeneratePerson between", value1, value2, "generateperson");
            return (Criteria) this;
        }

        public Criteria andGeneratepersonNotBetween(String value1, String value2) {
            addCriterion("GeneratePerson not between", value1, value2, "generateperson");
            return (Criteria) this;
        }

        public Criteria andCarintIsNull() {
            addCriterion("CarInt is null");
            return (Criteria) this;
        }

        public Criteria andCarintIsNotNull() {
            addCriterion("CarInt is not null");
            return (Criteria) this;
        }

        public Criteria andCarintEqualTo(String value) {
            addCriterion("CarInt =", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotEqualTo(String value) {
            addCriterion("CarInt <>", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintGreaterThan(String value) {
            addCriterion("CarInt >", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintGreaterThanOrEqualTo(String value) {
            addCriterion("CarInt >=", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintLessThan(String value) {
            addCriterion("CarInt <", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintLessThanOrEqualTo(String value) {
            addCriterion("CarInt <=", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintLike(String value) {
            addCriterion("CarInt like", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotLike(String value) {
            addCriterion("CarInt not like", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintIn(List<String> values) {
            addCriterion("CarInt in", values, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotIn(List<String> values) {
            addCriterion("CarInt not in", values, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintBetween(String value1, String value2) {
            addCriterion("CarInt between", value1, value2, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotBetween(String value1, String value2) {
            addCriterion("CarInt not between", value1, value2, "carint");
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

        public Criteria andDriverphoneIsNull() {
            addCriterion("DriverPhone is null");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIsNotNull() {
            addCriterion("DriverPhone is not null");
            return (Criteria) this;
        }

        public Criteria andDriverphoneEqualTo(String value) {
            addCriterion("DriverPhone =", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotEqualTo(String value) {
            addCriterion("DriverPhone <>", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneGreaterThan(String value) {
            addCriterion("DriverPhone >", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("DriverPhone >=", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLessThan(String value) {
            addCriterion("DriverPhone <", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLessThanOrEqualTo(String value) {
            addCriterion("DriverPhone <=", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLike(String value) {
            addCriterion("DriverPhone like", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotLike(String value) {
            addCriterion("DriverPhone not like", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIn(List<String> values) {
            addCriterion("DriverPhone in", values, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotIn(List<String> values) {
            addCriterion("DriverPhone not in", values, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneBetween(String value1, String value2) {
            addCriterion("DriverPhone between", value1, value2, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotBetween(String value1, String value2) {
            addCriterion("DriverPhone not between", value1, value2, "driverphone");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("CarType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("CarType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("CarType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("CarType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("CarType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("CarType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("CarType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("CarType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("CarType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("CarType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("CarType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("CarType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("CarType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("CarType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateIsNull() {
            addCriterion("LogisticsState is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateIsNotNull() {
            addCriterion("LogisticsState is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateEqualTo(Boolean value) {
            addCriterion("LogisticsState =", value, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateNotEqualTo(Boolean value) {
            addCriterion("LogisticsState <>", value, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateGreaterThan(Boolean value) {
            addCriterion("LogisticsState >", value, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("LogisticsState >=", value, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateLessThan(Boolean value) {
            addCriterion("LogisticsState <", value, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateLessThanOrEqualTo(Boolean value) {
            addCriterion("LogisticsState <=", value, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateIn(List<Boolean> values) {
            addCriterion("LogisticsState in", values, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateNotIn(List<Boolean> values) {
            addCriterion("LogisticsState not in", values, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateBetween(Boolean value1, Boolean value2) {
            addCriterion("LogisticsState between", value1, value2, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andLogisticsstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("LogisticsState not between", value1, value2, "logisticsstate");
            return (Criteria) this;
        }

        public Criteria andIscancelIsNull() {
            addCriterion("IsCancel is null");
            return (Criteria) this;
        }

        public Criteria andIscancelIsNotNull() {
            addCriterion("IsCancel is not null");
            return (Criteria) this;
        }

        public Criteria andIscancelEqualTo(Boolean value) {
            addCriterion("IsCancel =", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotEqualTo(Boolean value) {
            addCriterion("IsCancel <>", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelGreaterThan(Boolean value) {
            addCriterion("IsCancel >", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsCancel >=", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLessThan(Boolean value) {
            addCriterion("IsCancel <", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLessThanOrEqualTo(Boolean value) {
            addCriterion("IsCancel <=", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelIn(List<Boolean> values) {
            addCriterion("IsCancel in", values, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotIn(List<Boolean> values) {
            addCriterion("IsCancel not in", values, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCancel between", value1, value2, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCancel not between", value1, value2, "iscancel");
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