package com.my.restaurant.domain.po;

import java.util.Date;
import lombok.Data;

@Data
public class APrice {
    private Integer pid;

    private Integer gid;

    private Date ptime;

    private Double price;
}