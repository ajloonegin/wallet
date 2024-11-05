package ir.freeland.springboot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = MilitaryStatusValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MilitaryStatusRequired {
	String message() default "Military status must be specified for men over 18 years.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
