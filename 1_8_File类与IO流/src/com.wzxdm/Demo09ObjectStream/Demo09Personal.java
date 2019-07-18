package src.com.wzxdm.Demo09ObjectStream;

import java.io.Serializable;

public class Demo09Personal implements Serializable {
    private String name;
    private int age;

    public Demo09Personal() {
    }

    public Demo09Personal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
