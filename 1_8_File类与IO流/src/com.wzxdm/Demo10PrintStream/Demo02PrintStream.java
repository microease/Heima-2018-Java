package src.com.wzxdm.Demo10PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        PrintStream ps = new PrintStream("D:\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo10PrintStream\\print1.txt");
        System.setOut(ps);
        System.out.println("我是在打印流的目的地输出");
        ps.close();
    }
}
