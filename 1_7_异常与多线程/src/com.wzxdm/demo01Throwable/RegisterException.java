package src.com.wzxdm.demo01Throwable;

public class RegisterException extends Exception{
    public RegisterException(){
        //空参数构造方法
        super();
    }
    public RegisterException(String message){
        super(message);
    }
}
