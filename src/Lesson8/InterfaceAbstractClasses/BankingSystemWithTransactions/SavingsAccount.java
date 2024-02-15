package Lesson8.InterfaceAbstractClasses.BankingSystemWithTransactions;

import java.util.ArrayList;
import java.util.List;

class SavingsAccount implements BankAccount {

    private double balance;
    private double interestRate;
    private List<String> transactions;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactions.add(String.format("Deposit: RM %.2f", amount));
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(String.format("Withdrawal: RM %.2f", amount));
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) {
        withdraw(amount);
        toAccount.deposit(amount);
        transactions.add(String.format("Transfer to %s: RM %.2f", toAccount, amount));
    }

    @Override
    public List<String> getTransactionHistory() {
        return transactions;
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        transactions.add(String.format("Interest earned: RM %.2f", interest));
    }
}
