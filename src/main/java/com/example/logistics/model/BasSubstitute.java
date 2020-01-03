package com.example.logistics.model;

import java.math.BigDecimal;

public class BasSubstitute {
    private Integer id;

    private String empno;

    private String empname;

    private Integer mobileno;

    private Integer type;

    private Boolean pda;

    private BigDecimal standardkg;

    private BigDecimal models;

    private String plateint;

    private String invalidatemark;

    private Integer subordinateunit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public Integer getMobileno() {
        return mobileno;
    }

    public void setMobileno(Integer mobileno) {
        this.mobileno = mobileno;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getPda() {
        return pda;
    }

    public void setPda(Boolean pda) {
        this.pda = pda;
    }

    public BigDecimal getStandardkg() {
        return standardkg;
    }

    public void setStandardkg(BigDecimal standardkg) {
        this.standardkg = standardkg;
    }

    public BigDecimal getModels() {
        return models;
    }

    public void setModels(BigDecimal models) {
        this.models = models;
    }

    public String getPlateint() {
        return plateint;
    }

    public void setPlateint(String plateint) {
        this.plateint = plateint == null ? null : plateint.trim();
    }

    public String getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(String invalidatemark) {
        this.invalidatemark = invalidatemark == null ? null : invalidatemark.trim();
    }

    public Integer getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Integer subordinateunit) {
        this.subordinateunit = subordinateunit;
    }
}