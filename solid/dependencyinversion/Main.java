package solid.dependencyinversion;

public class Main {

    public static void main(String[] args){
        
        Notification notification1=new SmsNotification();
        notification1.send();

        Notification notification2=new EmailNotification();
        notification2.send();

        }
    
}
