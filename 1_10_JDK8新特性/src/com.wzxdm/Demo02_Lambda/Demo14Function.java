package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Function;

public class Demo14Function {
    //定义一个方法
    //方法的参数传递一个字符串类型的整数
    //方法的参数传递一个Function接口，泛型使用<String,Integer>
    //使用Function接口中的方法apply，把字符串类型的整数转化成Integer类型的整数
    public static void main(String[] args) {
        String s = "1234";
        change(s,(String str)->{
            return Integer.parseInt(str);
        });
    }
    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }
}
