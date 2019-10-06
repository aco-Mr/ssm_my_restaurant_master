package com.aco.my.restaurant.loginAndRegister.web.controller;

import com.aco.my.restaurant.loginAndRegister.dto.UserDto;
import com.aco.my.restaurant.loginAndRegister.service.UserService;
import com.aco.my.restaurant.loginAndRegister.vo.UserResult;
import com.my.restaurant.utils.DateUtils;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public UserResult<UserDto> login(String username, String password, Model model, ModelMap modelMap){
        UserResult<UserDto> login = userService.login(username, password);
        model.addAttribute("user",login.getData());
        return login;
    }

    @PostMapping("/register")
    public UserResult<Integer> register(@RequestBody UserDto user) throws Exception {
//        UserDto userDto = MapperUtils.json2pojo(user, UserDto.class);
        System.out.println("user:"+user);
        //获取当前时间
        String date = DateUtils.getDate();
        //加密密码
        String s = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(s);
        user.setLoginTime(date);
        user.setRegisterTime(date);
        System.out.println("userDto:"+user);
        return userService.resgister(user);
    }
}
