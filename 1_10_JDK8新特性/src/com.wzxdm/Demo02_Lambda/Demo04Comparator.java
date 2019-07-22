package src.com.wzxdm.Demo02_Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Cpmparator
    public static Comparator<String> getComarator(){
        //方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };

        // 方法的返回值类型是一个函数式接口，所以我们可以返回lambda表达式
//        return (String o1, String o2)->{
//            return o2.length()-o1.length();
//        };

        //优化lambda表达式
        return (o1, o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        //创建字符串数组
        String[] arr = {"aaa","b","cccccc","ddddddddddddddddd"};
        //输出排序前的数组
        System.out.println(Arrays.toString(arr));
        //调用Arrays中的sort方法对数组进行排序
        Arrays.sort(arr,getComarator());
        System.out.println(Arrays.toString(arr));

    }
}
