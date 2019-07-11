package src.com.wzxdm.Demo04OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo07InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\c.txt");
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
