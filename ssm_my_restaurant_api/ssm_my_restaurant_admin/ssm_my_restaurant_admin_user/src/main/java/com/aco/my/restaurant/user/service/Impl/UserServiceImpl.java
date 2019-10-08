package com.aco.my.restaurant.user.service.Impl;

import com.aco.my.restaurant.user.dao.UserDao;
import com.aco.my.restaurant.user.service.UserService;
import com.my.restaurant.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/10/5 21:59
 * @Version: 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findByUserAll(User user) {
        return userDao.findByUserAll(user);
    }
}
