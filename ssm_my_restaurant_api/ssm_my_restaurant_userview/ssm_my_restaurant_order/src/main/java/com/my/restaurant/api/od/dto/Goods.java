package com.my.restaurant.api.od.dto;

import java.util.*;

public class Goods {
    private Integer gid;
    private String gname;
    private String gtype;
    private String gimag;
    private  List<Price> prices=new ArrayList<Price>();
    private Date gaddtime;
    private Integer gstate;
    private String gdetails;
    private List<OrderAndGoods> orderAndGoods=new ArrayList<>();

    public List<Price> getPrices() {
        return prices;

    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public Goods() {
    }

    public Goods(Integer gid, String gname, String gtype, String gimag, Date gaddtime, String gdetails , List<Price> prices) {
        this.gid = gid;
        this.gname = gname;
        this.gtype = gtype;
        this.gimag = gimag;
        this.gaddtime = gaddtime;
        this.gdetails = gdetails;
        this.prices=prices;
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

    public List<OrderAndGoods> getOrderAndGoods() {
        return orderAndGoods;
    }

    public void setOrderAndGoods(List<OrderAndGoods> orderAndGoods) {
        this.orderAndGoods = orderAndGoods;
    }

    public Integer getGstate() {
        return gstate;
    }

    public void setGstate(Integer gstate) {
        this.gstate = gstate;
    }
}
