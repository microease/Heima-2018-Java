package demo02;

public class demo02 {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.price = 8999;
        method(one);
    }

    public static void method(Phone param) {
        System.out.println(param.price);
    }
}
