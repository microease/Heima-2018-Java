package src.com.wzxdm.Demo02Recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
//        a();
        b(1);
    }

    //构造方法禁止递归
    /**
    public Demo01Recursion(){
        Demo01Recursion();
    }**/
    private static void b(int i) {
        System.out.println(i);
        if (i == 20000) {
            return;//结束方法
        }
        b(++i);

    }

    private static void a() {
        System.out.println("a方法");
        a();
    }
}
