package src.com.wzxdm.Demo02Recursion;

import src.com.wzxdm.Demo03Filter.FileFilterImpl;

import java.io.File;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\microease\\Documents\\Github\\Heima-2018-Java");
        getAllFiles(file);
    }

    public static void getAllFiles(File dir) {
//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
//            }
//        });
        File[] files = dir.listFiles(pathname->{
            return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");

        });
        for (File f : files) {
            if (f.isDirectory()) {
                //f是文件夹
                getAllFiles(f);
            } else {
//                String s = f.toString();
//                s = s.toLowerCase();
//                boolean b = s.endsWith(".java");
//                if (b) {
//                    System.out.println(f);
//                }
                System.out.println(f);
            }
        }
    }
}
