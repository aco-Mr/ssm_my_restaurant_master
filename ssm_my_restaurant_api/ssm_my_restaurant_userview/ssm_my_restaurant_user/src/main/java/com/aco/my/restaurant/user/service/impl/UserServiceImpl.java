package com.aco.my.restaurant.user.service.impl;

import com.aco.my.restaurant.user.dto.UserDto;
import com.aco.my.restaurant.user.mapper.AUserMapper;
import com.aco.my.restaurant.user.service.UserService;
import com.my.restaurant.domain.po.AUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AUserMapper aUserMapper;

    @Override
    public List<UserDto> findAll() {
        return aUserMapper.findAll();
    }

    @Override
    public List<UserDto> findByUser(UserDto user) {
        return aUserMapper.findByUser(user);
    }

    @Override
    public UserDto findByUserUid1(Integer uid) {
        return aUserMapper.findByUserUid1(uid);
    }
    //查 后修改
    @Override
    public AUser findByUserUid(Integer uid) {
        return aUserMapper.findByUserUid(uid);
    }

    @Override
    public Integer updateUser(AUser auser) {
        return aUserMapper.updateUser(auser);
    }

    @Override
    public UserDto findByUserUid2(Integer uid) {
        return aUserMapper.findByUserUid2(uid);
    }

    @Override
    public AUser findByUname(String uname) {
        return aUserMapper.findByUname(uname);
    }

    //根据用户查订单
    @Override
    public UserDto findOrderByUser(Integer uid) {
        return aUserMapper.findOrderByUser(uid);
    }
}
