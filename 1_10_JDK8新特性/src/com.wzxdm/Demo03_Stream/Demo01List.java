package src.com.wzxdm.Demo03_Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        //对list集合中的元素进行过滤，只要以张开头的元素，存储到一个新的集合中
        List<String> listA = new ArrayList<>();
        for (String s:list){
            if(s.startsWith("张")){
                listA.add(s);
            }
        }
        System.out.println(listA);
        //对list集合中的元素进行过滤，只要长度为3的人，存储到一个新集合中，
        List<String> listB = new ArrayList<>();
        for(String s :listA){
            if(s.length()==3){
                listB.add(s);
            }
        }
        System.out.println(listB);
    }
}
