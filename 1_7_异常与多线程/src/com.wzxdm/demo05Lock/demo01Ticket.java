package src.com.wzxdm.demo05Lock;

public class demo01Ticket {
    //模拟卖票案例
    public static void main(String[] args) {
        //创建rubable接口的实现类对象
        RunableImpl run = new RunableImpl();
        System.out.println("run:"+run);
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
