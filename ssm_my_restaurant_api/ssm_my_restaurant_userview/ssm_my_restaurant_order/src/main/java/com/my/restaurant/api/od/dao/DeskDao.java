package com.my.restaurant.api.od.dao;


import com.my.restaurant.api.od.dto.Desk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskDao {
    public List<Desk> findRoomDesk(int rid);

    int updateStatue(int did);

    int resetStatue(int did) ;
}
