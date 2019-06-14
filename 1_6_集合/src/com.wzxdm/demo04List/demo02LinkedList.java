package src.com.wzxdm.demo04List;

import java.util.LinkedList;

public class demo02LinkedList {
    public static void main(String[] args) {
        show01();
    }

    public static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.add("e");
        System.out.println(linked);
        linked.addFirst("www");
        System.out.println(linked);
        linked.addLast("com");
        System.out.println(linked);
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
        linked.clear();
        System.out.println(linked);
        if(linked.isEmpty()){
            System.out.println("11");
        }
    }
}
