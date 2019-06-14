package src.com.wzxdm.demo04Set;

import java.util.HashSet;

//使用HashSet存储自定义元素
public class demo04HashSetSaveStudent {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("小美女",18);
        Student s2 = new Student("小美女",18);
        Student s3 = new Student("小美女",19);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(set);
    }
}
