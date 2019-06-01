package src.com.wzxdm.demo04Array;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        System.out.println(list);
        list.add("111");
        list.add("s222");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            
        }


    }
}
