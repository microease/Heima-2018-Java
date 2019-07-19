package src.com.wzxdm.Demo10PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello,World");
        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("D:\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo10PrintStream\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.println("hello,world");
        ps.println(97);

        ps.close();

    }
}
