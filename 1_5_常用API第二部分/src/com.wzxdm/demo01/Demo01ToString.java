package src.com.wzxdm.demo01;

public class Demo01ToString {
    public static void main(String[] args) {
        Person person = new Person("迪丽热巴",20);
        String s = person.toString();
        System.out.println(s);
        Person person2 = new Person("迪丽热巴", 20);
        boolean equals = person.equals(person2);
        System.out.println(equals);
    }
}
