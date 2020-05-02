package task1.entities;

public class DClass {
    private String string;

    public DClass() {
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "DClass{" +
                "string='" + string + '\'' +
                '}';
    }
}
