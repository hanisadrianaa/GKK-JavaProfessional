package Lesson8.BankAccountInterface;

public interface BankAccount {

    // add given amount to account balance
    void deposit(double amount);

    // substract given amount from account balance
    void withdraw(double amount);

    // return current balance of account
    double getBalance();
}
