package Lesson8.BankAccountInterface;

class CheckingAccount implements BankAccount {

    private double balance; // store current balance
    private double overlimit; // store overdraft limit to check acc

    public CheckingAccount(double balance, double overlimit) {
        this.balance = balance;
        this.overlimit = overlimit;
    }

    // implements the deposit method from the BankAccount interface
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // implements the withdraw method from the BankAccount interface
    @Override
    public void withdraw(double amount) {
        if (balance - amount < -overlimit) {
            System.out.println("Withdrawal exceeds limit.");
        } else {
            balance -= amount;
        }
    }

    // implements the getBalance method from the BankAccount interface
    @Override
    public double getBalance() {
        return balance;
    }
    
}
