package com.exercise.productcustomvalidation.model;


import com.exercise.productcustomvalidation.validation.annotations.ValidCategory;
import com.exercise.productcustomvalidation.validation.annotations.ValidPrice;
import com.exercise.productcustomvalidation.validation.annotations.ValidSku;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @ValidSku
    private String sku;

    @NotBlank
    @ValidCategory
    private String category;

    @NotNull
    @ValidPrice
    private BigDecimal price;

    @NotNull
    private Integer stockQuantity;
}
