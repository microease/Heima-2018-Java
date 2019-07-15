package src.com.wzxdm.Demo07Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\b.txt"));
        //调用writter来写
        for (int i = 0; i < 10; i++) {
            bw.write("传智播客");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
