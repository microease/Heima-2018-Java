package src.com.wzxdm.demo02Thread;

public class demo02RunableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}
