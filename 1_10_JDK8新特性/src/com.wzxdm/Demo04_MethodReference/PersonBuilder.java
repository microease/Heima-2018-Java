package src.com.wzxdm.Demo04_MethodReference;

@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据传递的姓名，创建Person对象返回
    Person builderPerson(String name);
}
