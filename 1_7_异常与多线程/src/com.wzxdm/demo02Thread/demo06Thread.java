package src.com.wzxdm.demo02Thread;

public class demo06Thread {
    //创建Thread类的子类
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        //创建Thread类中的start方法，开启新的线程，执行run方法
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
