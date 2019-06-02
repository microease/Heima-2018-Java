package src.com.wzxdm.demo04Array;

import java.util.ArrayList;
import java.util.Random;

public class Demo06ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList  = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int getNum = bigList.get(i);
            if(getNum%2==0){
                smallList.add(getNum);
            }
        }
        return smallList;
    }

}
