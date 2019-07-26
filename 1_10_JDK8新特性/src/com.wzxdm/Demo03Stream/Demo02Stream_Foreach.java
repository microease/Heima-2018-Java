package src.com.wzxdm.Demo03Stream;

import java.util.stream.Stream;

public class Demo02Stream_Foreach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用Stream流中的方法Foreach对Stream流中的数据进行遍历
        stream.forEach((String name)->{
            System.out.println(name);
        });
    }
}
