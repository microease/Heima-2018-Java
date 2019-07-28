package src.com.wzxdm.Demo02Reflect;

import java.lang.reflect.Field;

public class Demo01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取person的class对象
        Class personClass = Person.class;
        //获取所有public修饰的成员变量
        Field[] field = personClass.getFields();
        for (Field field1 : field) {
            System.out.println(field1);
        }
        //

        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("+++++++++++++++++++++++++++");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            
        }
        System.out.println("+++++++++++++++++++++++++++");
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);
        Object vaule2 = d.get(p);
        System.out.println(vaule2);


    }
}
