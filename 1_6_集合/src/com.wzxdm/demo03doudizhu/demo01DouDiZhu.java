package src.com.wzxdm.demo03doudizhu;
//综合案例:准备牌，洗牌，发牌，看牌
//

import java.util.ArrayList;
import java.util.Collections;

public class demo01DouDiZhu {
    public static void main(String[] args) {
        //1 准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储花色，一个存储序号；
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        //循环嵌套两个数组
        for (String n : nums) {
            for (String c : color) {
//                System.out.println(c+n);
                poker.add(c + n);
            }
        }
        System.out.println(poker);
        //2 洗牌
        Collections.shuffle(poker);
        //3 发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //遍历poker，获取每一张牌.使用poker集合的索引3%给三个玩家发牌，剩下三张是底牌。发牌的过程中i>=51;
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            //开始发牌
            if (i >= 51) {
                diPai.add(p);
            } else if (i % 3 == 0) {
                player01.add(p);
            } else if (i % 3 == 1) {
                player02.add(p);
            } else if (i % 3 == 2) {
                player03.add(p);
            }
        }
        //看牌
        System.out.println("player01："+player01);
        System.out.println("player02："+player02);
        System.out.println("player03："+player03);
        System.out.println("底牌："+diPai);

    }
}
