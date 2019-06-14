package src.com.wzxdm.demo04Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用ADD方法
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(1);
        //迭代器遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("+++++++");
        //增强for循环
        for(Integer i :set){
            System.out.println(i);
        }
    }
}
