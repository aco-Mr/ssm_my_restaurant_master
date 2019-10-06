package com.aco.my.restaurant.loginAndRegister.service;

import com.aco.my.restaurant.loginAndRegister.dto.UserDto;
import com.aco.my.restaurant.loginAndRegister.vo.UserResult;

import java.util.List;

public interface UserService {
    public UserResult<UserDto> login(String username, String password);

    public UserResult<Integer> resgister(UserDto userDto);
}
