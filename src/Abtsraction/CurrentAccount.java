package Abtsraction;

public class CurrentAccount extends  BankAccount{
    private final double OVERDRAFT_LIMIT = 10000;

    public CurrentAccount(String acNo,String name,double balance){
        super(acNo,name,balance);
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount){

        if(balance + OVERDRAFT_LIMIT >= amount){
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}
