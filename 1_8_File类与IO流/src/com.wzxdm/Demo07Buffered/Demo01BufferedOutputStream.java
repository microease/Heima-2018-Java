package src.com.wzxdm.Demo07Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //创建基本的字节输出流，构造方法绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\a.txt");
        // 创建缓冲流对象，构造方法中传递字节输出流对象，提高字节输出流效率。
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //调用write方法来写数据，把数据写入到缓冲区。
        bos.write("把数据写入到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
