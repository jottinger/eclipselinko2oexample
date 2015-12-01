package com.autumncode.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Backlog extends Base {
    @Column
    String data;
    @OneToOne
    Agency agency;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }
}
