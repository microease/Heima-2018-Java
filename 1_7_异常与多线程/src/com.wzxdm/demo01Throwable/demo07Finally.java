package src.com.wzxdm.demo01Throwable;

import java.io.FileNotFoundException;

public class demo07Finally {
    public static void main(String[] args) {
        try {
            readFile("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("无论是否出现异常，都会执行");
        }
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.endsWith(".txt")) {
            throw new FileNotFoundException("文件的后缀名不对");
        }
    }
}
