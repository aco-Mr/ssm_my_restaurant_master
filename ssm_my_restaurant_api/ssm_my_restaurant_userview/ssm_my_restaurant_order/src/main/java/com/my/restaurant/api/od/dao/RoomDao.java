package com.my.restaurant.api.od.dao;

import com.my.restaurant.api.od.dto.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDao {

    List<Room> findRoomType();
    public List<Room> findAll(int rtype);
}
