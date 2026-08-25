package Inheritance;

public class RegularUser extends Users{

    public  RegularUser(String username,String email){
        super(username, email);
    }

    public void browseProducts(){
        System.out.println("Customers are browsing the Products !!!!!");
    }


    @Override
    public void showDashboard(){
        System.out.println("Regular user Personalized Dashboard!!!");
    }

    public static void main(String[] args) {
        RegularUser ru=new RegularUser("Monalisa ","saha.monalisa20@gmail.com");
        ru.login();
        ru.browseProducts();
        ru.showDashboard();
    }
}
