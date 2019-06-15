package src.com.wzxdm.demo07Map;

import java.util.HashMap;
import java.util.Map;

public class demo01Map {
    public static void main(String[] args) {
        show02();
    }
    private static void show01(){
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨","范冰冰1");
        String v2 = map.put("李晨","范冰冰1");
        System.out.println(v1);
        System.out.println(v2);
    }
    private static void show02(){
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("赵丽颖",168);
        map2.put("杨颖",165);
        map2.put("林志玲",178);
        System.out.println(map2);
        Integer v1 = map2.remove("林志玲");
        System.out.println(v1);
        System.out.println(map2);

    }
}
