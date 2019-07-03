package src.com.wzxdm.demo08Lambda;
import src.com.wzxdm.demo02Thread.Person;

import java.util.Arrays;
import java.util.Comparator;

public class demo03Arrays {
    public static void main(String[] args) {
        Personal[] arr = {
                new Personal("柳岩", 38),
                new Personal("迪丽热巴", 22),
                new Personal("古力娜扎", 19)
        };
        //对数组中的Personal对象使用Array的sort方法通过年龄进行升序
//        Arrays.sort(arr, new Comparator<Personal>() {
//            @Override
//            public int compare(Personal o1, Personal o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        //使用lambda表达式
        Arrays.sort(arr,(Personal o1, Personal o2)->{
            return o1.getAge() - o2.getAge();
        });
        //遍历数组
        for (Personal p:arr){
            System.out.println(p.getName()+p.getAge());
        }
    }
}
