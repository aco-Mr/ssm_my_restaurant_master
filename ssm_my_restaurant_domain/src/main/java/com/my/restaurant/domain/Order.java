package com.my.restaurant.domain;

import java.util.Date;

public class Order {
    private Integer oid;
    private Integer did;
    private Integer userId;
    private Integer clientNums;
    private Double discount;
    private Integer teaFee;
    private Double totalPrice;
    private String startDateTime;
    private String eatStartTime;
    private String eatTime;
    private String payTime;
    private Integer isPay;
    private Integer state;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEatStartTime() {
        return eatStartTime;
    }

    public void setEatStartTime(String eatStartTime) {
        this.eatStartTime = eatStartTime;
    }

    public String getEatTime() {
        return eatTime;
    }

    public void setEatTime(String eatTime) {
        this.eatTime = eatTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
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

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", did=" + did +
                ", userId=" + userId +
                ", clientNums=" + clientNums +
                ", discount=" + discount +
                ", teaFee=" + teaFee +
                ", totalPrice=" + totalPrice +
                ", startDateTime='" + startDateTime + '\'' +
                ", eatStartTime='" + eatStartTime + '\'' +
                ", eatTime='" + eatTime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", isPay=" + isPay +
                ", state=" + state +
                '}';
    }
}
