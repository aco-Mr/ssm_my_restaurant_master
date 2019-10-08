package com.aco.my.restaurant.user.dto;

import com.my.restaurant.domain.po.AGoods;
import javafx.scene.effect.SepiaTone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Data
@EqualsAndHashCode(callSuper = true)
@Repository
public class GoodsDto extends AGoods {
    private PriceDto priceDto;

}
