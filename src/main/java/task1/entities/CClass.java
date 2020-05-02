package task1.entities;

public class CClass {
    private DClass dClass;

    public CClass() {
    }

    public DClass createDClass() {
        return null;
    }

    public void doSmth(String dClassString) {
        dClass = createDClass();
        dClass.setString(dClassString);
    }

    @Override
    public String toString() {
        return "CClass{" +
                "dClass=" + dClass +
                '}';
    }
}
