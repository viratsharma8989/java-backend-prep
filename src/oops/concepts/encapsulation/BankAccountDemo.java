package oops.concepts.encapsulation;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Virat", 10000);
        BankAccount user2 = new BankAccount("Abhay", 15000);

        user1.deposit(8000);
        user2.deposit(3000);

        user1.withdraw(4000);
        user2.withdraw(6000);

        System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());
    }
}
