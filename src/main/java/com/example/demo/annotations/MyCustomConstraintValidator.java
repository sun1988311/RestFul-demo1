package com.example.demo.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;

public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstraint, String> {

    @Override
    public void initialize(MyCustomConstraint myCustomConstraint){

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(!s.equals("北京")){
            return false;
        }
        return true;
    }
}
