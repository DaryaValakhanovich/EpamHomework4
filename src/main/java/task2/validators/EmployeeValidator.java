package task2.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import task2.entities.Employee;


public class EmployeeValidator implements Validator {

    public boolean supports(Class clazz) {
        return Employee.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
        ValidationUtils.rejectIfEmpty(e, "position", "name.empty");
        Employee employee = (Employee) obj;
        if (employee.getAge() < 18) {
            e.rejectValue("age", "too.young");
        } else if (employee.getAge() > 110) {
            e.rejectValue("age", "too.old");
        }
    }
}
