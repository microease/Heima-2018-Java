package src.com.wzxdm.Demo02Recursion;

import java.io.File;

public class Demo05FindJava {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\microease\\Documents\\Github\\Heima-2018-Java");
        getAllFiles(file);
    }

    public static void getAllFiles(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                //f是文件夹
                getAllFiles(f);
            } else {
//                String s = f.toString();
//                s = s.toLowerCase();
//                boolean b = s.endsWith(".java");
//                if (b) {
//                    System.out.println(f);
//                }
                if (f.getName().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
