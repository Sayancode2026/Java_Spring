package OOPS;

public class AccessModifiers {
    private String name;//getter and setter give the accessibility to change the value inside the private variable name


    //getter
    public String getName(){
        return this.name;
    }


    //setter
    public void setName(String name){
        this.name=name;
    }
}
