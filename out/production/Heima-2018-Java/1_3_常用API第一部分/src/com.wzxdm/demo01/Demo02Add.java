package src.com.wzxdm.demo01;

import java.util.Scanner;

public class Demo02Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int b = scanner.nextInt();
        int res = a + b;
        System.out.println("两数结果为" + res);


    }
}
