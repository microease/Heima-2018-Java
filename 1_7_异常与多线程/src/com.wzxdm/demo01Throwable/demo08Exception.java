package src.com.wzxdm.demo01Throwable;

import java.util.List;

public class demo08Exception {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("1111");


    }
}
