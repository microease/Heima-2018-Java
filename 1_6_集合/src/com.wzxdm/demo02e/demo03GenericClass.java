package src.com.wzxdm.demo02e;

public class demo03GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj);
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);


    }
}
