package src.com.wzxdm.demo03ThreadSafe;

import java.security.KeyStore;

public class RunableImpl implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                //票存在 ticket--;
                System.out.println(Thread.currentThread().getName() + ">>正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
