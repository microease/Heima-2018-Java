package src.com.wzxdm.Demo02Recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int res = sum(5);
        System.out.println(res);
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n * sum(n - 1);
    }

}
