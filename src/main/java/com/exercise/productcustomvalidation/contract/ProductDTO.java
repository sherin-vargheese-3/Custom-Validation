package com.exercise.productcustomvalidation.contract;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private String sku;
    private String category;
    private BigDecimal price;
    private int stockQuantity;
}
