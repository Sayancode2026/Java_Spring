package Lesson1_Single_Responsibility_Principle.Example2.ProblematicCode;
//Any issue with this class???
public class Employee {

    private int id;


    public int getid(){

        return this.id;
    }

    public String  fetchBioData(){
        return "Some bio data......";
    }


    public  double  calculateSalary(){

        return 0;
    }

    public  void printPerformanceData(){


        System.out.println("Some performance data");
    }
}
