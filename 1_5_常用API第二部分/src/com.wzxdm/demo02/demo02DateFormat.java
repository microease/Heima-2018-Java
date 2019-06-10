package src.com.wzxdm.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(myFmt.format(date));
        demo01();
    }
    public static void demo01() throws ParseException {
        SimpleDateFormat myfmt1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date1 = myfmt1.parse("2021年05月21日 00时00分00秒");
        System.out.println(date1);
    }
}
