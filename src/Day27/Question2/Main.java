package Day27.Question2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaCourse javaCourse = new JavaCourse(1, "Java Core", "J01");

        EnrollCourse enrollCourse = new EnrollCourse();
        enrollCourse.courseArrayList.add(javaCourse);

        //System.out.println(enrollCourse.courseArrayList);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course id: ");
        int userInputId = scanner.nextInt();

        try{
        enrollCourse.getCourse(userInputId);
        }
        catch(Exception e){
            System.out.println("Course id not found: Enter again");
            userInputId = scanner.nextInt();

        }

        int userChoice = 0;
        String more = "Yes";

        while (more.equalsIgnoreCase("yes")) {
            System.out.println("Choose an option from below");
            System.out.println("Option 1: Assign a Tutor");
            System.out.println("Option 2: Course completed");
            System.out.println("Option 3: Set Duration");
            System.out.println("Option 4: Display");

            userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("Enter tutor name: ");
                try {
                    javaCourse.assignTutor(scanner.next());

                } catch (Exception e) {
                    System.out.println("Tutor Name must be provided. ");
                }
            }

            else if (userChoice == 2) {
                javaCourse.courseCompleted();

            }
            else if (userChoice == 3) {
                System.out.println("Enter course duration: ");
                javaCourse.setDuration(scanner.nextInt());

            }

            else if (userChoice == 4) {
                javaCourse.display();

            }

            System.out.println("Do you want to continue: ");
            more = scanner.next();

        }
    }
}
