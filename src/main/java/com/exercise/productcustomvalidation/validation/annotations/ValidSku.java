package com.exercise.productcustomvalidation.validation.annotations;

import com.exercise.productcustomvalidation.validation.validators.SkuValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = SkuValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidSku {
    String message() default "Invalid SKU Format!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}