package task1.entities;

import task1.entities.AClass;

public class BClass {
    private AClass aClass;

    public BClass(AClass aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "BClass{" +
                "aClass=" + aClass +
                '}';
    }
}
