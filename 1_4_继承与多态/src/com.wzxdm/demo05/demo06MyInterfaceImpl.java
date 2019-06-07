package src.com.wzxdm.demo05;

public class demo06MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("A接口中的覆盖重写");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了");
    }

    @Override
    public void methodB() {
        System.out.println("A接口中的覆盖重写");
    }
}
