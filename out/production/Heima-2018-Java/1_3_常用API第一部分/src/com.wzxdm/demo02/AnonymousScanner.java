package src.com.wzxdm.demo02;

import java.util.Scanner;

public class AnonymousScanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        int num = new Scanner(System.in).nextInt();
        System.out.println(num);
    }
}
