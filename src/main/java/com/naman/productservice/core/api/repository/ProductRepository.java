package com.naman.productservice.core.api.repository;

import com.naman.productservice.core.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
