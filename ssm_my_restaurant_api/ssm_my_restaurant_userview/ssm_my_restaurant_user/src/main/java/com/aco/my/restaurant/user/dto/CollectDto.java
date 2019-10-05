package com.aco.my.restaurant.user.dto;

import com.my.restaurant.domain.po.ACollect;
import com.my.restaurant.domain.po.AGoods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;


@Data
@EqualsAndHashCode(callSuper = true)
@Repository
public class CollectDto extends ACollect {
    //一对yi
    private GoodsDto goodsDto;


}
