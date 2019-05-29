public class Demo25ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 95, 75, 42, 3574, 146521, 5421, 42117, 4845};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
