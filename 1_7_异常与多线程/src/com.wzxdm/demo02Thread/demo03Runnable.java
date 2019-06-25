package src.com.wzxdm.demo02Thread;

public class demo03Runnable {
    public static void main(String[] args) {
        demo02RunableImpl run = new demo02RunableImpl();
        Thread t = new Thread(run);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}
