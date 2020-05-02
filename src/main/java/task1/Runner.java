package task1;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task1.entities.EClass;
import task1.entities.AClass;
import task1.entities.BClass;
import task1.entities.CClass;
import task1.entities.DClass;
import task1.entities.FClass;

public class Runner {
    private static final Logger log = Logger.getLogger(String.valueOf(Runner.class));

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Context1.xml");

        AClass aClass = context.getBean("aBean", AClass.class);
        System.out.println(aClass);

        BClass bClass = context.getBean("bBean", BClass.class);
        System.out.println(bClass);

        CClass cClass = context.getBean("cBean", CClass.class);
        System.out.println(cClass);
        cClass.doSmth("qqq");
        System.out.println(cClass);

        DClass dClass = context.getBean("dBean", DClass.class);
        System.out.println(dClass);

        EClass eClass = context.getBean("eBean", EClass.class);
        System.out.println(eClass);
        eClass.eMethod();

        FClass fClass = context.getBean("fBean", FClass.class);
        System.out.println(fClass);

        context.close();
    }
}
