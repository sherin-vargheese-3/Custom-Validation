package com.exercise.productcustomvalidation.validation.validators;

import com.exercise.productcustomvalidation.validation.annotations.ValidSku;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class SkuValidator implements ConstraintValidator<ValidSku, String> {
    private static final Pattern SKU_PATTERN = Pattern.compile("[A-Z]{3}-\\d{3}");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && SKU_PATTERN.matcher(value).matches();
    }
}