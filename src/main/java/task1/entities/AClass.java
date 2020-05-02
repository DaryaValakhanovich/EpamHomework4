package task1.entities;

public class AClass {
    private String someString;

    public AClass() {
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    @Override
    public String toString() {
        return "AClass{" +
                "someString='" + someString + '\'' +
                '}';
    }
}
