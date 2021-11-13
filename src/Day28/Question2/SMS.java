package Day28.Question2;

public class SMS implements Messaging{
    String message;
    String recipient;

    public SMS(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    @Override
    public String getMessage() {
        //String message  = "SMS messaging is easy and convenient way of communication.";
        return message;
    }

    @Override
    public void print() {
        System.out.println(getMessage());
        System.out.println(getRecipient());

    }

    @Override
    public String getRecipient() {
        //String recipient  = "Sajana";
        return recipient;
    }
}
