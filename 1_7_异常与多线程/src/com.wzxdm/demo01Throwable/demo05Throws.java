package src.com.wzxdm.demo01Throwable;

import java.io.FileNotFoundException;

public class demo05Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("c:\\a.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件目录不是c:\\a.txt");
        }
    }
}
