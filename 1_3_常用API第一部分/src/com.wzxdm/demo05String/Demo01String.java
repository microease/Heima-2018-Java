package src.com.wzxdm.demo05String;

public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println(str1);
        //根据字符数组创建字符串
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println(str2);
        //根据字节数组创建字符串
        byte[] byteArray = {1, 2, 32, 34, 5};
        String str3 = new String(byteArray);
        System.out.println(str3);
        //直接创建
        String str4 = "hello word";
        System.out.println(str4);
    }


}
