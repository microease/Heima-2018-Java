package src.com.wzxdm.Demo07Buffered;

import java.io.*;
import java.util.HashMap;

public class Demo06Test {
    public static void main(String[] args) throws IOException {
        //1 创建一个hashmap集合，可以存储每行文本的序号。
        HashMap<String,String> map = new HashMap<>();
        //2 创建字符缓冲输入流对象，构造方法中传递字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\chu.txt"));
        //3 创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo07Buffered\\chux.txt"));
        // 4 使用字符缓冲输入流中的方法readLine，逐行读取文本
        String line;
        while ((line = br.readLine())!=null){
            //5 对读取好的文本进行切割，获取行中的序号和文本内容
            String[] arr = line.split("\\.");
            //6把切割好的文本和内容存储到HashMap集合中
            map.put(arr[0],arr[1]);
        }

        //7遍历map集合，获取m每一组j键值对
        for (String key :map.keySet()){
            String value = map.get(key);
            //8 把每一个键值对拼接成一个文本行
            line = key+"."+value;
            //9 拼接好的文本使用字符缓冲输出流写入到文件
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
