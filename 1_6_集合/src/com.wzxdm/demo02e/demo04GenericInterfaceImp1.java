package src.com.wzxdm.demo02e;

public class demo04GenericInterfaceImp1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
