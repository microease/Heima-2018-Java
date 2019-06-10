package src.com.wzxdm.demo04;

public class demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        StringBuilder stringBuilder1 = new StringBuilder("abc").append("def").append("g");
        System.out.println(stringBuilder1.toString());
    }
}
