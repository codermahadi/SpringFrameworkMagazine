package com.mahadi.validation;

import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Mahadi on 10/20/2017.
 */
public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> {

    private int min;

    public void initialize(ValidEmail validEmail) {
        min = validEmail.min();
    }

    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email.length() < min) {
            return false;
        }
        if (!EmailValidator.getInstance(false).isValid(email)){
            return false;
    }
        return true;
    }
}
