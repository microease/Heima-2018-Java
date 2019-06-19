package src.com.wzxdm.demo01Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo01Exception {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2019-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);

        System.out.println("后续代码");
    }
}
