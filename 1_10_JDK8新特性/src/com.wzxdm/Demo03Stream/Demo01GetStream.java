package src.com.wzxdm.Demo03Stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo01GetStream {
    public static void main(String[] args) {
        //把集合转换成stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        //set集合
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        //map集合
        Map<String,String> map = new HashMap<>();
        Set<String> keyset = map.keySet();
        Stream<String> stream3 = keyset.stream();
        //获取值，存储到一个Collectionj集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //获取键值对，键与值的映射关系
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();
        //把数组转化为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);


    }
}
