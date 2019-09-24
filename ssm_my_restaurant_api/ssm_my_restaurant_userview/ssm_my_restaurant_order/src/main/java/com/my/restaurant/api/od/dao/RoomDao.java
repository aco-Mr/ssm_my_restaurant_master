package com.my.restaurant.api.od.dao;

import com.my.restaurant.domain.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDao {
    public List<Room> findAll();
}
