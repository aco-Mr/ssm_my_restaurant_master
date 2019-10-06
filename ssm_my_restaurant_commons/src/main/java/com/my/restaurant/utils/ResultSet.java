package com.my.restaurant.utils;

public class ResultSet {
    public static final int LOGIN_SUCEESE_USER = 200;//登录成功
    public static final int LOGIN_FAIL_USER = 303;//登录失败
    public static final int REGISTER_SUCCESS_USER = 400;//注册成功
    public static final int REGISTER_FAIL_USERNAME = 401;//用户名已存在
    public static final int REGISTER_FAIL_FORMAT = 402;//请输入正确的格式

    public static final String REGISTER_SUCCESS_USERS = "注册成功";
    public static final String REGISTER_FAIL_USERNAMES = "用户名已存在";
    public static final String REGISTER_FAIL_FORMATS = "请输入正确的格式";
    public static final String LOGIN_SUCEESE_USERNAME = "登录成功";
    public static final String LOGIN_FAIL_USERS = "用户名或密码错误";

    public static final int OBJECT_ISNULL = 121;//对象不能为空
    public static final String OBJECT_ISNULLS = "对象不能为空";

    public static final int FIND_GOODS_EXISTENCE = 2000;//菜品已存在
    public static final int SUCCESS_GOODS = 2010;//菜品添加成功
    public static final int GOODS_NOT_FIND = 2020;//菜单为空
    public static final int GOODS_IS_FIND = 2030;//查询成功
    public static final int GOODS_IS_NOT = 2040;//菜品不存在
    public static final int GOODS_IS_DEL = 3010;//删除成功
    public static final int GOODS_NOT_DEL = 3020;//删除失败
    public static final int GOODS_NOT_UPDATE = 4010;//修改失败
    public static final int GOODS_IS_UPDATE =4020;//修改成功

    public static final String GOODS_IS_UPDATES = "修改成功";
    public static final String GOODS_NOT_UPDATES = "修改失败";
    public static final String GOODS_NOT_DELS = "删除失败";
    public static final String GOODS_IS_DELS = "删除成功";
    public static final String SUCCESS_GOODSS = "菜品添加成功";
    public static final String FIND_GOODS_EXISTENCES = "菜品已存在";
    public static final String GOODS_NOT_FINDS = "菜单为空";
    public static final String GOODS_IS_FINDS = "查询成功";
    public static final String GOODS_IS_NOTS = "菜品不存在";
}
