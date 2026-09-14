package Inheritance.BankManagement;

public class CurrentAccount extends BankAccount {

    double overdraftLimit;

    // Constructor
    CurrentAccount(String accountHolderName, int accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    void withdraw(double amount) {
        if(amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Amount withdraw: ₹" + amount);
            System.out.println("Current balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal failed!");
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Display overdraft limit
    void displayOverdraftLimit() {
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}
