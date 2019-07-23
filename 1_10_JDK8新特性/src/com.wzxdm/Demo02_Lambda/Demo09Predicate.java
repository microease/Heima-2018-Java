package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Predicate;

public class Demo09Predicate {

    public static void main(String[] args) {
        //定义一个字符串
        String s = "abcde";
        //调用checkString方法对字符串进行校验，参数传递字符串和lambda表达式
        boolean b = checkString(s,(String str)->{
            //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断的结果返回
            return str.length()>5;
        });
        System.out.println(b);
    }
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
