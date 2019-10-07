package com.my.restaurant.api.od.service.impl;


import com.my.restaurant.api.od.dao.DeskDao;
import com.my.restaurant.api.od.service.DeskService;
import com.my.restaurant.api.od.dto.Desk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskServiceImpl implements DeskService {
    @Autowired
    private DeskDao deskDao;
    @Override
    public List<Desk> findRoomDesk(int rid) {
        return deskDao.findRoomDesk(rid);
    }

    @Override
    public int updateStatue(int did) {
        return deskDao.updateStatue(did);
    }

    @Override
    public int resetStatue(int did) {
        return deskDao.resetStatue(did);
    }
}
