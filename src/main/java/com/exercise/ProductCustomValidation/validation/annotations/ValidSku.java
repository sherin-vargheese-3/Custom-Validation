package com.exercise.ProductCustomValidation.validation.annotations;

import com.exercise.ProductCustomValidation.validation.validators.SkuValidator;
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