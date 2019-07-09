package src.com.wzxdm.Demo04OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);
        fos.close();
    }
}
