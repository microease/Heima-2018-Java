package src.com.wzxdm.Demo01FileClass;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        show01();

    }
    private static void show01(){
        File f1 = new File("C:\\Users\\microease\\OneDrive - Santa Barbara City College\\2018黑马Java\\1.基础班\\1-8 File类与IO流\\a.txt");
        System.out.println(f1);
        File f2 = new File("C:\\Users\\microease\\OneDrive - Santa Barbara City College\\2018黑马Java\\1.基础班\\1-8 File类与IO流\\");
        System.out.println(f2);
        File f3 = new File("./Demo01FileClass");
        System.out.println(f3);



    }
}
