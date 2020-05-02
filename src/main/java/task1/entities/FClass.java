package task1.entities;

import org.apache.log4j.Logger;
import task1.Runner;

public class FClass {
    private static final Logger log = Logger.getLogger(String.valueOf(Runner.class));
    private String someString;

    public FClass() {
        log.info("FClass constructor");
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        log.info("FClass setSomeString " + someString);
        this.someString = someString;
    }

    @Override
    public String toString() {
        return "FClass{" +
                "someString='" + someString + '\'' +
                '}';
    }
}
