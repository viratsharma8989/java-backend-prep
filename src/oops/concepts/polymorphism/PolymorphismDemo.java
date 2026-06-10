package oops.concepts.polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
        dog.wagTail();
    }
}
