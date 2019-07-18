package src.com.wzxdm.Demo07Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo05BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\b.txt"));
//        String line = br.readLine();
//        System.out.println(line);
        String line;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
