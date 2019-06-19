package src.com.wzxdm.demo01Throwable;

import java.util.Objects;

public class demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
//        //对传递过来的参数进行合法性判断，判断是否为空
//        if(obj==null){
//            throw new NullPointerException("传递过来的值是Null");
        Objects.requireNonNull(obj,"传递过来的值是Null");
        }

}
