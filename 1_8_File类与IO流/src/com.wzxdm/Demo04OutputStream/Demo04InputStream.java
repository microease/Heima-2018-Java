package src.com.wzxdm.Demo04OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\c.txt");
        int len = fis.read();
        System.out.println(len);
        len = fis.read();
        while (fis.read() !=-1){
            System.out.println(len);
        }
    }
}
