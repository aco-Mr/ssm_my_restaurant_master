package com.aco.my.restaurant.loginAndRegister.dao;

import com.aco.my.restaurant.loginAndRegister.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public UserDto findByName(@Param("username") String username);

    public int createLoginTime(@Param("date") String date,@Param("uid") Integer uid);

    public int insertUser(@Param("userDto") UserDto userDto);
}
