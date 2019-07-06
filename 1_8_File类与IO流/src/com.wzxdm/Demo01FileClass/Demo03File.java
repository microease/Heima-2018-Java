package src.com.wzxdm.Demo01FileClass;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show04();
    }
    public static void show04(){
        File f1 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\Demo01File.java");
        File f2 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\");
        long l1 = f1.length();
        System.out.println(l1);
        long l2 = f2.length();
        System.out.println(l2);


    }

    public static void show03() {
        File f1 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\a.txt");
        File f2 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\");
        String name1 = f1.getName();
        String name2 = f2.getName();
        System.out.println("name1:"+name1);
        System.out.println("name2:"+name2);
    }

    public static void show02() {
        File f1 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(f1);
        System.out.println("!!!!!!!!!!!!!!!");
        System.out.println(f1.toString());
    }

    public static void show01() {
        File f1 = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo01FileClass\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);
        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }

}
