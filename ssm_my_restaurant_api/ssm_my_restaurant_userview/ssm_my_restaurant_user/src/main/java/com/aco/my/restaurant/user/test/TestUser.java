package com.aco.my.restaurant.user.test;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.UserDto;
import com.aco.my.restaurant.user.service.UserService;
import com.my.restaurant.domain.po.AUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml",
        "classpath:spring-context.xml"})
public class TestUser {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        List<UserDto> users = userService.findAll();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void test2(){
        UserDto user = new UserDto();
        List<UserDto> users = userService.findByUser(user);
        users.forEach(user1 -> System.out.println(user1));
    }
    @Test
    public void test3(){
        UserDto byId = userService.findByUserUid1(1) ;
        System.out.println(byId);
        
    }
//    @Test
//    public void test4(){
//        UserDto userDto = userService.findByUserUid(1) ;
//        System.out.println(userDto);
//        Set<GoodsDto> goods = userDto.getGoods();
//        goods.forEach(goodsDto -> System.out.println(goodsDto));
//
//    }

}
