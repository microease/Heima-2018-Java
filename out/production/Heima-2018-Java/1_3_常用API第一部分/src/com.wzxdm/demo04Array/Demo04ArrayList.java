package src.com.wzxdm.demo04Array;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayList {
    //    题目：生成6个1-33的随机整数，添加到集合，并遍历集合。
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            numList.add(num);
        }
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));

        }


    }
}
