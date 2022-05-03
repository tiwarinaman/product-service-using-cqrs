package com.naman.productservice.command.api.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Data
@Builder
public class CreateProductCommand {
    @TargetAggregateIdentifier
    private final String productId;
    private final String name;
    private final BigDecimal price;
    private final Integer quantity;
}
