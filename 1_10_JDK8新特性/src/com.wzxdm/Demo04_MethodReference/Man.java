package src.com.wzxdm.Demo04_MethodReference;

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("hello,我是Man");
    }
    public void method(Greetable g){
        g.greet();
    }
    public void show(){
//        method(()->{
//            Human h = new Human();
//            h.sayHello();
//        });

//        method(()->{
//            super.sayHello();
//        });
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
