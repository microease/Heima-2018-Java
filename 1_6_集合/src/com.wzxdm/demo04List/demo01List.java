package src.com.wzxdm.demo04List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add(3,"huyankai");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(4,"E");
        System.out.println(list);
        //普通的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("+++++++++++++++++++++++");
        //迭代器方式遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("+++++++++++++++++++++++");

        //增强for遍历
        for(String s:list){
            System.out.println(s);
        }
    }
}
