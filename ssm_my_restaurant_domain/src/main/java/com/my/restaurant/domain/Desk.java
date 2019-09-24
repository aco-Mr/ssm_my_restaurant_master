package com.my.restaurant.domain;

public class Desk {
    private Integer did;
    private Integer dvolum;
    private Integer dstatue;
    private Room room;

    public Desk() {
    }

    public Desk(Integer did, Integer dvolum, Integer dstatue, Room room) {
        this.did = did;
        this.dvolum = dvolum;
        this.dstatue = dstatue;
        this.room = room;
    }

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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "did=" + did +
                ", dvolum=" + dvolum +
                ", dstatue=" + dstatue +
                ", room=" + room +
                '}';
    }
}
