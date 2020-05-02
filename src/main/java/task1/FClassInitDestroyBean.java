package task1;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import task1.entities.FClass;

public class FClassInitDestroyBean implements InitializingBean, DisposableBean {
    private static final Logger log = Logger.getLogger(String.valueOf(FClassInitDestroyBean.class));
    private FClass fClass;

    public FClass getfClass() {
        return fClass;
    }

    public void setfClass(FClass fClass) {
        this.fClass = fClass;
    }

    @Override
    public void destroy() throws Exception {
        log.info("FClass. Bean was destroyed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("FClass. After properties set() was called.");
    }
}
