package com.exercise.ProductCustomValidation.repository;

import com.exercise.ProductCustomValidation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
