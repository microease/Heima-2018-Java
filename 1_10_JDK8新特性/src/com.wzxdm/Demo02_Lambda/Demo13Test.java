package src.com.wzxdm.Demo02_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Demo13Test {

    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        //定义一个集合
        ArrayList<String> list = new ArrayList<>();
        //遍历数组，获取数组中每一条信息
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                //条件成立，两个条件都满足的话，把字符串放入集合
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //筛选要求，必须名字为四个字，女生
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马儿扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = filter(array,(String s)->{
            //判断是否为女
            return s.split(",")[1].equals("女");
        },(String s)->{
            //获取字符串中的姓名，判断长度是否为四个字符
            return s.split(",")[0].length()==4;
        });
        //遍历集合
        for (String s:list){
            System.out.println(s);
        }
    }

}
