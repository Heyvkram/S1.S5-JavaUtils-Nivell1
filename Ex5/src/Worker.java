import java.io.Serializable;

public class Worker implements Serializable {
    String name;
    int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + ", age=" + age;
    }
}
