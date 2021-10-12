package Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        UpperManager upperManager = new UpperManager();
        LowerManager lowerManager = new LowerManager();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter a name to add to upper manager list: ");
            String name = scanner.nextLine();
            upperManager.add(name);
        }
        System.out.println(upperManager.getEmployees());

        System.out.println("Please enter a name to search in list: ");
        String name1 = scanner.nextLine();
        upperManager.search(name1);


        System.out.println("Please enter a name to remove from list: ");
        String name2 = scanner.nextLine();
        upperManager.remove(name2);
        System.out.println(upperManager.getEmployees());

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter a name to add to lower manager list: ");
            String name = scanner.nextLine();
            lowerManager.add(name);
        }
        System.out.println(lowerManager.getEmployees());

        System.out.println("Please enter a name to search in list: ");
        String name3 = scanner.nextLine();
        lowerManager.search(name3);


        System.out.println("Please enter a name to remove from list: ");
        String name4 = scanner.nextLine();
        lowerManager.remove(name4);
        System.out.println(lowerManager.getEmployees());



    }
}
