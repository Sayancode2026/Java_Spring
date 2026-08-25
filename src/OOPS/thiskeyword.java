package OOPS;

//this keyword used to refer the current object inside a method or constructor
public class thiskeyword {
    int var;

    thiskeyword(int var){
        this.var=var;
    }

    public static void main(String[] args) {
        thiskeyword obj=new thiskeyword(9);
        System.out .println(obj.var);

    }
}
