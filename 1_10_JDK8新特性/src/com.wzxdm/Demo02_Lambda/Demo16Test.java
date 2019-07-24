package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Function;

public class Demo16Test {
    //将字符串截取数字年龄部分，得到字符串
    //将上一步字符串转换成int类型的数字
    //将上一步的int数字累加100，得到结果int数字
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        test(str,(String s1)->{
            return s1.split(",")[1];
        },(String s2)->{
            return Integer.parseInt(s2)+100;
        });
    }
    public static void test(String s, Function<String,String>fun1,Function<String,Integer> fun2){
        Integer in = fun1.andThen(fun2).apply(s);
        System.out.println(in);
    }
}
