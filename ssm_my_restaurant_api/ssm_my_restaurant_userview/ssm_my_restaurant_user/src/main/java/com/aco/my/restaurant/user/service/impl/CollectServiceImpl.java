package com.aco.my.restaurant.user.service.impl;


import com.aco.my.restaurant.user.mapper.ACollectMapper;
import com.aco.my.restaurant.user.service.CollectService;
import com.my.restaurant.domain.po.ACollect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private ACollectMapper aCollectMapper;

    @Override
    public List<ACollect> findByUid(Integer uid) {
        return aCollectMapper.findByUid(uid);
    }

    @Override
    public ACollect findByCollectId(Integer collectId) {
        return aCollectMapper.findByCollectId(collectId);
    }

    @Override
    public Integer findById(Integer collectId) {
        return aCollectMapper.findById(collectId);
    }
}
