package src.com.wzxdm.Demo02_Lambda;

public class Demo01Logger {
    //定义一个根据日志的级别，显示日志信息的方法。
    public static void showLog(int level,String message){
        //对日志等级进行判断
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        //调用showlog方法
        showLog(1,msg1+msg3);
    }
}
