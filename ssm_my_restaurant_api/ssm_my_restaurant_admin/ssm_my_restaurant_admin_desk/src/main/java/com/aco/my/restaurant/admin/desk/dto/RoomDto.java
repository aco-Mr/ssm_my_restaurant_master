package com.aco.my.restaurant.admin.desk.dto;

import com.my.restaurant.domain.Desk;
import com.my.restaurant.domain.Room;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoomDto extends Room {

    private List<Desk> deskList;

    public List<Desk> getDeskList() {
        return deskList;
    }

    public void setDeskList(List<Desk> deskList) {
        this.deskList = deskList;
    }

    private Set<Desk> desks = new HashSet<Desk>();

    public Set<Desk> getDesks() {
        return desks;
    }

    public void setDesks(Set<Desk> desks) {
        this.desks = desks;
    }

    @Override
    public String toString() {
        return "RoomDto{" +
                "desks=" + desks +
                '}';
    }
}