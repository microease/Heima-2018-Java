package src.com.wzxdm.demo03;

import java.util.Calendar;

public class demo01Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        //西方的月份是0-11月
        c.set(2012,1,12);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        c.add(Calendar.YEAR,2);
        System.out.println(c.getTime());


    }
}
