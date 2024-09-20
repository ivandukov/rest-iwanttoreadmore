package com.ivan.rest_iwanttoreadmore.validation.annotation;

import com.ivan.rest_iwanttoreadmore.validation.validator.ObjectIdConstraintValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ObjectIdConstraintValidator.class)
public @interface ValidObjectId {
    String message() default "Invalid ObjectId format";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};
}
