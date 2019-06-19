package src.com.wzxdm.demo01Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo06TryCatch  {
    public static void main(String[] args) {
        try{
            readFile("d:\\a.txt");
        }catch (IOException e){
            System.out.println("传递的文件后缀不是.txt");
        }
        System.out.println("后续代码");
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.endsWith(".txt")) {
            throw new FileNotFoundException("文件的后缀名不对");
        }
    }
    //测试
}
