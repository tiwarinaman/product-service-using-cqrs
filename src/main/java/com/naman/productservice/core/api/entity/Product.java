package com.naman.productservice.core.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
public class Product {
    @Id
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
