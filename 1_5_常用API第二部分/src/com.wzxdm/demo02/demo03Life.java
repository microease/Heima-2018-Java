package src.com.wzxdm.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//1995年05月21日 00时00分00秒
public class demo03Life {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式yyyy年MM月dd日");
        String bornDateInput = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //出生日期
        Date bornDate = sdf.parse(bornDateInput);
        Long bornDateTime = bornDate.getTime();
        Date nowDate = new Date();
        Long nowDateTime = nowDate.getTime();
        Long time = nowDateTime-bornDateTime;
        //把毫秒转成天
        System.out.println("你活了"+time/1000/60/60/24+"天,"+time/1000/60/60/24/30+"月,还剩"+(900-time/1000/60/60/24/30)+"月");
    }
}
