package src.com.wzxdm.Demo04_MethodReference;

public class Demo05 {
    //数组的构造器引用
    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        int[] arr1 = createArray(10,(len)->{
            return new int[len];
        });
        int[] arr2 = createArray(10,int[]::new);
        System.out.println(arr1.length);
        System.out.println(arr2.length);
    }
}
