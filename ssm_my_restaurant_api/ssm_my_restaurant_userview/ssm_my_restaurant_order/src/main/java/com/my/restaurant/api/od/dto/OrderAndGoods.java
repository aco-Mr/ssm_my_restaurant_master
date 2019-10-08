package com.my.restaurant.api.od.dto;

public class OrderAndGoods {
    private Integer id;
    private Integer oid;
    private Integer gid;
    private Integer gnums;

    public OrderAndGoods() {
    }

    public OrderAndGoods(Integer oid, Integer gid, Integer gnums) {
        this.oid = oid;
        this.gid = gid;
        this.gnums = gnums;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getGnums() {
        return gnums;
    }

    public void setGnums(Integer gnums) {
        this.gnums = gnums;
    }
}
