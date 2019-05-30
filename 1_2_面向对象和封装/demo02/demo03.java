package demo02;

public class demo03 {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.Brand);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.Brand = "苹果";
        return one;
    }
}
