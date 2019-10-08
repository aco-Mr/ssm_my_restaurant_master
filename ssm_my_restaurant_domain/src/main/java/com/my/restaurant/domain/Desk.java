package com.my.restaurant.domain;

public class Desk {
    private Integer did;

    private Integer dvolum;

    /**
    * 0为空置，1为正在用餐
    */
    private Integer dstatue;

    /**
    * 用来描述这个编号的餐桌是哪个房间的
    */
    private Integer fid;


    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDvolum() {
        return dvolum;
    }

    public void setDvolum(Integer dvolum) {
        this.dvolum = dvolum;
    }

    public Integer getDstatue() {
        return dstatue;
    }

    public void setDstatue(Integer dstatue) {
        this.dstatue = dstatue;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "did=" + did +
                ", dvolum=" + dvolum +
                ", dstatue=" + dstatue +
                ", fid=" + fid +
                '}';
    }
}