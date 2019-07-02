package src.com.wzxdm.demo06WaitAndNotify;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        //保证同步时候两个线程只有一个线程在执行
        //让包子铺一直生产包子
        while (true) {
            synchronized (bz) {
                //有包子
                if (bz.flag == true) {
                    try {
                        //
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后，包子铺生产包子
                if (count % 2 == 0) {
                    //生产薄皮包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱";
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                //唤醒吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("包子铺已经生产好了" + bz.pi + bz.xian + "包子" + "吃货可以开始吃了");
            }
        }
    }
}
