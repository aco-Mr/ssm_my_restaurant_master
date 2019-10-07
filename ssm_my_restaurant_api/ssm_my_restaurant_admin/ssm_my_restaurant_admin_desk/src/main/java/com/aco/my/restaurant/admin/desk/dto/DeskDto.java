package com.aco.my.restaurant.admin.desk.dto;

import com.my.restaurant.domain.Desk;
import com.my.restaurant.domain.Room;

public class DeskDto extends Desk {


    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    @Override
    public String toString() {
        return "DeskDto{" +
                "room=" + room +
                '}';
    }
}