package src.com.wzxdm.demo05String;

public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "sakhdsdbdsmbfdsjfbdskfvds".length();
        System.out.println("字符串长度:" + length);
        String str1 = "hello";
        String str2 = " world!";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        char ch = str3.charAt(1);
        System.out.println(ch);
        System.out.println(str3.indexOf("llo"));


    }
}
