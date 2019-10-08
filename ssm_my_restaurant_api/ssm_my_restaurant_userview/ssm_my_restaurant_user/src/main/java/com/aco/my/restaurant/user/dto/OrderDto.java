package com.aco.my.restaurant.user.dto;

import com.my.restaurant.domain.po.AOrder;
import com.my.restaurant.domain.po.AOrderGoods;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Repository
public class OrderDto extends AOrder {

    private Set<OrderGoodsDto> orderGoodsDto;
}
