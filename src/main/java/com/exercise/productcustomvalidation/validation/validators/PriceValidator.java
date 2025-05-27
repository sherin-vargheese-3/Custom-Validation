package com.exercise.productcustomvalidation.validation.validators;

import com.exercise.productcustomvalidation.validation.annotations.ValidPrice;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.math.BigDecimal;

public class PriceValidator implements ConstraintValidator<ValidPrice, BigDecimal> {

    @Override
    public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
        return value.scale() <= 2 && value.compareTo(BigDecimal.ZERO) >= 0;
    }
}