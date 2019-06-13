package src.com.wzxdm.demo02e;

import java.util.ArrayList;
import java.util.Iterator;

public class demo01e {
    public static void main(String[] args) {
        show01();
    }

    public static void show01() {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
