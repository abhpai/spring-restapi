package com.syncron.abhpai.springrestapi.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long add_id;
    private String perma_add;
    private String curr_add;
    private String off_add;

    public Address() {
    }

    public Address(Long add_id, String perma_add, String curr_add, String off_add) {
        this.add_id = add_id;
        this.perma_add = perma_add;
        this.curr_add = curr_add;
        this.off_add = off_add;
    }

    @OneToOne(mappedBy = "address")
    private Employee employee;

    public Long getAdd_id() {
        return add_id;
    }

    public void setAdd_id(Long add_id) {
        this.add_id = add_id;
    }

    public String getPerma_add() {
        return perma_add;
    }

    public void setPerma_add(String perma_add) {
        this.perma_add = perma_add;
    }

    public String getCurr_add() {
        return curr_add;
    }

    public void setCurr_add(String curr_add) {
        this.curr_add = curr_add;
    }

    public String getOff_add() {
        return off_add;
    }

    public void setOff_add(String off_add) {
        this.off_add = off_add;
    }
}
