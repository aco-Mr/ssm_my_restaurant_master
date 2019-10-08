package com.aco.my.restaurant.user.dao;

import com.my.restaurant.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/10/5 21:57
 * @Version: 1.0.0
 */
@Repository
public interface UserDao {
    public List<User> findByUserAll(User user);
}
