package src.com.wzxdm.Demo02Reflect;

public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //全类名
        Class cls1 = Class.forName("src.com.wzxdm.Demo02Reflect.Person");
        System.out.println(cls1);
        //类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //对象.getClass
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
    }
}
