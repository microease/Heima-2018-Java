package src.com.wzxdm.demo07Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo04HashMapSavePerson {
    public static void main(String[] args) {
        show02();

    }
    public static void show01(){
        HashMap<String,Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",20));
        map.put("深圳",new Person("王五",21));
        map.put("北京",new Person("赵六",18));
        Set<String> set = map.keySet();
        for(String key:set){
            Person value = map.get(key);
            System.out.println(key+"+"+value);
        }
    }
    public static void show02(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("主席",70),"中国");
        map.put(new Person("总统",59),"俄罗斯");
        map.put(new Person("女王",20),"毛里求斯");
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for(Map.Entry<Person,String> entry:set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"+"+value);
        }

    }
}
