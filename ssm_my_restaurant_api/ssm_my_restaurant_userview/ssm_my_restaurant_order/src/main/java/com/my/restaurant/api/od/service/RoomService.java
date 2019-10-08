package com.my.restaurant.api.od.service;

import com.my.restaurant.api.od.dto.Room;
import java.util.List;

public interface RoomService {
    public List<Room> findAll(String rtype);
    public List<Room> findRoomType();
}
