package src.com.wzxdm.demo05;

public interface MyInterfacePrivate {
    public default void methodDefault(){
        System.out.println("默认方法");
        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }
    public default void methodCommon(){
        System.out.println("AAA");
    }
}
