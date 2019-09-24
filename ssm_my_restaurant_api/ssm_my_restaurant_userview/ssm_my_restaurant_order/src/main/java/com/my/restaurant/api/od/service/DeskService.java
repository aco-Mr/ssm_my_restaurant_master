package com.my.restaurant.api.od.service;


import com.my.restaurant.domain.Desk;
import java.util.List;

public interface DeskService {
    public List<Desk> findRoomDesk(int rid);
}
