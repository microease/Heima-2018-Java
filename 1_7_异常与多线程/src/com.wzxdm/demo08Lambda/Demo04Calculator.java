package src.com.wzxdm.demo08Lambda;

public class Demo04Calculator {
    public static void main(String[] args) {
        //匿名内部类
        invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        //lambda
        invokeCalc(120, 130, (int a, int b) -> {
            return a + b;
        });
    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
