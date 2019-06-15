package src.com.wzxdm.demo05Set;

public class demo05VarArgs {
    public static void main(String[] args) {
        add(1,2,3,4,5);
    }
    public static int add(int...arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }

}
