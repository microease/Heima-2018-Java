package src.com.wzxdm.Demo02Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        /*
        * 1 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
        * 2 在程序加载读取配置文件
        * 3 使用反射技术来加载类文件进内存
        * 4 创建对象
        * 5 执行方法
        * */
//        Student stu = new Student();
//        stu.sleep();
        //1.1 加载properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //2 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //3 加载该类进内存C
        Class cls  = Class.forName(className);
        //4 创建对象
        Object obj = cls.newInstance();
        //5 获取方法对象
        Method method = cls.getMethod(methodName);
        //6 执行方法
        method.invoke(obj);
    }
}
