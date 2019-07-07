package src.com.wzxdm.Demo02Recursion;

public class Demo02RecursionSum {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);
    }

    private static int sum(int n) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);

    }
}
