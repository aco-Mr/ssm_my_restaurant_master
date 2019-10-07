package com.aco.my.restaurant.admin.desk.service;

import com.aco.my.restaurant.admin.desk.dto.RoomDto;
import com.my.restaurant.domain.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomService {
    // 按条件查询
    List<Room> findByCondition1(@Param("rtype")Integer rtype);

    int insert(RoomDto roomDto);

}
