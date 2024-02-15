package Lesson8.InterfaceAbstractClasses.BankingSystemWithTransactions;

import java.util.ArrayList;
import java.util.List;

class CheckingAccount implements BankAccount {

    private double balance;
    private double overdraftLimit;
    private List<String> transactions;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactions.add(String.format("Deposit: RM %.2f", amount));
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            transactions.add(String.format("Withdrawal: RM %.2f", amount));
        } else {
            System.out.println("Insufficient funds, exceeding overdraft limit");
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
}
