package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Consumer;

public class Demo06Consumer {
    /* 定义一个方法
    * 方法的参数传递一个字符串的姓名
    * 方法的参数传递Consumer接口，泛型使用String
    * 可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        //调用method方法，传递字符串姓名，方法的另一个参数是Consumer
        method("赵丽颖",(String name)->{
            //对传递的字符串进行消费
//            System.out.println(name);
            //对字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
