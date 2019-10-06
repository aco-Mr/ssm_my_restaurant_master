package com.my.restaurant.utils;

import java.text.SimpleDateFormat;

public class DateUtils {
    public static String getDate(){
        //获取当前时间
        java.util.Date date = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = df.format(date);
        return format;
    }
}
