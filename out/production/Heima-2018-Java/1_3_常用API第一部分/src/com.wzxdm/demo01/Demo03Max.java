package src.com.wzxdm.demo01;

import java.util.Scanner;

public class Demo03Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数字");
        int c = scanner.nextInt();
        int temp;
        temp = a > b ? a : b;
        temp = temp > c ? temp : c;
        System.out.println("最大值是" + temp);


    }
}
