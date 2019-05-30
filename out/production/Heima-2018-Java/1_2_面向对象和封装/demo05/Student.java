package demo05;

public class Student {
    // 成员变量
    private String name;
    private int age;

    //无参数构造方法
    public Student() {
        System.out.println("执行无参构造方法");
    }

    //有参数构造方法
    public Student(String name, int age) {
        System.out.println("执行全参构造方法");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
