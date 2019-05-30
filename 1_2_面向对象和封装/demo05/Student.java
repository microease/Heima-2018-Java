package demo05;

public class Student {
    private String name;
    private int age;
    public  Student(){
        System.out.println("执行无参构造方法");
    }
    public Student(String name,int age){
        System.out.println("执行全参构造方法");
        this.name = name;
        this.age = age;
    }
}
