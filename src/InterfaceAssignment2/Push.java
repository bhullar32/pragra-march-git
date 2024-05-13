package InterfaceAssignment2;

public class Push implements PushNotification{



    @Override
    public void sendNotification(String message) {

        System.out.println(".......Sending push Notification........");
        System.out.println("message: "+message);

    }
}
