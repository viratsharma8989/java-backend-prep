package oops.concepts.interfacedemo;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }
}
