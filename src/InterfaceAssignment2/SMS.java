package InterfaceAssignment2;

public class SMS implements SMSNotification {
    String pNumber;


    @Override
    public void setPhoneNumber(String pNumber) {
        this.pNumber=pNumber;




    }

    @Override
    public void sendNotification(String message) {

        System.out.println("Send SMS notification to: "+pNumber);
        System.out.println("Message: "+message);

    }
}
