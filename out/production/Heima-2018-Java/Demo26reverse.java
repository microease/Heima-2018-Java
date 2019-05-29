public class Demo26reverse {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 5, 6, 4};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        for (int min = 0, max = array1.length - 1; min < max;
        min++, max--){
            int temp = array1[min];
            array1[min] = array1[max];
            array1[max] = temp;
        }
        System.out.println("******************************");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
    }
}
