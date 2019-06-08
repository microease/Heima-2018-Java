package src.com.wzxdm.demo08;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public void useDevice(USB usb){
        usb.open();
        usb.close();
    }
}
