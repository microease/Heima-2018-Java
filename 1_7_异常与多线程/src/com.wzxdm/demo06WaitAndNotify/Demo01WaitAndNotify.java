package src.com.wzxdm.demo06WaitAndNotify;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建顾客线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行，需要使用同步技术
                while (true) {
                    synchronized (obj) {
                        System.out.println("告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，可以开吃了");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
