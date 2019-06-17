package src.com.wzxdm.demo01Throwable;

public class demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getElement(arr,0);
        System.out.println(e);
    }
    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }
}
