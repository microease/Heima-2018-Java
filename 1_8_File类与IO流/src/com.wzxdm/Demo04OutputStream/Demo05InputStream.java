package src.com.wzxdm.Demo04OutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo05InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\c.txt");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println("________________");
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        fis.close();
    }
}
