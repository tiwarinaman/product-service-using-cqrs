package com.naman.productservice.query.api.controller;

import com.naman.productservice.core.api.model.ProductRestModel;
import com.naman.productservice.query.api.queries.GetProductsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductQueryController {

    private final QueryGateway queryGateway;

    public ProductQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {

        GetProductsQuery getProductsQuery = new GetProductsQuery();

        List<ProductRestModel> productRestModels = queryGateway.query(getProductsQuery, ResponseTypes
                .multipleInstancesOf(ProductRestModel.class)).join();


        return ResponseEntity.ok(productRestModels);
    }

}
