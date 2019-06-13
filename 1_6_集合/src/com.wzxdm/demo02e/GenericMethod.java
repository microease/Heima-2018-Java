package src.com.wzxdm.demo02e;
//定义含有泛型的方法

public class GenericMethod {
    public<M> void method(M m){
        System.out.println(m);
    }
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
