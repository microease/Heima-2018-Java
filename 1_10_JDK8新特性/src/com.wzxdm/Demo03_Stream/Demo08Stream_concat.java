package src.com.wzxdm.Demo03_Stream;

import java.util.stream.Stream;

public class Demo08Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        String [] arr = {"喜羊羊","懒洋洋","美羊羊","灰太狼","红太狼"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.println(name));
    }
}
