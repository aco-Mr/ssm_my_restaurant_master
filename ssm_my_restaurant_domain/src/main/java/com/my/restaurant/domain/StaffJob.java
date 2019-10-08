package com.my.restaurant.domain;

/**
 * @ClassName: StaffJob
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/27 14:07
 * @Version: 1.0.0
 */
public class StaffJob {
    private Integer jid;
    private  String jname;

    public StaffJob() {
    }

    public StaffJob(Integer jid, String jname) {
        this.jid = jid;
        this.jname = jname;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    @Override
    public String toString() {
        return "StaffJob{" +
                "jid=" + jid +
                ", jname='" + jname + '\'' +
                '}';
    }
}
