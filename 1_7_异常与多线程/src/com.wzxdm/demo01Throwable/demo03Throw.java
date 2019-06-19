package src.com.wzxdm.demo01Throwable;

public class demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e  =getElement(arr,10);
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("数组为空，请重试");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }
        int ele = arr[index];
        return ele;
    }
}
