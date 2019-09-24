package com.my.restaurant.dto;

import java.io.Serializable;

/**
 * 自定义返回结果
 */
public class BaseResult implements Serializable {
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_FAIL = 500;

    private int status;
    private String message;
    private Object data;
    private String backUrl;

    public static BaseResult success() {
        return BaseResult.createResult(STATUS_SUCCESS, "成功", null,null);
    }

    public static BaseResult success(String message) {
        return BaseResult.createResult(STATUS_SUCCESS, message, null,null);
    }

    public static BaseResult success(String message, Object data) {
        return BaseResult.createResult(STATUS_SUCCESS, message, data,null);
    }
    public static BaseResult success(String message, Object data,String backUrl) {
        return BaseResult.createResult(STATUS_SUCCESS, message, data,backUrl);
    }

    public static BaseResult fail() {
        return BaseResult.createResult(STATUS_FAIL, "失败", null,null);
    }

    public static BaseResult fail(String message) {
        return BaseResult.createResult(STATUS_FAIL, message, null,null);
    }

    public static BaseResult fail(int status, String message) {
        return BaseResult.createResult(status, message, null,null);
    }

    public static BaseResult fail(int status, String message,String backUrl) {
        return BaseResult.createResult(status, message, null,backUrl);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    private static BaseResult createResult(int status, String message, Object data,String backUrl) {
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(status);
        baseResult.setMessage(message);
        baseResult.setData(data);
        baseResult.setBackUrl(backUrl);
        return baseResult;
    }
}
