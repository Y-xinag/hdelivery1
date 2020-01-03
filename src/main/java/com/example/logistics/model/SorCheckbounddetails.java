package com.example.logistics.model;

import java.math.BigDecimal;
import java.util.Date;

public class SorCheckbounddetails {
    private Integer id;

    private Integer cargocount;

    private BigDecimal weight;

    private BigDecimal volume;

    private Boolean cargotype;

    private String direction;

    private Integer storageperson;

    private Date storagedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCargocount() {
        return cargocount;
    }

    public void setCargocount(Integer cargocount) {
        this.cargocount = cargocount;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Boolean getCargotype() {
        return cargotype;
    }

    public void setCargotype(Boolean cargotype) {
        this.cargotype = cargotype;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public Integer getStorageperson() {
        return storageperson;
    }

    public void setStorageperson(Integer storageperson) {
        this.storageperson = storageperson;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }
}