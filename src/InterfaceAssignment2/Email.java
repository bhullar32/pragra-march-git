package InterfaceAssignment2;

public class Email implements EmailNotification {

String recipients;



    @Override
    public void settingRecipients(String recipients) {
        this.recipients=recipients;




    }

    @Override
    public void sendNotification(String message) {

        System.out.println("Send email notification to: "+recipients);
        System.out.println("message: "+message);

    }
}