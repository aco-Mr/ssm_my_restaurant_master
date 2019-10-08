package com.my.restaurant.domain;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/30 10:21
 * @Version: 1.0.0
 */
public class User {
    private Integer uid;
    private String uname;
    private String password;
    private String sex;
    private String tel;
    private Integer ustate;
    private String logintime;
    private String registertime;

    public User() {
    }

    public User(Integer uid, String uname, String password, String sex, String tel, Integer ustate, String logintime, String registertime) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.sex = sex;
        this.tel = tel;
        this.ustate = ustate;
        this.logintime = logintime;
        this.registertime = registertime;
    }

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getRegistertime() {
        return registertime;
    }

    public void setRegistertime(String registertime) {
        this.registertime = registertime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", ustate=" + ustate +
                ", logintime='" + logintime + '\'' +
                ", registertime='" + registertime + '\'' +
                '}';
    }
}
