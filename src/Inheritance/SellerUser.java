package Inheritance;

public class SellerUser extends  Users{

    public SellerUser(String username,String email){
        super(username, email);
    }

    public void addProducts(){
        System.out.println("Sellers are adding Products!!!!");
    }


    @Override
    public void showDashboard(){
        System.out.println("Seller user Personalized Dashboard!!!");
    }

    public static void main(String[] args) {
        SellerUser su=new SellerUser("Shreya ","Shreya978@gmail.com");
        su.login();
        su.addProducts();
        su.showDashboard();

    }
}
