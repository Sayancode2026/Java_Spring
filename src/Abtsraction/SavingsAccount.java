package Abtsraction;

public class SavingsAccount extends BankAccount{
    private final double MIN_BALANCE = 1000;

    public SavingsAccount(String acNo, String name, double balance) {
        super(acNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {

        if(balance - amount >= MIN_BALANCE){
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Minimum balance should be maintained.");
        }
    }
}
