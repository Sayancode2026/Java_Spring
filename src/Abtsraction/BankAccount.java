package Abtsraction;

abstract class BankAccount {//we cannot create object in abstract class
    protected String accountno;
    protected  String accountholder;
    protected  double balance;

    public BankAccount(String accountno,String accountholder,double balance){
        this.accountno=accountno;
        this.accountholder=accountholder;
        this.balance=balance;
    }

    public  abstract void deposit(double amount);//abstract method don't have body
    public  abstract  void withdraw(double amount);

    public void getBalance() {
        System.out.println("Balance : ₹" + balance);
    }

    public void displayAccount() {
        System.out.println("Account No : " + accountno);
        System.out.println("Holder     : " + accountholder);
        System.out.println("Balance    : ₹" + balance);
    }


}
