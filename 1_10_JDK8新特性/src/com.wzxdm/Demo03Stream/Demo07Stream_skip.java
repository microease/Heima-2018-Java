package src.com.wzxdm.Demo03Stream;

import java.util.stream.Stream;

public class Demo07Stream_skip {
    public static void main(String[] args) {
        String [] arr = {"喜羊羊","懒洋洋","美羊羊","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(3);
        stream1.forEach(name-> System.out.println(name));
    }
}
