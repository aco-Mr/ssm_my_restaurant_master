package com.aco.my.restaurant.loginAndRegister.vo;

import lombok.Data;

@Data
public class UserResult<T> {
    private String Msg;
    private Integer state;
    private T data;

    public static <T> UserResult<T> setUserResult(String msg,Integer state,T data){
        UserResult<T> userResult = new UserResult();
        userResult.setMsg(msg);
        userResult.setData(data);
        userResult.setState(state);
        return userResult;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
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
}
