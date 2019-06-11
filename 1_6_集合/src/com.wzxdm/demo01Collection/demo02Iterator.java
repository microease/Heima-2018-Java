package src.com.wzxdm.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo02Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        Iterator<String> it = coll.iterator();
//        boolean b = it.hasNext();
//        System.out.println(b);
//        System.out.println(it.next());
//        System.out.println(it.next());
//
//        while (it.hasNext()){
//            String e = it.next();
//            System.out.println(e);
//        }




    }
}
