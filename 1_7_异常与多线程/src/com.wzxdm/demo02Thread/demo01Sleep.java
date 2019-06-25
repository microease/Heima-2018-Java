package src.com.wzxdm.demo02Thread;

public class demo01Sleep {
    public static void main(String[] args) {
        for (int i = 0; i <=60 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
