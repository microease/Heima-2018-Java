package src.com.wzxdm.Demo04OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\c.txt",true);
        for (int i = 0; i < 9; i++) {
            fos.write("你好\r\n".getBytes());
        }
        fos.close();

    }
}
