package task2.factories;

import org.springframework.beans.factory.FactoryBean;
import task2.entities.Employee;
import task2.entities.Position;

public class EmployeeFactoryBean implements FactoryBean<Employee> {
    private String name;
    private Position position;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Employee getObject() throws Exception {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setPosition(position);
        return employee;
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }
}
