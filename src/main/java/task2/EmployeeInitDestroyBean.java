package task2;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import task2.entities.Employee;

public class EmployeeInitDestroyBean implements InitializingBean, DisposableBean {
    private static final Logger log = Logger.getLogger(String.valueOf(EmployeeInitDestroyBean.class));
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void destroy() throws Exception {
        log.info("Bean " + employee.getName() + " was destroyed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Bean " + employee.getName() + ". After properties set() was called.");
    }
}
