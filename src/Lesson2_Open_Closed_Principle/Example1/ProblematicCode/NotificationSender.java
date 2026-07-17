package Lesson2_Open_Closed_Principle.Example1.ProblematicCode;

public class NotificationSender {
    public void SendNotification(List<NotificationType>notificationTypes){
        for(NotificationType type:notificationTypes){
            if(type==NotificationType.SMS){
                type.sendingSMSNotification();
            }else if(type==NotificationType.EMAIL){
                type.sendingEmailNotification();
            }else if(type==NotificationType.WHATSAPP){
                type.sendingWHATSAPPNotification();
            }
        }
    }
}
