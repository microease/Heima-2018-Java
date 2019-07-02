package src.com.wzxdm.demo04Synchronized;

public class RunableImpl implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        System.out.println("this:"+this);
        while (true){
            payTicketStatic();
        }
    }

    public static synchronized void payTicketStatic() {
        if (ticket > 0) {
            //票存在 ticket--;
            System.out.println(Thread.currentThread().getName() + ">>正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
