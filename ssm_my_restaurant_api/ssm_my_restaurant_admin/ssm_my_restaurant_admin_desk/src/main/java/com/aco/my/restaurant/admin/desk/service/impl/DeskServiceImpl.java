package com.aco.my.restaurant.admin.desk.service.impl;

import com.aco.my.restaurant.admin.desk.dao.DeskDao;
import com.aco.my.restaurant.admin.desk.service.DeskService;
import com.my.restaurant.domain.Desk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskServiceImpl implements DeskService {
    @Autowired
    private DeskDao deskDao;

    @Override
    public int insert(Desk desk) {
        return deskDao.insert(desk);
    }

    @Override
    public int updateStatue(Integer did, Integer dstatue) {
        return deskDao.updateStatue(did,dstatue);
    }

    @Override
    public List<Desk> findByCondition1(Integer rtype) {
        return deskDao.findByCondition1(rtype);
    }

}
