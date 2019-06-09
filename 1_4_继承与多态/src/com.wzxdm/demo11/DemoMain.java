package src.com.wzxdm.demo11;

public class DemoMain {
    public static void main(String[] args) {
        MyInterfaceImpl Impl = new MyInterfaceImpl();
        Impl.method();
        MyInterface some =  new MyInterface() {
            @Override
            public void method() {
                System.out.println("测试匿名内部类");
            }
        };
    }
}
