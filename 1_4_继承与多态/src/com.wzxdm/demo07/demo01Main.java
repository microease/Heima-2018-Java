package src.com.wzxdm.demo07;

public class demo01Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        Cat cat = (Cat) animal;
        cat.catchMouse();

    }
}
