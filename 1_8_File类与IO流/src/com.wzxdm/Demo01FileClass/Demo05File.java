package src.com.wzxdm.Demo01FileClass;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        show03();
    }
    public static void show03(){
        File f2 = new File("1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\aaa\\bbb");
        System.out.println(f2.delete());
    }
    public static void show02(){
        File f1 = new File("1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\aaa");
        File f2 = new File("1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\aaa\\bbb");
        System.out.println(f1.mkdir());
        System.out.println(f2.mkdir());
    }

    public static void show01() throws IOException {
        File f1 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
        File f2 = new File("1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\2.txt");
        System.out.println(f2.createNewFile());
        File f3 = new File("1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\111");
        System.out.println(f3.createNewFile());

    }
}
