package src.com.wzxdm.demo08Lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        }).start();
        //lambda表达式
        new Thread(() ->{
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
        }).start();
    }
}
