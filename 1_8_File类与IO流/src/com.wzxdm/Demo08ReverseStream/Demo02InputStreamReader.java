package src.com.wzxdm.Demo08ReverseStream;

import java.io.*;

public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_gbk();
    }
    public static void read_gbk() throws IOException {
        //1 创建InputStreamReader对象，构造方法中传递字节输入流和指定编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo08ReverseStream\\gbk.txt"),"gbk");
        //2 使用InputStreamReader对象中的read方法读取文件
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        //3 释放资源
        isr.close();
    }
    public static void read_utf_8() throws IOException {
        //1 创建InputStreamReader对象，构造方法中传递字节输入流和指定编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo08ReverseStream\\utf_8.txt"));
        //2 使用InputStreamReader对象中的read方法读取文件
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        //3 释放资源
        isr.close();
    }
}
