package src.com.wzxdm.Demo02_Lambda;

public class Demo02Lambda {
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder mb){
        if (level ==1){
            System.out.println(mb.builderMessage());
        }
    }
    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        //调用showlog方法
        showLog(2,()->{
            return msg1+msg2;
        });
    }
}
