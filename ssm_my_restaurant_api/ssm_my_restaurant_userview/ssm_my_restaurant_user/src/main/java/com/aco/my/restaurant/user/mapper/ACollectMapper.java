package com.aco.my.restaurant.user.mapper;

import com.my.restaurant.domain.po.ACollect;

import java.util.List;

public interface ACollectMapper {
    int deleteByPrimaryKey(Integer collectId);

    int insert(ACollect record);

    int insertSelective(ACollect record);

    ACollect selectByPrimaryKey(Integer collectId);

    int updateByPrimaryKeySelective(ACollect record);

    int updateByPrimaryKey(ACollect record);

    //按用户id查询
    public List<ACollect> findByUid(Integer uid);
    //按编号删除
    public Integer findById(Integer collectId);

    //按编号查询
    ACollect findByCollectId(Integer collectId);
}