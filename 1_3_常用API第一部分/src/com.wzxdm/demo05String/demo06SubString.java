package src.com.wzxdm.demo05String;

public class demo06SubString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = str1.substring(6);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("==============");
        String str3 = str1.substring(6,11);
        System.out.println(str3);
    }
}
