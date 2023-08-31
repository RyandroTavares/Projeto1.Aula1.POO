import java.io.Serializable;

public class Pessoa implements Serializable {
    public String name;
    public Integer age;

    public Pessoa(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
