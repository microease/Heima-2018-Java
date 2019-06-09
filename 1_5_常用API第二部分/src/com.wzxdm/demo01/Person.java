package src.com.wzxdm.demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写toString：打印对象的属性


    @Override
    public String toString() {
//        return super.toString();
        return "姓名" + name + "年龄:" + age;
    }

//    @Override
//    public boolean equals(Object obj) {
////        return super.equals(obj);
//        if (obj == null) {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//        if (obj instanceof Person) {
//            Person p = (Person) obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        return false;
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
