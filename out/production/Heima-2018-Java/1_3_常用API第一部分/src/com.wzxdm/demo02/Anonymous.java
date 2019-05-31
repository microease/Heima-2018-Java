package src.com.wzxdm.demo02;

public class Anonymous {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.name = "测试";
        personal.showName();
        //匿名对象
        new Personal().name = "测试1";
        new Personal().showName();

    }
}
