package src.com.wzxdm.Demo04OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\path.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\path+java.jpg");
        int len = 0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = fis.read())!=-1){
//            fos.write(bytes,0,len);
//        }
//        fos.close();
//        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时："+(e-s)+"毫秒");

    }
}
