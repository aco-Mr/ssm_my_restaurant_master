package com.aco.my.restaurant.loginAndRegister.service.impl;

import com.aco.my.restaurant.loginAndRegister.dao.UserDao;
import com.aco.my.restaurant.loginAndRegister.dto.UserDto;
import com.aco.my.restaurant.loginAndRegister.service.UserService;
import com.aco.my.restaurant.loginAndRegister.vo.UserResult;
import com.my.restaurant.utils.DateUtils;
import com.my.restaurant.utils.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public UserResult<UserDto> login(String username, String password) {
        UserDto userDto = userDao.findByName(username);
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        //获取当前时间
        String date = DateUtils.getDate();
        //判断用户名是否为空
        if (username != null) {
            //判断密码是否为空
            if (userDto!=null&&!StringUtils.isEmpty(s) && !StringUtils.isEmpty(userDto.getPassword()) && userDto.getPassword().equals(s)) {
                //判断登录时间是否修改成功
                if (userDao.createLoginTime(date, userDto.getUid()) > 0) {
                    return UserResult.setUserResult(ResultSet.LOGIN_SUCEESE_USERNAME, ResultSet.LOGIN_SUCEESE_USER, userDto);
                }
                //修改不成功
                else {
                    return UserResult.setUserResult(ResultSet.LOGIN_FAIL_USERS, ResultSet.LOGIN_FAIL_USER, userDto);
                }
            }
            //密码错误
            else {
                return UserResult.setUserResult(ResultSet.LOGIN_FAIL_USERS, ResultSet.LOGIN_FAIL_USER, userDto);
            }
        } else {
            //用户不存在
            return UserResult.setUserResult(ResultSet.LOGIN_FAIL_USERS, ResultSet.LOGIN_FAIL_USER, userDto);
        }
    }

    @Override
    public UserResult<Integer> resgister(UserDto userDto) {
        UserDto byName = userDao.findByName(userDto.getUname());
        //判断用户名是否存在
        if (userDto != null && userDao.findByName(userDto.getUname()) == null) {
            //插入用户数据
            int rows = userDao.insertUser(userDto);
            //插入成功
            if (rows > 0) {
                return UserResult.setUserResult(ResultSet.REGISTER_SUCCESS_USERS, ResultSet.REGISTER_SUCCESS_USER, rows);
            }
            //插入失败
            else{
                return UserResult.setUserResult(ResultSet.REGISTER_FAIL_FORMATS,ResultSet.REGISTER_FAIL_FORMAT,rows);
            }
        }
        //用户名存在
        else {
            return UserResult.setUserResult(ResultSet.REGISTER_FAIL_USERNAMES, ResultSet.REGISTER_FAIL_USERNAME, -1);
        }
    }
}
