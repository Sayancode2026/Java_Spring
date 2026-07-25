package Lesson2_Open_Closed_Principle.Example1.BetterCode;

import Lesson2_Open_Closed_Principle.Example1.ProblematicCode.NotificationType;
import java.util.List;

public class NotificationSender {
    //without modifying the NotificationSender we are able to extend a new notification service
    public void SendNotification(List<Notification>notifications){
       for(Notification notification:notifications){
           notification.send();
       }
    }
}


