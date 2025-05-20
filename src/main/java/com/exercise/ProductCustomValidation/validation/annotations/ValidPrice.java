package com.exercise.ProductCustomValidation.validation.annotations;

import com.exercise.ProductCustomValidation.validation.validators.PriceValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PriceValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPrice {
    String message() default "Must be a positive number with max 2 decimal places";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}