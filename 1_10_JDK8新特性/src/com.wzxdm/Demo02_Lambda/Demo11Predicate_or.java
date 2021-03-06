package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Predicate;

public class Demo11Predicate_or {
    /*
     * 定义一个方法，方法的参数是传递一个字符串
     * 传递两个Predicate接口
     *   一个用于判断字符串长度是否大于5
     *   一个用于判断字符串中是否包含a
     *   两个条件必须同时满足
     * */
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
//        return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }
    public static void main(String[] args) {
        String s = "abcd";
        boolean b = checkString(s,(String str)->{
            return str.length()>5;
        },(String str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
