package com.aco.my.restaurant.admin.desk.service;

import com.my.restaurant.domain.Desk;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeskService {

        List<Desk> findByCondition1(@Param("rtype") Integer rtype);

        //int updateById
        int updateStatue(@Param("did") Integer did, @Param("dstatue") Integer dstatue);

        //添加全部数据
        int insert(Desk desk);
}
