package src.com.wzxdm.Demo05Reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo04OutputStream\\c.txt");
        int len  = 0;
        while ((len=fr.read())!=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
