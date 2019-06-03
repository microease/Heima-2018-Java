package src.com.wzxdm.demo05String;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "Hello World Hello Java Hello Microease";
        String[] array1 = str1.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
