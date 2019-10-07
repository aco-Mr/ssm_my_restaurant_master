package com.my.restaurant.api.od.dto;

import java.util.Date;

public class Price {
    private Integer pid;
    private Date ptime;
    private Double price;
    private Goods goods;

    public Price() {
    }

    public Price(Integer pid, Date ptime, Double price, Goods goods) {
        this.pid = pid;
        this.ptime = ptime;
        this.price = price;
        this.goods = goods;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Price{" +
                "pid=" + pid +
                ", ptime=" + ptime +
                ", price=" + price +
                '}';
    }
}
