package com.aco.my.restaurant.user.dto;

import com.my.restaurant.domain.po.AOrderGoods;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Data
@Repository
public class OrderGoodsDto extends AOrderGoods {

    private GoodsDto goodsDto;
}
