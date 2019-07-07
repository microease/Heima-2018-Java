package src.com.wzxdm.Demo01FileClass;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
        show02();
    }
    private static void show02(){
        File file = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
    private static void show01(){
        File file = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass");
        String[] arr = file.list();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
