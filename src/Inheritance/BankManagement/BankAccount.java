package Inheritance.BankManagement;

public class BankAccount {

    String accountHolderName;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: ₹" + amount);
        System.out.println("Current balance: ₹" + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdraw: ₹" + amount);
            System.out.println("Current balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
