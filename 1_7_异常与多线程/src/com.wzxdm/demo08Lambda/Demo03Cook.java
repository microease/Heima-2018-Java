package src.com.wzxdm.demo08Lambda;

public class Demo03Cook {
    public static void main(String[] args) {
        //匿名内部类
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        //lambda
        invokeCook(()->{
            System.out.println("吃饭了");

        });

    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
