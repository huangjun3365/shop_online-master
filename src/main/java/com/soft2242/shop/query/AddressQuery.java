package com.soft2242.shop.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AddressQuery {
    @Schema(description = "地址id addressId")
    private Integer addressId;
}


