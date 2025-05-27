package com.exercise.productcustomvalidation.repository;

import com.exercise.productcustomvalidation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
