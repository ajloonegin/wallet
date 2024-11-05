package ir.freeland.springboot.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CardNumberValidator implements ConstraintValidator<CardNumber, String> {

	@Override
	public boolean isValid(String cardNumber,ConstraintValidatorContext cxt) {

        if (cardNumber.length() != 16 ||
                Integer.parseInt(cardNumber.substring(0, 8)) == 0 ||
                Integer.parseInt(cardNumber.substring(8, 16)) == 0
        )
            return false;

        var sum = 0;
        for (int i = 0; i < 16; i++) {

            int radix = (i % 2 == 0) ? 2 : 1;
            int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(i))) * radix;
            sum += digit > 9 ? digit - 9 : digit;

        }
        return sum % 10 == 0;
    }
}
