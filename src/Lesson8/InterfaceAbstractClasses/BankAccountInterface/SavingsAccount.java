package Lesson8.InterfaceAbstractClasses.BankAccountInterface;

class SavingsAccount implements BankAccount {
    private double balance;
    private double interest;

    public SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount < 0) {
            System.out.println("Insufficient funds in saving account.");
        } else {
            balance -= amount;
        }
    }

    // implements the getBalance method from the BankAccount interface
    // return current balance
    @Override
    public double getBalance() {
        return balance;
    }

    // adds interest to the balance
    public void addInterest() {
        balance += balance * interest / 100;
    }
}
