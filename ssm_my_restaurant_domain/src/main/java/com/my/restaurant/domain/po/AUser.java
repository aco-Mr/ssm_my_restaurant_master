package com.my.restaurant.domain.po;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class AUser {
    private Integer uid;

    private String uname;
    @JSONField(serialize = false)
    private String password;

    private String sex;

    private String tel;

    /**
    * 0，不是会员  1，是会员
    */
    private Integer vipState;

    private Date loginTime;

    private Date registerTime;
    
}