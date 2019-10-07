package com.my.restaurant.domain;

import java.util.Date;

public class Goods {
    /**
    * 菜品编号
    */
    private Integer gid;

    /**
    * 菜品名称
    */
    private String gname;

    /**
    * 菜品类型
    */
    private String gtype;

    private String gimag;

    /**
    * 添加时间
    */
    private Date gaddtime;

    /**
    * 备注
    */
    private byte[] gdetails;

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

    public byte[] getGdetails() {
        return gdetails;
    }

    public void setGdetails(byte[] gdetails) {
        this.gdetails = gdetails;
    }
}