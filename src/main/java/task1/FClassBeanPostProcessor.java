package task1;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import task1.entities.FClass;

public class FClassBeanPostProcessor implements BeanPostProcessor {
    private static final Logger log = Logger.getLogger(String.valueOf(Runner.class));

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof FClass) {
            log.info("FClass postProcessBeforeInitialization");
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof  FClass) {
            log.info("FClass postProcessAfterInitialization");
        }
        return bean;
    }
}
