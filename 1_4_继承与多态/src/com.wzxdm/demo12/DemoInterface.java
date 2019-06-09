package src.com.wzxdm.demo12;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addNames(list);
        System.out.println(list);
    }
    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        return list;
    }
}
