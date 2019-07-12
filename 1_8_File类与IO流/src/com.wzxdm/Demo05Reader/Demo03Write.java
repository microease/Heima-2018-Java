package src.com.wzxdm.Demo05Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Write {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo05Reader\\f.txt");
        char[] cs = {'a','b','c','d','e'};
        fw.write(cs,1,3);
        fw.write("传智播客");
        fw.close();
    }
}
