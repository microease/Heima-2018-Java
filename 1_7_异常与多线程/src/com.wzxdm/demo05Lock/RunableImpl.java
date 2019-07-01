package src.com.wzxdm.demo05Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunableImpl implements Runnable {
    private static int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            l.lock();
            if (ticket > 0) {
                try{
                    Thread.sleep(10);
                    //票存在 ticket--;
                    System.out.println(Thread.currentThread().getName() + ">>正在卖第" + ticket + "张票");
                    ticket--;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }

            }
        }
    }

}
