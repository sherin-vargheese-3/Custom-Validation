package com.exercise.productcustomvalidation.validation.validators;

import com.exercise.productcustomvalidation.validation.annotations.ValidCategory;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;

public class CategoryValidator implements ConstraintValidator<ValidCategory, String> {
    private static final Set<String> ALLOWED = Set.of("electronics", "beauty", "grocery");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && ALLOWED.contains(value);
    }
}