package src.com.wzxdm.Demo02Recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
        a();
    }
    private static void a(){
        System.out.println("a方法");
        a();
    }
}
