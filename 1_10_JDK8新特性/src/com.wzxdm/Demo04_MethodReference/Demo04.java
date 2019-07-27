package src.com.wzxdm.Demo04_MethodReference;

public class Demo04 {
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("张三",(String name)->{
            return new Person(name);
        });
        printName("李四",Person::new);
    }
}
