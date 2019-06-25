package src.com.wzxdm.demo01Throwable;

public class MyThread extends Thread{
    //重写run方法
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
//        super.run();
     //获取线程名称
//        String name = getName();
//        System.out.println(name);
        //第二种方法
        System.out.println(Thread.currentThread().getName());

    }
}
