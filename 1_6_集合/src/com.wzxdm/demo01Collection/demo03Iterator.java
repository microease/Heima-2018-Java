package src.com.wzxdm.demo01Collection;

import java.util.ArrayList;

public class demo03Iterator {
    public static void main(String[] args) {
        demo01();
    }
    public static void demo01(){
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("+++++++++++++++++++");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("+++++++++++++++++++");
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s:list){
            System.out.println(s);
        }
    }
}
