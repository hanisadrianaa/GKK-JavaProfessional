package Lesson8.MessagingSystem;

public class TestMessageSender {
    public static void main(String[] args) {
        String message = "Hello, Hanis!";

        MessageSender emailSender = new EmailSender("hanis@gmail.com");
        emailSender.sendMessage(message);

        MessageSender smsSender = new SMSSender("+60123456789");
        smsSender.sendMessage(message);
    }
}
