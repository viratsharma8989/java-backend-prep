package oops.concepts.polymorphism;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    void wagTail() {
        System.out.println("Tail Wagging");
    }
}