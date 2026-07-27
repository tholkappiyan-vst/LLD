package solid.dependencyinversion;

public class SmsNotification implements Notification {

    @Override
    public void send() {
       System.out.println("SMS is send");
    }
    
}
