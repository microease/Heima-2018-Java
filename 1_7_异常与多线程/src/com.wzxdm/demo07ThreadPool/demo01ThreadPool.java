package src.com.wzxdm.demo07ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo01ThreadPool {
    public static void main(String[] args) {
        //1：使用ExecutorService中的newFixedThreadPool生产一个指定数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3:调用ExecutorService中的方法submit，传递线程任务，开启线程，执行run方法
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());


    }
}
