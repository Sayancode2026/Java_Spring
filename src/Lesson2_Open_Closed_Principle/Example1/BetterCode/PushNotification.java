package Lesson2_Open_Closed_Principle.Example1.BetterCode;

public class PushNotification implements  Notification {
    //adding the push notification has no impact on NotificationSender logic
    @Override
    public void send() {

        System.out.println(" Sending push Notification!!!!");
    }
}
