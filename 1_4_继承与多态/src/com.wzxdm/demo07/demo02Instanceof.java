package src.com.wzxdm.demo07;

public class demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.WatchHouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}
