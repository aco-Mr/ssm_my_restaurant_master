package com.aco.my.restaurant.user.service;

import com.my.restaurant.domain.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/10/5 21:57
 * @Version: 1.0.0
 */
public interface UserService {
    public List<User> findByUserAll(User user);
}
