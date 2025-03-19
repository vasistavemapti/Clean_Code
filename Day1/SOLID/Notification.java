public interface NotificationService{
void sendNotification(String recipient, String message);
}

class EmailNotification implements NotificationService{
    public void sendNotification(String recipient, String message){
        System.out.println("Sending Email to recipient"+ recipient + ":" + message)

    }
}

class SMSNotification implements NotificationService{
    public void sendNotification(String recipient, String message){
        System.out.println("Sending SMS to recipient" + recipient + ":"+ message)
    }
}

class PushNotifications implements NotificationService{
    public void sendNotification(String recipient, String message){
        System.out.println("Sending Push Notification to recipient" + recipient+ ":"+ message)
    }
}

// Until now this is the base class where SMS, Email and Push Notifications have been implemented. 

// Now in order to implement the newer message types we can directly use the interface to create a new class and implement them

class WhatsappNotification implements NotificationService{
    public void sendNotification(String recipient, String message){
        System.out.println("Sending Whatsapp Notification to recipient" + recipient+ ":"+ message)
    }
}