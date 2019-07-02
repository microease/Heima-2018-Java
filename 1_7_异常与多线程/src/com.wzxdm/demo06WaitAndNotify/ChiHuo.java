package src.com.wzxdm.demo06WaitAndNotify;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        //吃包子
        //使用死循环，让吃货一直吃包子
        while (true){
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //线程被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子");
                //吃货吃完包子，修改包子的状态
                bz.flag = false;
                //唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经吃完了"+bz.pi+bz.xian+"的包子，包子铺开始生产包子了");
                System.out.println("+++++++++++++++++++++++++++");
            }
        }
    }

}
