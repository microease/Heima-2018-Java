package src.com.wzxdm.Demo02Recursion;

import java.io.File;

public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\microease\\Documents\\Github\\Heima-2018-Java");
        getAllFiles(file);
    }
    public static void getAllFiles(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                //f是文件夹
                getAllFiles(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
