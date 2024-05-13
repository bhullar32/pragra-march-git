package InterfaceAssignment2;

public class NotificationMain {

    public static void main(String[] args) {

    Email e = new Email();
    e.settingRecipients("abc@gmail.com");
    e.sendNotification("Email Sent");

    SMS s = new SMS();
    s.setPhoneNumber("3656258112");
    s.sendNotification("SMS sent to Phone Number Provided");

    Push p = new Push();
    p.sendNotification("Push Notification Sent");




    }
}
