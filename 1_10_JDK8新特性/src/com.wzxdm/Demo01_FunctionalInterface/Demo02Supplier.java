package src.com.wzxdm.Demo01_FunctionalInterface;

import java.util.function.Supplier;

public class Demo02Supplier {
    //定义一个方法，方法的参数传递Supplier<T>接口，泛型执行String，get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递lambda表达式
        String s = getString(()->{
            //生产一个字符串并返回
            return "香港";
        });
        System.out.println(s);
    }
}
