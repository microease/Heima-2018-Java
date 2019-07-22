package src.com.wzxdm.Demo01_FunctionalInterface;

public class Demo01Test {
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口
        show(new MyFunctionalInterfaceImpl());
        //调用show方法，方法的参数是一个接口，所以我们可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写了接口中的抽象方法");
            }
        });
        //调用show方法，方法的参数是一个函数式接口，所以我们可以传递lambda表达式
        show(()->{
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });
        //简化lambda表达式
        show(()->System.out.println("使用lambda表达式重写接口中的抽象方法"));
    }
}
