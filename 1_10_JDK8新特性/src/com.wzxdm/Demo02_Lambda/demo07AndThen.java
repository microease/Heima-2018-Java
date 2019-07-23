package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Consumer;

public class demo07AndThen {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        //调用method方法，传递一个字符串，连个lambda表达式
        method("hello",
                (t)->{
            //消费方式，把字符串转换成大写输出
                    System.out.println(t.toUpperCase());
                },
                (t)->{
            //消费方式，把字符串转换成小写输出
                    System.out.println(t.toLowerCase());
                });
    }
}
