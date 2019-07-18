package src.com.wzxdm.Demo05Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Write {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo05Reader\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("hello world"+i);
            fw.write("\r\n");
        }
        fw.close();
    }
}
