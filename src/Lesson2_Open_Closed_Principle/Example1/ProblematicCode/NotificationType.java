package Lesson2_Open_Closed_Principle.Example1.ProblematicCode;
//In Java, an enum defines a specialized class type. The constants are typically written in uppercase letters.
//the standard syntax used to declare a globally accessible enumeration containing a fixed set of named constants.
public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP;

    public void sendingSMSNotification(){

        System.out.println("Sending sms notification!!!!");
    }

    public void sendingEmailNotification(){

        System.out.println("Sending email notification!!!!");
    }
    public void sendingWHATSAPPNotification(){

        System.out.println("Sending Whatsapp notification!!!!");
    }


}
