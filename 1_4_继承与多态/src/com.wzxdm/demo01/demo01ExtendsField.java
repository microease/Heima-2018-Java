package src.com.wzxdm.demo01;

public class demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.num);
        System.out.println(fu.num);
        zi.methodZi();
        zi.methodFu();
        zi.superZi();
    }

}
