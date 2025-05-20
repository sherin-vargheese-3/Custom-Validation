package com.exercise.ProductCustomValidation.service;

import com.exercise.ProductCustomValidation.contract.ProductDTO;
import com.exercise.ProductCustomValidation.model.Product;
import com.exercise.ProductCustomValidation.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> findAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream()
                .map(this::convertToDto)
                .toList();
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .sku(productDTO.getSku())
                .category(productDTO.getCategory())
                .price(productDTO.getPrice())
                .stockQuantity(productDTO.getStockQuantity())
                .build();

        Product savedProduct = productRepository.save(product);
        return convertToDto(savedProduct);
    }

    public ProductDTO convertToDto(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .sku(product.getSku())
                .category(product.getCategory())
                .price(product.getPrice())
                .stockQuantity(product.getStockQuantity())
                .build();
    }
}
