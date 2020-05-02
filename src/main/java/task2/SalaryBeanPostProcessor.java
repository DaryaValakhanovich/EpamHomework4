package task2;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import task2.entities.Salary;
import task2.services.SalaryService;

public class SalaryBeanPostProcessor implements BeanPostProcessor {
    private static final Logger log = Logger.getLogger(String.valueOf(Runner.class));
    private SalaryService salaryService = new SalaryService();

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Salary) {
            Salary salary = (Salary) bean;
            log.info("postProcessBeforeInitialization. Salary before changing: " + salary.getCount());
            salaryService.change(salary);
            log.info("postProcessBeforeInitialization. Salary after changing: " + salary.getCount());
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
