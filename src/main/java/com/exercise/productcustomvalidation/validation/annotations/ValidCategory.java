package com.exercise.productcustomvalidation.validation.annotations;

import com.exercise.productcustomvalidation.validation.validators.CategoryValidator;
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