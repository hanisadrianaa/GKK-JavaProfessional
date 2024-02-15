package Lesson8.InterfaceAbstractClasses.BankAccountInterface;


public class TestBankAccount {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 2.5);
        CheckingAccount checking = new CheckingAccount(500, 200);

        savings.deposit(500);
        savings.addInterest();
        System.out.println("Savings balance: " + savings.getBalance());

        checking.withdraw(300);
        checking.deposit(100);
        System.out.println("Checking balance: " + checking.getBalance());

        checking.withdraw(700);
    }
}
