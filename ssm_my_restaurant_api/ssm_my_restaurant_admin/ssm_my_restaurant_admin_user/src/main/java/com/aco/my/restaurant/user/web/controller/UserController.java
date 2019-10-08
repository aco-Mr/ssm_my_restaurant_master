package com.aco.my.restaurant.user.web.controller;

import com.aco.my.restaurant.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.User;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/10/5 22:22
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/list")
    public PageInfo<User> list (String stu , Integer pageNum, Integer pageSize) throws Exception {
        User user = MapperUtils.json2pojo(stu, User.class);
        PageHelper.startPage(pageNum,pageSize);
        System.out.println(stu);
        List<User> list = userService.findByUserAll(user);
        list.forEach(s-> System.out.println(s));
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
