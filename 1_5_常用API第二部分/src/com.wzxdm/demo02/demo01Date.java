package src.com.wzxdm.demo02;

import java.util.Date;

public class demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        Date date2 = new Date(0);
        System.out.println(date2);
    }
}
