package src.com.wzxdm.Demo02_Lambda;

import java.util.function.Supplier;

public class Demo05Test {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier，泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型的数组，并赋值
        int[] arr = {100,0,-1150,88,99,33,-30};
        //调用getMax方法，方法的参数Supplier是一个函数式接口，所以可以传递lambda表达式
        int maxValue = getMax(()->{
            //获取数组中最大值并返回：定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中元素的最大值
            int max = arr[0];
            for (int i : arr) {
                if(i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
