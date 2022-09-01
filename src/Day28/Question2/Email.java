package Day28.Question2;

import java.util.Scanner;

public class Email implements Messaging{
    String message;
    String recipient;

    public Email(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    @Override
    public String getMessage() {
        /*String message = "Email should be encrypted for secure transmission.";*/
        return message;
    }

    @Override
    public void print() {
        System.out.println(getMessage());
        System.out.println(getRecipient());

    }

    @Override
    public String getRecipient() {
        return recipient;
    }
}
