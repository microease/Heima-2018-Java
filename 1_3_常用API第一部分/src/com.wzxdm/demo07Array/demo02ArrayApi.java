package src.com.wzxdm.demo07Array;

import java.util.Arrays;

public class demo02ArrayApi {
    //将一个随机字符串所有字符升序排列，并进行倒序打印
    public static void main(String[] args) {
        String line = "safhasfha0usohjwmasbfasmcxjckhasdasd";
        //升序排列
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        String line2 = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            line2+=i;
        }
        System.out.println(line2);

    }
}
