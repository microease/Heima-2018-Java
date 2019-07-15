package src.com.wzxdm.Demo07Buffered;

import java.io.*;

public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //创建输入流对象 构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\path.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\path+java.jpg"));
        int len = 0;
        while((len = bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
