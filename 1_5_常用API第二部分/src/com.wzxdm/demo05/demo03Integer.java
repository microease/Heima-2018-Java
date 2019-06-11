package src.com.wzxdm.demo05;

public class demo03Integer {
    public static void main(String[] args) {
        //基本类型-》字符串
        int i1 = 100;
        String s1 = i1+"";
        System.out.println(s1+100);

        String s2 = Integer.toString(100);
        System.out.println(s2+100);

        String s3 = String.valueOf(100);
        System.out.println(s3+100);

        //字符串——》基本类型
        int i2 = Integer.parseInt(s1);
        System.out.println(i2);
    }
}
