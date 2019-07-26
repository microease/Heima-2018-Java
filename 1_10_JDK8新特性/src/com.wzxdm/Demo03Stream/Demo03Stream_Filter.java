package src.com.wzxdm.Demo03Stream;

import java.util.stream.Stream;

public class Demo03Stream_Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //对Stream流中的元素进行过滤，只要姓张的人
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        //遍历2
        stream2.forEach(name -> System.out.println(name));

    }
}
