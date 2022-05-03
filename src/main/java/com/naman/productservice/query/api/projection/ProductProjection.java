package com.naman.productservice.query.api.projection;

import com.naman.productservice.core.api.model.ProductRestModel;
import com.naman.productservice.core.api.repository.ProductRepository;
import com.naman.productservice.query.api.queries.GetProductsQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {

    private final ProductRepository productRepository;

    public ProductProjection(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryHandler
    public List<ProductRestModel> handle(GetProductsQuery query) {
        return productRepository.findAll()
                .stream()
                .map(product -> ProductRestModel.builder()
                        .name(product.getName())
                        .price(product.getPrice())
                        .quantity(product.getQuantity())
                        .build())
                .collect(Collectors.toList());
    }

}
