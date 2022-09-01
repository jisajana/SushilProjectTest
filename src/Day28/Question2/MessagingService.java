package Day28.Question2;

import java.util.Scanner;

public class MessagingService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Email message: ");
        String emailMessage = scanner.nextLine();

        System.out.println("Enter the name of Email recipient: ");
        String emailRecipient = scanner.nextLine();

        Email email  = new Email(emailMessage,emailRecipient );
        System.out.println("Email  class calling print() method..........");
        email.print();

        System.out.println("Enter the SMS message: ");
        String SMSmessage = scanner.nextLine();

        System.out.println("Enter the name of SMS recipient: ");
        String SMSrecipient = scanner.nextLine();

        SMS sms = new SMS(SMSmessage,SMSrecipient);
        System.out.println("SMS class calling print() method...........");
        sms.print();








    }
}
