package src.com.wzxdm.Demo02Reflect;

import java.lang.annotation.Annotation;

@Pro(className = "src.com.wzxdm.Demo02Reflect.Demo4",methodName = "show")
public class Demo04Test {
    public static void main(String[] args) throws Exception{
        //获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //获取上边的注解对象
//        Pro an = reflectTestClass.getAnnotations(Pro.class);
        //调用注解对象中定义的抽象方法，获取返回值
//        String className = an.className();

    }
}
