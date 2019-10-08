package com.my.restaurant.api.od.service;


import com.my.restaurant.api.od.dto.Desk;
import java.util.List;

public interface DeskService {
    public List<Desk> findRoomDesk(int rid);
    public int updateStatue(int did);
    public int resetStatue(int did);
}
