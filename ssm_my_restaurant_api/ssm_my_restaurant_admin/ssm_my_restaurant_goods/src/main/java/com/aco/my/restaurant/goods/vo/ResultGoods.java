package com.aco.my.restaurant.goods.vo;

import lombok.Data;

@Data
public class ResultGoods<T> {
    private String msg;
    private Integer state;
    private T data;

    public static <T> ResultGoods<T> setResult(String msg,Integer state,T data){
        return new ResultGoods<T>(msg,state,data);
    }

    public ResultGoods() {
    }

    public ResultGoods(String msg, Integer state, T data) {
        this.msg = msg;
        this.state = state;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultGoods{" +
                "msg='" + msg + '\'' +
                ", state=" + state +
                ", data=" + data +
                '}';
    }
}
