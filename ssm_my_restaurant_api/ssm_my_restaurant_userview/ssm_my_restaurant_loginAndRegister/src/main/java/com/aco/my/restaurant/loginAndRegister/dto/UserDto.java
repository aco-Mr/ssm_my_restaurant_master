package com.aco.my.restaurant.loginAndRegister.dto;
import com.alibaba.fastjson.annotation.JSONField;

public class UserDto {
    private Integer uid;
    private String uname;
    private String password;
    private String sex;
    private Long tel;
    private Integer ustate;
    private String loginTime;
    private String registerTime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", tel=" + tel +
                ", ustate=" + ustate +
                ", loginTime='" + loginTime + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
