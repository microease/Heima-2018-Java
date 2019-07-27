package src.com.wzxdm.Demo04_MethodReference;

public class Demo02ObjectMethodReference {
    //定义一个方法，方法的参数传递printable接口
    public static void printString(Printable p){
        p.print("hello");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUppercaseString(s);
        });
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUppercaseString);
    }
}
