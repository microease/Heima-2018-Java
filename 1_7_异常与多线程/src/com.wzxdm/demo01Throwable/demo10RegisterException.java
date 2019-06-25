package src.com.wzxdm.demo01Throwable;

import java.util.Scanner;

public class demo10RegisterException {
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String username = sc.next();
        checkUsername(username);
    }
    public static void checkUsername(String username) throws RegisterException {
        for (String name : usernames) {
            if(name.equals(username)){
                throw new RegisterException("该用户名已被注册");
            }
        }
        System.out.println("恭喜您！注册成功！");
    }
}
