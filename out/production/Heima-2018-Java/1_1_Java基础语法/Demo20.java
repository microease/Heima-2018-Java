public class Demo20 {
    public static void main(String[] args) {
        printStar();
    }

    public static void printStar() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
