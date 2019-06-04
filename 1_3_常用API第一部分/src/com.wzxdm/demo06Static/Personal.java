package src.com.wzxdm.demo06Static;

public class Personal {
    static {
        System.out.println("静态代码块执行！");
    }
    public Personal(){
        System.out.println("构造方法执行！");
    }
}
