package src.com.wzxdm.demo07Map;

import java.util.HashMap;
import java.util.Scanner;

public class demo06SumStringTimes {
    //计算一个字符串中每个字符出现的次数；
    public static void main(String[] args) {
        //使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入的字符串：");
        String str = sc.next();
        //创建Map集合
        HashMap<Character, Integer> map = new HashMap<>();
        //遍历map集合
        for (Character c : str.toCharArray()) {
            //判断字符是否存在
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        //输出结果
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "+" + value);
        }

    }
}
