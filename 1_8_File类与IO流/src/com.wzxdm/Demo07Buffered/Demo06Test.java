package src.com.wzxdm.Demo07Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Demo06Test {
    public static void main(String[] args) {
        //1 创建一个hashmap集合，可以存储每行文本的序号。
        HashMap<String,String> map = new HashMap<>();
        //2 创建字符缓冲输入流对象，构造方法中传递字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader())
    }
}
