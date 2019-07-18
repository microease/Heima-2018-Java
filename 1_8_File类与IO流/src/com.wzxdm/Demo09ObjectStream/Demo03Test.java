package src.com.wzxdm.Demo09ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1 定义一个存储Personal对象的ArrayList集合
        ArrayList<Demo09Personal> list = new ArrayList<>();
        //2 往ArrayList中存储几个Personal对象
        list.add(new Demo09Personal("张三",18));
        list.add(new Demo09Personal("李四",19));
        list.add(new Demo09Personal("王五",20));
        //3 创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo09ObjectStream\\list.txt"));
        //4 使用序列化流中的writeObject方法，对集合进行序列化
        oos.writeObject(list);
        //5 创建一个反序列号对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo09ObjectStream\\list.txt"));
        //6 使用readObject方法读取文件中保存的集合
        Object o = ois.readObject();
        //7 把Object类型的集合转换成ArrayList类型
        ArrayList<Demo09Personal> list2 = (ArrayList<Demo09Personal>) o;
        //8 遍历ArrayList集合
        for(Demo09Personal p:list2){
            System.out.println(p);
        }
        //9 关闭资源
        ois.close();
        oos.close();


    }
}
