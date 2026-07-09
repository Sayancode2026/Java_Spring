//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String name;

    //No Argument constructor
    Main(){
        System.out.println("Constructor called !!!!");
        name="Sayan Bardhan";
    }

    //Paramitarized Constructor
    Main(String lang){
        name=lang;
        System.out.println(name+ " is a Progamming Language");
    }



    public static void main(String[] args) {
       Main obj=new Main();
       System.out.println("The name is "+obj.name);

       Main obj1=new Main("Ruby");

        }
    }

