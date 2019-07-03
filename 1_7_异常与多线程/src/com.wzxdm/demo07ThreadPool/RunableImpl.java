package src.com.wzxdm.demo07ThreadPool;

public class RunableImpl implements Runnable{
    @Override
    public void run() {
        //创建一个类，实现runable接口，设置run方法，执行线程任务
        System.out.println(Thread.currentThread().getName());
    }
}
