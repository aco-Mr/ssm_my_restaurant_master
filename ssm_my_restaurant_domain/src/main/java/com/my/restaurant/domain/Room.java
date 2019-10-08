package com.my.restaurant.domain;

import java.util.HashSet;
import java.util.Set;

public class Room {
    private Integer rid;

    private String rname;

    private Integer rtype;

    private Integer rsize;

    private Integer rstatue;

    private String details;



    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public Integer getRsize() {
        return rsize;
    }

    public void setRsize(Integer rsize) {
        this.rsize = rsize;
    }

    public Integer getRstatue() {
        return rstatue;
    }

    public void setRstatue(Integer rstatue) {
        this.rstatue = rstatue;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rtype=" + rtype +
                ", rsize=" + rsize +
                ", rstatue=" + rstatue +
                ", details='" + details + '\'' +
                '}';
    }
}