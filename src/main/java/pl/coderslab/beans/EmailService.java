package pl.coderslab.beans;

public class EmailService implements MessageService {

    public EmailService() {
    }

    @Override
    public void send() {
        System.out.println("Sending mail");
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
