package src.com.wzxdm.demo02e;

import java.util.ArrayList;
import java.util.Iterator;

public class demo06Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        printArray(list01);
        printArray(list02);
    }
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
