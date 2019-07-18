package src.com.wzxdm.Demo08ReverseStream;

import java.io.*;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();

    }
    //    使用OutputStream写gbk文件
    public static void write_gbk() throws IOException {
        //1 创建OutputStreamWrite对象，构造方法中传递字节输出流和指定编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo08ReverseStream\\gbk.txt"),"gbk");
        //2 使用OutputStreamWrite中的方法write，把字符转换成字节存储缓冲区中
        osw.write("你好，Java");
        //3 使用OutputStreamWrite中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4 释放资源
        osw.close();
    }
//    使用OutputStream写utf8文件
    public static void  write_utf_8() throws IOException {
        //1 创建OutputStreamWrite对象，构造方法中传递字节输出流和指定编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo08ReverseStream\\utf_8.txt"),"utf-8");
        //2 使用OutputStreamWrite中的方法write，把字符转换成字节存储缓冲区中
        osw.write("你好，Java");
        //3 使用OutputStreamWrite中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4 释放资源
        osw.close();

    }
}
