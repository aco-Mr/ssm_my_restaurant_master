package com.aco.my.restaurant.admin.desk.dao;

import com.my.restaurant.domain.Desk;
import com.my.restaurant.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskDao {
    //删除
    int deleteByPrimaryKey(Integer did);
    //添加全部数据
    int insert(Desk desk);
    //按需添加
    int insertSelective(Desk desk);
    //按主键查数据
    Desk selectByPrimaryKey(Integer did);
    //按主键查数据
    Desk selectByFid(Integer fid);
    //查全部
    Desk findAll();
    //按需修改
    int updateByPrimaryKeySelective(Desk desk);
    //修改全部
    int updateByPrimaryKey(Desk desk);
    // 按条件查询
    List<Desk> findByCondition1(@Param("rtype") Integer rtype);
    //int updateById
    int updateStatue(@Param("did") Integer did,@Param("dstatue") Integer dstatue);


}