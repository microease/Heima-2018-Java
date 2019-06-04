package src.com.wzxdm.demo06Static;

public class demo03staticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";
        Student one = new Student("郭靖",19);
        System.out.println(one.getId());
        System.out.println(one.getAge());
        System.out.println(one.getName());
        System.out.println(one.getClass());

        Student two = new Student("黄蓉",16);
    }
}
