package com.my.restaurant.api.od.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer oid;
    private String did;
    private Integer userId;
    private Integer clientNums;
    private Double discount;
    private Integer teaFee;
    private Double totalPrice;
    private Timestamp StartDateTime;
    private Timestamp eatStartTime;
    private Timestamp eatTime;
    private Timestamp payTime;
    private Integer isPay;
    private Integer state;
    private List<Desk> desks;
    private User user;
    private List<Goods> goods=new ArrayList<>();
    public Order() {
    }

    public Order(String did, Integer userId, Integer clientNums, Double discount, Integer teaFee, Double totalPrice) {
        this.did = did;
        this.userId = userId;
        this.clientNums = clientNums;
        this.discount = discount;
        this.teaFee = teaFee;
        this.totalPrice = totalPrice;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getClientNums() {
        return clientNums;
    }

    public void setClientNums(Integer clientNums) {
        this.clientNums = clientNums;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getTeaFee() {
        return teaFee;
    }

    public void setTeaFee(Integer teaFee) {
        this.teaFee = teaFee;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Timestamp getStartDateTime() {
        return StartDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        StartDateTime = startDateTime;
    }

    public Timestamp getEatStartTime() {
        return eatStartTime;
    }

    public void setEatStartTime(Timestamp eatStartTime) {
        this.eatStartTime = eatStartTime;
    }

    public Timestamp getEatTime() {
        return eatTime;
    }

    public void setEatTime(Timestamp eatTime) {
        this.eatTime = eatTime;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<Desk> getDesks() {
        return desks;
    }

    public void setDesks(List<Desk> desks) {
        this.desks = desks;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

}
