package com.naman.productservice.core.api.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductRestModel {
    private final String name;
    private final BigDecimal price;
    private final Integer quantity;
}
