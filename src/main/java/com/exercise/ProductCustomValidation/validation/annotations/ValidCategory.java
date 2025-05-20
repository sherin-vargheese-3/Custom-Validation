package com.exercise.ProductCustomValidation.validation.annotations;

import com.exercise.ProductCustomValidation.validation.validators.CategoryValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CategoryValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCategory {
    String message() default "Invalid category!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}