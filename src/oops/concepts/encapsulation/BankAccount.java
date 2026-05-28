package oops.concepts.encapsulation;


public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance =  balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Account credited with Rs."+ amount +" current balance Rs."+ balance);
        }
        else {
            System.out.println("Deposit failed!");
        }
    }

    public void withdraw(double amount) {
        if((amount > 0) && (balance >= amount)){
           balance -= amount;
            System.out.println("Account debited with Rs."+ amount +" current balance Rs."+ balance);
        }
        else {
            System.out.println("Withdrawal failed!");
        }
    }
}
