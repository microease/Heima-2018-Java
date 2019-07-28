package src.com.wzxdm.Demo02Reflect;

import java.lang.reflect.Constructor;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
    }
}
