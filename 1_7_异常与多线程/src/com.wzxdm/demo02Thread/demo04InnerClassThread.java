package src.com.wzxdm.demo02Thread;

public class demo04InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"microease");
                }
            }
        }.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"huyankai");
                }
            }
        };
        new Thread(r).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"huxiaoyi");
                }
            }
        }).start();
    }
}
