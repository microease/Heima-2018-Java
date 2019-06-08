package src.com.wzxdm.demo08;

public class demo01Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
//        Mouse mouse = new Mouse();
        //向上转型
        USB usbMouse = new Mouse();

        computer.useDevice(usbMouse);
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);
        computer.powerOff();
    }
}
