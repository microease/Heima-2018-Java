package src.com.wzxdm.demo04Set;

import java.util.HashSet;

public class demo03HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("重地");
        String s4 = new String("通话");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add("abc");
        System.out.println(set);

    }
}
