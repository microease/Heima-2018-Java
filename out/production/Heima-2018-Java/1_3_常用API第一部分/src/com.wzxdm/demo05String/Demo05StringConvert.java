package src.com.wzxdm.demo05String;

public class Demo05StringConvert {
    public static void main(String[] args) {
        String str1 = "Hello World";
        char[] chars = str1.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=============");
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=============");
        String str2 = str1.replace("l","m");
        System.out.println(str2);
    }

}
