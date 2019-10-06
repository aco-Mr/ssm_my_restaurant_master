package com.my.restaurant.domain;

public class Price {
    private Integer pid;

    private Integer gid;

    private String ptime;

    private Double price;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "pid=" + pid +
                ", gid=" + gid +
                ", ptime='" + ptime + '\'' +
                ", price=" + price +
                '}';
    }
}