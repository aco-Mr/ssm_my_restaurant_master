package com.my.restaurant.domain;

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

    /**
     * 菜品图片
     */
    private String gimag;

    /**
    * 添加时间
    */
    private String gaddtime;

    /**
     * 0为上架，1为下架
     */
    private Integer gstate;

    /**
    * 备注
    */
    private String gdetails;

    public Integer getGstate() {
        return gstate;
    }

    public void setGstate(Integer gstate) {
        this.gstate = gstate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gtype='" + gtype + '\'' +
                ", gimag='" + gimag + '\'' +
                ", gaddtime='" + gaddtime + '\'' +
                ", gstate=" + gstate +
                ", gdetails='" + gdetails + '\'' +
                '}';
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

    public String getGaddtime() {
        return gaddtime;
    }

    public void setGaddtime(String gaddtime) {
        this.gaddtime = gaddtime;
    }

    public String getGdetails() {
        return gdetails;
    }

    public void setGdetails(String gdetails) {
        this.gdetails = gdetails;
    }
}