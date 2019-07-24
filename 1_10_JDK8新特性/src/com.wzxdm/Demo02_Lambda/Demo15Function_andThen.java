package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Function;

//把String类型的123转换成Integer,把转换后的结果加上10
public class Demo15Function_andThen {
    public static void main(String[] args) {
        String s = "120";
        change(s,(String str)->{
            return Integer.parseInt(str) + 10;
        },(Integer i)->{
            return i+"";
        });
    }
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
