package src.com.wzxdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class demo09DouDiZhu {
    //发牌有序的斗地主
    public static void main(String[] args) {
        //准备牌
        //创建map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建list集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //存储大王和小王
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);
        //发牌
        //定义四个集合
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                //给底牌发牌
                diPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }
        System.out.println("++++++++++++++++++++++");
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(diPai);
        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        lookPoker("刘德华", poker, player01);
        lookPoker("周润发", poker, player02);
        lookPoker("周星驰", poker, player03);
        lookPoker("底牌", poker, diPai);

    }

    //看牌
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name + ":");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();

    }

}
