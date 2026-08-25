package OOPS;

public class Main2 {
    String lang;

   //contsructor overloading
    Main2(){
        lang="Java";
    }
    Main2(String language){
        lang=language;
    }

    public void getName() {
        System.out.println("language is " + lang );
    }
    //either revoke  the cosntructor here or create a separate class to call 
    public static void main(String[] args) {
        Main2 obj=new Main2();
        obj.getName();
    }
}
