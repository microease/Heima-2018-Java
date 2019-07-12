package src.com.wzxdm.Demo05Reader;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo05Reader\\a.txt");
        fw.write(97);
        fw.flush();
        fw.close();

    }
}
