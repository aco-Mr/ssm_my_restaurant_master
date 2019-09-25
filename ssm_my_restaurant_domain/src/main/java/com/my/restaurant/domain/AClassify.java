package com.my.restaurant.domain;

import java.util.Date;

public class AClassify {
    private Integer cid;

    private Long phone;

    private Date date;

    /**
    * 叫号的状态：0为正在排队，1为已完成
    */
    private Integer state;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}