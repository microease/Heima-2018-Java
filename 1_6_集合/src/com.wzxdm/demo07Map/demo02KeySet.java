package src.com.wzxdm.demo07Map;

import src.com.wzxdm.demo08.Keyboard;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo02KeySet {
    //Map集合的第一种遍历方式：键找值
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=======");
        for(String key:map.keySet()){
            System.out.println(key+  map.get(key));
        }


    }
}
