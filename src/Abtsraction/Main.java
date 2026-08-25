package Abtsraction;

public class Main {
    public static void main(String[] args) {

        BankAccount s = new SavingsAccount("SB101","Sayan",5000);

        BankAccount c = new CurrentAccount("CA201","Rahul",3000);

        BankAccount sal = new SalaryAccount("SA301","Amit",10000);

        s.withdraw(4500);      // Minimum balance rule

        c.withdraw(10000);     // Overdraft allowed

        sal.withdraw(12000);   // Normal withdrawal

        s.getBalance();
        c.getBalance();
        sal.getBalance();
    }
}
