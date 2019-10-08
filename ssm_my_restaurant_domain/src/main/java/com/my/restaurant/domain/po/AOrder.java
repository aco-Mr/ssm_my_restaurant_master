package com.my.restaurant.domain.po;

import java.util.Date;
import lombok.Data;

@Data
public class AOrder {
    private Integer oid;

    private Integer did;

    private Integer uid;

    private Integer clientnums;

    private Double discount;

    /**
    * 1个人2块
    */
    private Integer teafee;

    private Double totalprice;

    private Date startdatetime;

    private Date eatstarttime;

    private Integer eattime;

    private Date paytime;

    private Integer ispay;

    /**
    * 0为未处理，1为已完成，2为正在付款中
    */
    private Integer state;
}