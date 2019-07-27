package src.com.wzxdm.Demo04_MethodReference;

public class Demo03StaticMethodReference {
    public static int method(int number,Calcable c){
         return c.calAbs(number);
    }

    public static void main(String[] args) {
        int number = method(-10,(n)->{
            return  Math.abs(n);
        });
        System.out.println(number);
        int number1 = method(-10,Math::abs);
        System.out.println(number1);
    }
}
