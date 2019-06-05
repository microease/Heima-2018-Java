package src.com.wzxdm.demo04;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        int lefMoney = super.getMoney();//群主当前的余额
        if(totalMoney>lefMoney){
            System.out.println("余额不足");
        }
    }
}
