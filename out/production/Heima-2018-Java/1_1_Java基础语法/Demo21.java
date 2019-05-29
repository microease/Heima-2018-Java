public class Demo21 {
    public static void main(String[] args) {
        sum100();
    }

    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    //比较两个数是否相同
    public static boolean compare(int a, int b) {
        boolean result = (a == b);
        return result;
    }

    //求1到100的累加和
    public static int sum100() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
        return result;
    }

}
