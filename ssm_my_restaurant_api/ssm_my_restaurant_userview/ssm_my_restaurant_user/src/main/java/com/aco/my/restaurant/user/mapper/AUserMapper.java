package com.aco.my.restaurant.user.mapper;

import com.aco.my.restaurant.user.dto.UserDto;
import com.my.restaurant.domain.po.AUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(AUser record);

    int insertSelective(AUser record);

    AUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(AUser record);

    int updateByPrimaryKey(AUser record);

    public List<UserDto> findAll();

    public List<UserDto> findByUser(UserDto userDto);

    //根据id查
    public UserDto findByUserUid1(Integer uid);

    //根据id查
    public AUser findByUserUid(Integer uid);

    //修改
    public Integer updateUser(AUser auser);

    //根据uname查
    public AUser findByUname(@Param("uname") String uname);

    //根据id查 多表外连接
    public UserDto findByUserUid2(@Param("uid")Integer uid);

    //根据用户查订单
    public UserDto findOrderByUser(@Param("uid")Integer uid);
}