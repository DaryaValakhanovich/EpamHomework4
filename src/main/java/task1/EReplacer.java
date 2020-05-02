package task1;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class EReplacer implements MethodReplacer {
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Do smth else");
        return null;
    }
}
