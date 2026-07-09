package Inheritance;

public class Users {
    //Inheritance  allow us to create a new class(subclass) from a existing class(super class)
    private String username;
    private String email;

    public Users(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login() {
        System.out.println(username + "logged in!!!");
    }


    public void showDashboard() {
        System.out.println(username + "'s dashboard");
    }

}