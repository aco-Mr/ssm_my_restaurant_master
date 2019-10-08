package com.aco.my.restaurant.user.service;

import com.my.restaurant.domain.po.ACollect;

import java.util.List;

public interface CollectService {
    public List<ACollect> findByUid(Integer uid);
    public Integer findById(Integer collectId);

    //按编号查询
    ACollect findByCollectId(Integer collectId);
}
