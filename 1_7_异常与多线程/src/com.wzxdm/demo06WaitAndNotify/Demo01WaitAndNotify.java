package src.com.wzxdm.demo06WaitAndNotify;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("告知老板要的包子的种类和数量");
                }
            }
        };
    }
}
