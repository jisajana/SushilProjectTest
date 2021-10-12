package Day10;

import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Account> accountArrayList = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            Account account = new Account();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter account number: ");
            int accNumber = scanner.nextInt();
            account.setAccountNumber(accNumber);

            System.out.println("Enter account name: ");
            scanner.nextLine();
            String accName = scanner.nextLine();
            account.setName(accName);

            System.out.println("Enter account balance: ");
            double accBalance = scanner.nextDouble();
            account.setBalance(accBalance);

            System.out.println("Enter date of Account opened: ");
            scanner.nextLine();
            String accOpenedDate = scanner.nextLine();
            account.setAccountOpenedDate(accOpenedDate);

            accountArrayList.add(account);
        }

        for (int i = 0; i < accountArrayList.size(); i++){
            Account account = accountArrayList.get(i);
            System.out.println(account.toString());
        }


        //Writing a file with the bank account details

            try {
                FileWriter  fw = new FileWriter("bank.txt");

                for (Account account: accountArrayList ){ //enhanced for
                    //Account account = accountArrayList.get(i);
                    fw.write(account.toString() + "\n");
                }
                fw.close();
                System.out.println("The data have been successfully written on bank.txt.");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        try
        {
            File file=new File("bank.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while((line=br.readLine())!=null)
            {
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("Contents of File: ");
            System.out.println(sb.toString());   //returns a string that textually represents the object
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        List<Account> accountsFromFile =new ArrayList<>();

        for (int i = 1; i<accountArrayList.size(); i++){
            Account account = accountArrayList.get(i);
            String line = account.toString();
            String[] data = line.split(";");

            Account accountFile = new Account();

            accountFile.setName(data[1]);
            accountFile.setAccountNumber(Integer.parseInt(data[0]));
            accountFile.setBalance(Double.parseDouble(data[2]));
            accountFile.setAccountOpenedDate(data[3]);

            accountsFromFile.add(accountFile);
            System.out.println(accountsFromFile);

        }
    }
}







//https://www.javatpoint.com/how-to-read-file-line-by-line-in-java
