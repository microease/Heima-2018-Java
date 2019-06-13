package src.com.wzxdm.demo02e;

public class demo05GenericInerface {
    public static void main(String[] args) {
        demo04GenericInterfaceImp1 gi1 = new demo04GenericInterfaceImp1();
        gi1.method("字符串");
        demo05GenericInterfaceImp2 gi2 = new demo05GenericInterfaceImp2();
        gi2.method(11);

    }
}
