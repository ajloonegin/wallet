package ir.freeland.springboot.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import ir.freeland.springboot.model.entity.Person;
import ir.freeland.springboot.services.PersonService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class MilitaryStatusValidator implements ConstraintValidator<MilitaryStatusRequired, Person>{
	
	
	
	@Autowired
	private PersonService personService;
	
	@Override
    public boolean isValid(Person person, ConstraintValidatorContext context) {

        if (person.getGender() == null) {
            return true; // Skip validation if gender is not specified
        }else if (personService == null) {
            throw new IllegalStateException("PersonService is not injected!");
        }
        Integer age=personService.calculateAge(person);

        if (person.getGender().equals("MALE") && age != null && age > 18) {
            // Check if military status is specified
            return person.getMilitaryStatus() != null ;
        }

        return true; // If not a male or if under 18, validation passes
    }
	
}
