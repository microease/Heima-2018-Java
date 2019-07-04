package src.com.wzxdm.Demo01FileClass;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符：windows是分号;，linux是冒号:
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符,windows是\,linux是/


    }
}
