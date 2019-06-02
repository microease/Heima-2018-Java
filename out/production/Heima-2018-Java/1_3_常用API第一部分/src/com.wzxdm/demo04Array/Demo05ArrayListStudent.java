package src.com.wzxdm.demo04Array;

import java.util.ArrayList;

public class Demo05ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公", 20);
        Student two = new Student("二", 21);
        Student three = new Student("san", 31);
        Student four = new Student("si", 41);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getAge());


        }

    }
}
