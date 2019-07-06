package src.com.wzxdm.Demo01FileClass;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show01();
    }
    private static void show01(){
        File f1 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass");
        System.out.println(f1.exists());
        File f2 = new File("C:\\Users\\microease\\Document");
        System.out.println(f2.exists());
        File f3 = new File("a.txt");
        System.out.println(f3.exists());



    }
}
