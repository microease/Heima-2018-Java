package src.com.wzxdm.demo04Set;

import src.com.wzxdm.demo01.Person;

public class demo02HashCode {
    public static void main(String[] args) {
        Person p = new Person();
        int i = p.hashCode();
        System.out.println(i);
        Person p1 = new Person();
        int i1 = p1.hashCode();
        System.out.println(i1);
        String abc = new String("abc");
        String def = new String("def");

        System.out.println(abc.hashCode());
        System.out.println(def.hashCode());

    }
}
