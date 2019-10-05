package com.aco.my.restaurant.user.dto;

import com.my.restaurant.domain.po.AUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@EqualsAndHashCode(callSuper = true)
@Repository
public class UserDto extends AUser {
    //用户对收藏
    private Set<CollectDto> collectDtos=new HashSet<>();

    //找账单 一对一
    private OrderDto orderDto;
}
