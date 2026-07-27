package solid.dependencyinversion;

public class EmailNotification implements Notification{

    @Override
    public void send() {
       System.out.println("Email is send");
    }
    
}
