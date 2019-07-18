package src.com.wzxdm.Demo08ReverseStream;

import java.io.*;

public class Demo03TransDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo08ReverseStream\\gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo08ReverseStream\\gbk_trans_utf8.txt"),"utf-8");
        int len = 0;
        while((len = isr.read())!=-1){
            osw.write((char)len);
        }
        osw.close();
        isr.close();
    }
}
