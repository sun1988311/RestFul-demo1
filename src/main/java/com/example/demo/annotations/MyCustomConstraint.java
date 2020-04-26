package com.example.demo.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyCustomConstraintValidator.class)
public @interface MyCustomConstraint {

    String message() default "请输入北京!";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
