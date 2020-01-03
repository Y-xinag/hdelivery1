package com.example.logistics.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorCheckbounddetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorCheckbounddetailsExample() {
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

        public Criteria andCargocountIsNull() {
            addCriterion("CargoCount is null");
            return (Criteria) this;
        }

        public Criteria andCargocountIsNotNull() {
            addCriterion("CargoCount is not null");
            return (Criteria) this;
        }

        public Criteria andCargocountEqualTo(Integer value) {
            addCriterion("CargoCount =", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountNotEqualTo(Integer value) {
            addCriterion("CargoCount <>", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountGreaterThan(Integer value) {
            addCriterion("CargoCount >", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CargoCount >=", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountLessThan(Integer value) {
            addCriterion("CargoCount <", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountLessThanOrEqualTo(Integer value) {
            addCriterion("CargoCount <=", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountIn(List<Integer> values) {
            addCriterion("CargoCount in", values, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountNotIn(List<Integer> values) {
            addCriterion("CargoCount not in", values, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountBetween(Integer value1, Integer value2) {
            addCriterion("CargoCount between", value1, value2, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountNotBetween(Integer value1, Integer value2) {
            addCriterion("CargoCount not between", value1, value2, "cargocount");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("Volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("Volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andCargotypeIsNull() {
            addCriterion("CargoType is null");
            return (Criteria) this;
        }

        public Criteria andCargotypeIsNotNull() {
            addCriterion("CargoType is not null");
            return (Criteria) this;
        }

        public Criteria andCargotypeEqualTo(Boolean value) {
            addCriterion("CargoType =", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeNotEqualTo(Boolean value) {
            addCriterion("CargoType <>", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeGreaterThan(Boolean value) {
            addCriterion("CargoType >", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CargoType >=", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeLessThan(Boolean value) {
            addCriterion("CargoType <", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeLessThanOrEqualTo(Boolean value) {
            addCriterion("CargoType <=", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeIn(List<Boolean> values) {
            addCriterion("CargoType in", values, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeNotIn(List<Boolean> values) {
            addCriterion("CargoType not in", values, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeBetween(Boolean value1, Boolean value2) {
            addCriterion("CargoType between", value1, value2, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CargoType not between", value1, value2, "cargotype");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("Direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("Direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("Direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("Direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("Direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("Direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("Direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("Direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("Direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("Direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("Direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("Direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("Direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("Direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andStoragepersonIsNull() {
            addCriterion("StoragePerson is null");
            return (Criteria) this;
        }

        public Criteria andStoragepersonIsNotNull() {
            addCriterion("StoragePerson is not null");
            return (Criteria) this;
        }

        public Criteria andStoragepersonEqualTo(Integer value) {
            addCriterion("StoragePerson =", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonNotEqualTo(Integer value) {
            addCriterion("StoragePerson <>", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonGreaterThan(Integer value) {
            addCriterion("StoragePerson >", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("StoragePerson >=", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonLessThan(Integer value) {
            addCriterion("StoragePerson <", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonLessThanOrEqualTo(Integer value) {
            addCriterion("StoragePerson <=", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonIn(List<Integer> values) {
            addCriterion("StoragePerson in", values, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonNotIn(List<Integer> values) {
            addCriterion("StoragePerson not in", values, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonBetween(Integer value1, Integer value2) {
            addCriterion("StoragePerson between", value1, value2, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonNotBetween(Integer value1, Integer value2) {
            addCriterion("StoragePerson not between", value1, value2, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragedateIsNull() {
            addCriterion("StorageDate is null");
            return (Criteria) this;
        }

        public Criteria andStoragedateIsNotNull() {
            addCriterion("StorageDate is not null");
            return (Criteria) this;
        }

        public Criteria andStoragedateEqualTo(Date value) {
            addCriterion("StorageDate =", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotEqualTo(Date value) {
            addCriterion("StorageDate <>", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateGreaterThan(Date value) {
            addCriterion("StorageDate >", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateGreaterThanOrEqualTo(Date value) {
            addCriterion("StorageDate >=", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLessThan(Date value) {
            addCriterion("StorageDate <", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLessThanOrEqualTo(Date value) {
            addCriterion("StorageDate <=", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateIn(List<Date> values) {
            addCriterion("StorageDate in", values, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotIn(List<Date> values) {
            addCriterion("StorageDate not in", values, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateBetween(Date value1, Date value2) {
            addCriterion("StorageDate between", value1, value2, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotBetween(Date value1, Date value2) {
            addCriterion("StorageDate not between", value1, value2, "storagedate");
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