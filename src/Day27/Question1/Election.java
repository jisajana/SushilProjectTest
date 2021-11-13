package Day27.Question1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Election {
    public static void main(String[] args) throws Exception {
        String more="Yes";

        while (more.equalsIgnoreCase("YES")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter name:");
            String userName = scanner.nextLine();

            System.out.println("Please enter age:");
            int userAge = scanner.nextInt();

            //ElectionUtils.vote(userName, userAge);

            try {
                ElectionUtils.vote(userName, userAge);
            } catch (NullPointerException e) {
                System.out.println("Name or age can not be null");
            } catch (Exception e) {
                System.out.println("Age can not be less than 18");
            }

            System.out.println("Please enter total votes:");
            int totalVote = scanner.nextInt();

            try {
                ElectionUtils.checkTotalVotes(totalVote);
            } catch (Exception e) {
                System.out.println("Total votes should be between 0 and 20000");
            }

            System.out.println("Do you want to continue. Enter 'Yes' to continue 'No' to exit: ");
            more= scanner.next();
        }

    }

}
