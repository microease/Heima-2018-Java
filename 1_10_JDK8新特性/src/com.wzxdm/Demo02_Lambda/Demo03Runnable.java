package src.com.wzxdm.Demo02_Lambda;

public class Demo03Runnable {
    //定义一个startThread，方法的参数使用函数式接口Runnable
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法，方法的参数是一个接口，那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+">"+"启动了");
            }
        });
        //调用startThread方法，方法的参数是一个函数式接口，所以可以传递lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+">"+"启动了");
        });
    }
}
