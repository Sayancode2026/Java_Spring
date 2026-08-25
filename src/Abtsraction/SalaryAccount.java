package Abtsraction;

public class SalaryAccount extends BankAccount{
    public SalaryAccount(String acNo,String name,double balance){
        super(acNo,name,balance);
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount){

        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
