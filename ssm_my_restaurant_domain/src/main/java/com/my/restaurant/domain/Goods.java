package com.my.restaurant.domain;

import javafx.scene.chart.PieChart;

import java.util.Date;

public class Goods {
    private Integer gid;
    private String gname;
    private String gtype;
    private String gimag;
    private Date gaddtime;
    private String gdetails;

    public Goods() {
    }

    public Goods(Integer gid, String gname, String gtype, String gimag, Date gaddtime, String gdetails) {
        this.gid = gid;
        this.gname = gname;
        this.gtype = gtype;
        this.gimag = gimag;
        this.gaddtime = gaddtime;
        this.gdetails = gdetails;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public String getGimag() {
        return gimag;
    }

    public void setGimag(String gimag) {
        this.gimag = gimag;
    }

    public Date getGaddtime() {
        return gaddtime;
    }

    public void setGaddtime(Date gaddtime) {
        this.gaddtime = gaddtime;
    }

    public String getGdetails() {
        return gdetails;
    }

    public void setGdetails(String gdetails) {
        this.gdetails = gdetails;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gtype='" + gtype + '\'' +
                ", gimag='" + gimag + '\'' +
                ", gaddtime=" + gaddtime +
                ", gdetails='" + gdetails + '\'' +
                '}';
    }
}
