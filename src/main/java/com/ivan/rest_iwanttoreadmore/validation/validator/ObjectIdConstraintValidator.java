package com.ivan.rest_iwanttoreadmore.validation.validator;

import com.ivan.rest_iwanttoreadmore.validation.annotation.ValidObjectId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.bson.types.ObjectId;

public class ObjectIdConstraintValidator implements ConstraintValidator<ValidObjectId, String> {
    @Override
    public void initialize(ValidObjectId constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return ObjectId.isValid(s);
    }
}
