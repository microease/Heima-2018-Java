package demo05;

public class Demo01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("赵丽颖",20);
        System.out.println(stu2.getName()+stu2.getAge());
    }
}
