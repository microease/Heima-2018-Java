package src.com.wzxdm;

import com.mysql.fabric.xmlrpc.base.Data;

public class User {
    private String name;
    private int age;
    private Data birthday;

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

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }
}
