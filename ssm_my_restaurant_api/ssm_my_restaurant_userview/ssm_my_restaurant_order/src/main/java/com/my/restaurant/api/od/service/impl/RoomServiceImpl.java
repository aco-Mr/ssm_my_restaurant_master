package com.my.restaurant.api.od.service.impl;

import com.my.restaurant.api.od.dao.RoomDao;
import com.my.restaurant.api.od.service.RoomService;
import com.my.restaurant.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomDao roomDao;
    @Override
    public List<Room> findAll() {
        return roomDao.findAll();
    }
}
