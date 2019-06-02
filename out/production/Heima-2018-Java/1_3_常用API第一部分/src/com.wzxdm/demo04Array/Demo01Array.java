package src.com.wzxdm.demo04Array;

public class Demo01Array {
    public static void main(String[] args) {
        Personal[] array = new Personal[3];
        Personal one = new Personal("迪丽热巴", 18);
        Personal two = new Personal("古力娜扎", 28);
        Personal three = new Personal("马尔扎哈", 38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[1].getName());
    }
}
