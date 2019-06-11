package src.com.wzxdm.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

public class demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        boolean b1 = coll.add("张三");
        System.out.println(b1);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);
        coll.remove("田七");
        System.out.println(coll);
        boolean b2 = coll.contains("赵六");
        System.out.println(b2);
        boolean b3 = coll.isEmpty();
        System.out.println(coll);
        System.out.println(b3);
        System.out.println(coll.size());
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        coll.clear();
        System.out.println(coll);

    }
}
