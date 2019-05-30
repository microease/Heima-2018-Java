package src.com.wzxdm;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println("您输入的数字是"+ num);
        System.out.println("请输入字符串");
        String str = sc.next();
        System.out.println("您输入的数字是"+ num);

    }
}


