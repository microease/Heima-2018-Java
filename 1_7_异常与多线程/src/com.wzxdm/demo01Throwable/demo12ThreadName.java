package src.com.wzxdm.demo01Throwable;

public class demo12ThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();
    }
}
