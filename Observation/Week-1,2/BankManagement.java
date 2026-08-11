package observation;

import java.util.Scanner;

class Account {
    private String accountNo;
    private double balance;
    private String accountType;

    Account(String accountNo, double balance, String accountType) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(String no, double balance, double rate) {
        super(no, balance, "Savings");
        interestRate = rate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(String no, double balance, double limit) {
        super(no, balance, "Current");
        overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class BankManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount savings =
            new SavingsAccount("S101", 10000, 5);

        CurrentAccount current =
            new CurrentAccount("C101", 5000, 5000);

        System.out.println("----- SAVINGS ACCOUNT -----");
        savings.display();

        savings.deposit(2000);
        savings.withdraw(1000);
        savings.calculateInterest();

        System.out.println("\n----- CURRENT ACCOUNT -----");
        current.display();

        current.deposit(3000);
        current.withdraw(10000);

        System.out.println("\n----- TRANSFER -----");
        savings.transfer(current, 2000);

        System.out.println("\nFinal Savings Account:");
        savings.display();

        System.out.println("\nFinal Current Account:");
        current.display();

        sc.close();
    }
}
