package task2.factories;

import org.springframework.beans.factory.FactoryBean;
import task2.entities.Position;
import task2.entities.Salary;

public class PositionFactoryBean implements FactoryBean<Position> {
    private String name;
    private Salary salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public Position getObject() throws Exception {
        Position position = new Position();
        position.setName(name);
        position.setSalary(salary);
        return position;
    }

    @Override
    public Class<?> getObjectType() {
        return Position.class;
    }
}
