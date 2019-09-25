package com.aco.my.restaurant.classify.dto;

import java.util.Date;

public class ClassifyDto {
    private Integer cid;
    private Long phone;
    private String date;
    private Integer state;

    public ClassifyDto() {
    }

    public ClassifyDto(Integer rid, Long phone, String date, Integer state) {
        this.cid = rid;
        this.phone = phone;
        this.date = date;
        this.state = state;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer rid) {
        this.cid = rid;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ClassifyDto{" +
                "cid=" + cid +
                ", phone=" + phone +
                ", date=" + date +
                ", state=" + state +
                '}';
    }
}
