package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Consumer;

public class Demo08Test {
    //定义一个方法
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String message:arr){
            //使用andThen方式连接两个Consumer接口，消费字符串
            con1.andThen(con2).accept(message);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男"};
        //调用printInfo方法，传递一个字符串数据，和两个lambda表达式
        printInfo(arr,(message)->{
        //消费方式：对message进行切割，获取姓名
            String name = message.split(",")[0];
            System.out.println("姓名"+name);
        },(message)->{
            //消费方式，对message进行切割，获取性别
            String sex = message.split(",")[1];
            System.out.println("性别"+sex+"。");
        });
    }
}
