package src.com.wzxdm.demo06Collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
        Collections.addAll(list,"a", "b", "c", "d", "e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
