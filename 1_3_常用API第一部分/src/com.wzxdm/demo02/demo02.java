package src.com.wzxdm.demo02;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
//        methodParam(new Scanner(System.in));
//        methodParam();
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
