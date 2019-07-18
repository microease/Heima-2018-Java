package src.com.wzxdm.Demo07Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len =0;
        while ((len = bis.read())!=-1){
            System.out.println(len);
        }
        bis.close();

    }
}
