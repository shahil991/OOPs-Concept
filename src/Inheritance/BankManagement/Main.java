package Inheritance.BankManagement;

public class Main {
    public static void main(String[] args) {

        // Savings Account
        SavingsAccount savings = new SavingsAccount(
                "Shahil",
                101,
                10000,
                5
        );

        savings.displayAccountDetails();
        savings.deposit(2000);
        savings.withdraw(3000);
        savings.calculateInterest();
        System.out.println();

        // Current Account
        CurrentAccount current = new CurrentAccount(
                "Rahil",
                102,
                5000,
                10000
        );
        current.displayAccountDetails();
        current.deposit(2000);
        current.withdraw(1200);
        current.displayOverdraftLimit();
    }
}
