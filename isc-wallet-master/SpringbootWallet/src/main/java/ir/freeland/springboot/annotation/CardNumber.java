package ir.freeland.springboot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CardNumberValidator.class)
public @interface CardNumber {

	public String message() default "Invalid Card Number Code: must be standard";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};

}
