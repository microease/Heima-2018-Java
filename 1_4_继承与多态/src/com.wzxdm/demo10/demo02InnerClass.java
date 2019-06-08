package src.com.wzxdm.demo10;

public class demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
