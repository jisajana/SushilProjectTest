package Day24;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
    CalculateMarks calculateMarks = new CalculateMarks();
    calculateMarks.handleMarks();
    }
}

class CalculateMarks{
    int userInput;
    int sumInAllSubjects  = 0;
    Scanner scanner =new Scanner(System.in);

    public void handleMarks(){
        for (int i = 1; i<6; i++){
            System.out.println("Enter marks in " + i + " subject: ");
            userInput = scanner.nextInt();
            //System.out.println("Marks in " + i + " subject: " + userInput);
            sumInAllSubjects = sumInAllSubjects + userInput;
        }
        System.out.println("Sum of marks in all subjects: " + sumInAllSubjects );

    }
}
