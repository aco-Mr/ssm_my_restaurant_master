package com.aco.my.restaurant.admin.order.dto;

import java.util.Date;

public class OrderDto {
    private Integer oid;    //订单编号
    private Integer did;    //餐桌编号
    private Integer userId; //用户id
    private Integer clientNums;//客户数量
    private Double discount; //折扣
    private Integer teaFee;  //茶位费
    private Double totalPrice; //总价
    private String startDateTime; //下单时间
    private String payTime;  //买单时间
    private Integer isPay; //是否支付
    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

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

    @Override
    public String toString() {
        return "OrderDto{" +
                "oid=" + oid +
                ", did=" + did +
                ", userId=" + userId +
                ", clientNums=" + clientNums +
                ", discount=" + discount +
                ", teaFee=" + teaFee +
                ", totalPrice=" + totalPrice +
                ", startDateTime='" + startDateTime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", isPay=" + isPay +
                ", state=" + state +
                '}';
    }
}
