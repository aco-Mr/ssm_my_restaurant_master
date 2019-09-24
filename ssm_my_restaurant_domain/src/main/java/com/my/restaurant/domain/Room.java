package com.my.restaurant.domain;

import java.util.HashSet;
import java.util.Set;

public class Room {
    private Integer rid;
    private String  rname;
    private Integer rsize;
    private Integer rstatue;
    private String details;
    private Set<Desk> desks=new HashSet<Desk>();

    public Room() {
    }

    public Room(Integer rid, String rname, Integer rsize, Integer rstatue, String details, Set<Desk> desks) {
        this.rid = rid;
        this.rname = rname;
        this.rsize = rsize;
        this.rstatue = rstatue;
        this.details = details;
        this.desks = desks;
    }

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

    public Set<Desk> getDesks() {
        return desks;
    }

    public void setDesks(Set<Desk> desks) {
        this.desks = desks;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rsize=" + rsize +
                ", rstatue=" + rstatue +
                ", details='" + details + '\'' +
                '}';
    }
}
