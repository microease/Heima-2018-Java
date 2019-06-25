package src.com.wzxdm.demo01Throwable;

public class demo11ThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
