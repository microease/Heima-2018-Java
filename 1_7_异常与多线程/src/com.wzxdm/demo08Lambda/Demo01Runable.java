package src.com.wzxdm.demo08Lambda;

public class Demo01Runable {
    public static void main(String[] args) {
        //创建runable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象,构造方法中传递Runable接口的实现类
        Thread t = new Thread(run);
        t.start();
        //简化代码，使用匿名内部类，实现多线程程序
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        };
        new Thread(r).start();
    }
}
