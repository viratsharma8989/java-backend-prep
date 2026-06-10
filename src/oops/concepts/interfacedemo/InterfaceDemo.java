package oops.concepts.interfacedemo;

public class InterfaceDemo {

    public static void main(String[] args) {

        Flyable flyable = new Bird();
        Flyable fly = new Duck();
        Flyable flyable1 = new Airplane();
        Swimmable swim = new Duck();
        
        flyable1.fly();
        flyable.fly();
        fly.fly();
        swim.swim();
    }
}
