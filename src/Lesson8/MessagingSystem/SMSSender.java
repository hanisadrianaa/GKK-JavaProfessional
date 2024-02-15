package Lesson8.MessagingSystem;

public class SMSSender implements MessageSender {

    private String phoneNumber;

    public SMSSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
