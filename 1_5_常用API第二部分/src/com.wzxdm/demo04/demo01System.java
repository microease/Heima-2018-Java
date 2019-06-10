package src.com.wzxdm.demo04;

import java.util.Arrays;

public class demo01System {
    public static void main(String[] args) {
        demo02();
    }
    public static void demo01(){
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒");
    }
    public static void demo02(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println(Arrays.toString(dest));
        long s = System.currentTimeMillis();
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒");




    }
}
