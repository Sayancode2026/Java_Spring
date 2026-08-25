package Inheritance;

public class AdminUser extends Users {

    public AdminUser(String username,String email){

        super(username,email);
    }

    public void manageProducts(){
        System.out.println("Admin is managing Products!!!!");

    }


    @Override
    public void showDashboard(){
        super.showDashboard();//to access  the functionality of the superclass or parent class
        System.out.println("Admin user Personalized Dashboard!!!");
    }

    public static void main(String[] args) {
        AdminUser au=new AdminUser("Sayan_04 ", "sayanbardhan2022@gmail.com" );
        au.login();
        au.manageProducts();
        au.showDashboard();
    }
}
