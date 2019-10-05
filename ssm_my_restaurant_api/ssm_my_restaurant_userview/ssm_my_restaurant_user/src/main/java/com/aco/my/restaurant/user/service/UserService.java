package com.aco.my.restaurant.user.service;

import com.aco.my.restaurant.user.dto.UserDto;
import com.my.restaurant.domain.po.AUser;

import java.util.List;

public interface UserService {
    public List<UserDto> findAll();

    public List<UserDto> findByUser(UserDto user);
    //根据id查
    public UserDto findByUserUid1(Integer uid);

    //根据id查(修改)
    public AUser findByUserUid(Integer uid);

    //修改
    public Integer updateUser(AUser auser);

    //根据uname查
    public AUser findByUname(String uname);


    //根据id查 多表外连接
    public UserDto findByUserUid2(Integer uid);

    //根据用户查订单
    UserDto findOrderByUser(Integer uid);
}
