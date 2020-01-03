package com.example.logistics.model;

import java.util.Date;

public class SorCheckbound {
    private Integer id;

    private Integer scanid;

    private Integer cargosum;

    private Integer checkperson;

    private Date checkdate;

    private String checkcompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScanid() {
        return scanid;
    }

    public void setScanid(Integer scanid) {
        this.scanid = scanid;
    }

    public Integer getCargosum() {
        return cargosum;
    }

    public void setCargosum(Integer cargosum) {
        this.cargosum = cargosum;
    }

    public Integer getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(Integer checkperson) {
        this.checkperson = checkperson;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckcompany() {
        return checkcompany;
    }

    public void setCheckcompany(String checkcompany) {
        this.checkcompany = checkcompany == null ? null : checkcompany.trim();
    }
}