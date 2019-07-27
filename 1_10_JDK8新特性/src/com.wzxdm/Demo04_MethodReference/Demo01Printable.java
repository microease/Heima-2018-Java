package src.com.wzxdm.Demo04_MethodReference;

public class Demo01Printable {
    //定义一个方法，参数传递Printable，对字符串进行打印
    public static void printString(Printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });

        printString(System.out::println);
    }
}
