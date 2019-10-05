package com.aco.my.restaurant.user.web.controller;


import com.aco.my.restaurant.user.dto.UserDto;
import com.aco.my.restaurant.user.service.UserService;

import com.my.restaurant.domain.po.AUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findByUid1")
    public UserDto findById1(Integer uid){
        UserDto userDto = userService.findByUserUid1(uid);
        return userDto;
    }

    @RequestMapping("/findByUid")
    public AUser findById(Integer uid){
        AUser userDto = userService.findByUserUid(uid);
        return userDto;
    }
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody AUser aUser){

        AUser auser = userService.findByUserUid(aUser.getUid());
        auser.setUname(aUser.getUname());
        auser.setSex(aUser.getSex());
        auser.setTel(aUser.getTel());

        Integer row = userService.updateUser(auser);
        System.out.println(row);
    }


    @RequestMapping("/findByUserId2")
    public UserDto findByUserId2(Integer uid){
        UserDto userDto = userService.findByUserUid2(uid);

        return userDto;
    }
    //通过用户找订单 订单找菜单 找价格
    @RequestMapping("/findOrderByUser")
    public UserDto findOrderByUser(Integer uid){
        UserDto userDto = userService.findOrderByUser(uid);
        return userDto;

    }
     //通过uname查
    @RequestMapping("/findByUname")
    public AUser findByUname(String uname){
        AUser userDto = userService.findByUname(uname);

        return userDto;

    }



}
