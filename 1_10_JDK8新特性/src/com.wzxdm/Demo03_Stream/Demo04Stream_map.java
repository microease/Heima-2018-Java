package src.com.wzxdm.Demo03_Stream;

import java.util.stream.Stream;

public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法，把字符串类型的整数，映射为Integer类型的整数
        stream.map((String s)->{return Integer.parseInt(s);}) ;
    }
}
