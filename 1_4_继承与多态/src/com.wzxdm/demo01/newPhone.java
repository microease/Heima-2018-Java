package src.com.wzxdm.demo01;

public class newPhone extends Phone {
    public void weiXin() {
        System.out.println("发微信");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");

    }
}
