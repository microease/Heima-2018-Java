package src.com.wzxdm.demo07Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);
        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("d","d");
        System.out.println(linked);


    }
}
