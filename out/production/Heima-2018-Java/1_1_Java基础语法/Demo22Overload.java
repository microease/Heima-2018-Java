public class Demo22Overload {
    public static void main(String[] args) {
        myPrint(2222222);
        myPrint(true);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }
    public static void myPrint(boolean num) {
        System.out.println(num);

    }

}
