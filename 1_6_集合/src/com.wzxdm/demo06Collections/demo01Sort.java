package src.com.wzxdm.demo06Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo01Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);
        list01.add(4);
        list01.add(5);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list01);

    }
}
