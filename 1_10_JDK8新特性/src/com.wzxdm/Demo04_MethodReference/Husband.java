package src.com.wzxdm.Demo04_MethodReference;

public class Husband {
    public void buyHouse(){
        System.out.println("北京二环内买一套四合院");
    }
    public void marry(Richable r){
        r.buy();
    }
    public void soHappy(){
        //调用结婚的方法，方法的参数是Richable，是一个函数式接口，传递lambda表达式
        marry(()->{
            this.buyHouse();
        });
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}

