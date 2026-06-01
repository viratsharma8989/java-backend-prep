package oops.concepts.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound();
        dog.makeSound();
        //dog.wagTail();

    }
}
