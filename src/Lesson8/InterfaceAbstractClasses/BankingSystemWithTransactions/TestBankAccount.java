package Lesson8.InterfaceAbstractClasses.BankingSystemWithTransactions;

public class TestBankAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.01);
        CheckingAccount checkingAccount = new CheckingAccount(500, 100);

        savingsAccount.deposit(500);
        savingsAccount.calculateInterest();
        checkingAccount.deposit(200);
        checkingAccount.withdraw(700);

        System.out.println("Savings account balance: RM " + savingsAccount.getBalance());
        System.out.println("Checking account balance: RM " + checkingAccount.getBalance());

        System.out.println("\nSavings account history...");
        for (String transaction : savingsAccount.getTransactionHistory()) {
            System.out.println(transaction);
        }

        System.out.println("\nChecking account history...");
        for (String transaction : checkingAccount.getTransactionHistory()) {
            System.out.println(transaction);
        }

        savingsAccount.transfer(checkingAccount, 200);

        System.out.println("\nSavings account balance after transfer: RM " + savingsAccount.getBalance());
        System.out.println("Checking account balance after transfer: RM " + checkingAccount.getBalance());
    }
}
