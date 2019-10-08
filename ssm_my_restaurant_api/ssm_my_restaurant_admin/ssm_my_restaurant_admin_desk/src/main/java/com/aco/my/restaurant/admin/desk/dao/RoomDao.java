package com.aco.my.restaurant.admin.desk.dao;

import com.my.restaurant.domain.Room;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDao {
    int deleteByPrimaryKey(Integer rid);

    int insert(Room room);

    int insertSelective(Room room);

    Room selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Room room);

    int updateByPrimaryKey(Room room);

    // 按条件查询
    List<Room> findByCondition1(@Param("rtype")Integer rtype);


}