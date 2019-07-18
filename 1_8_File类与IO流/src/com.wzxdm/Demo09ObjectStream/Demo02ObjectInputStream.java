package src.com.wzxdm.Demo09ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo09ObjectStream\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Demo09Personal p = (Demo09Personal) o;
        System.out.println(p.getAge()+p.getName());
    }
}
