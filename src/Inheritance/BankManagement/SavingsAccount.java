package Inheritance.BankManagement;

    public class SavingsAccount extends BankAccount {

        double interestRate;

        // Constructor
        SavingsAccount(String accountHolderName, int accountNumber, double balance, double interestRate) {
            super(accountHolderName, accountNumber, balance);
            this.interestRate = interestRate;
        }

        // Calculate interest
        void calculateInterest() {
            double interest = balance * interestRate / 100;

            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Interest: ₹" + interest);
        }

        // Method overriding
        @Override
        void withdraw(double amount) {

            if(balance - amount >= 1000) {
                balance = balance - amount;

                System.out.println("Amount withdraw: ₹" + amount);
                System.out.println("Current balance: ₹" + balance);
            } else {
                System.out.println("Withdrawal failed!");
                System.out.println("Minimum balance of ₹1000 must be maintained.");
            }
        }

    }
