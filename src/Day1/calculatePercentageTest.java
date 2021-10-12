/*Create a class Calculate
o Create a parameterized method calculcatePercentage(int a, int b, int c, int d, int e)
        § Calculate and return the percentage from the marks
        o Create a main method and call calculcatePercentage(marks....) method with the
        subject’s marks as parameters. (You can take user input using scanner or you can
        pass the static values). Print the result returned by that method.*/
/*
1.WAP to calculate percentage of a student from the 5 subjects(each subject full mark is 100 )
and return the result. Also, print the result in another method.
Hints• Create a class Calculate
o Create a parameterized method calculcatePercentage(int a, int b, int c, int d, int e)
    Calculate and return the percentage from the marks
o Create a main method and call calculcatePercentage (marks....) method with the subject’s marks as parameters. (You can take user input using
scanner or you can pass the static values). Print the result returned by that method.
 */
package Day1;

import java.util.Scanner;

public class calculatePercentageTest {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks in 1st subject: ");
        int marksIn1stSubject = scanner.nextInt();

        System.out.println("Enter the marks in 2nd subject: ");
        int marksIn2ndSubject = scanner.nextInt();

        System.out.println("Enter the marks in 3rd subject: ");
        int marksIn3rdSubject = scanner.nextInt();

        System.out.println("Enter the marks in 4th subject: ");
        int marksIn4thSubject = scanner.nextInt();

        System.out.println("Enter the marks in 5th subject: ");
        int marksIn5thSubject = scanner.nextInt();

        int percentage = calculate.calculatePercentage(marksIn1stSubject,marksIn2ndSubject,marksIn3rdSubject,marksIn4thSubject,marksIn5thSubject);
        System.out.println("The percentage of student' s scores in five subjects is :" + percentage + "%");
    }
}

class Calculate{

    int calculatePercentage(int a,int b,int c,int d,int e){
        int totalMarks = a + b + c + d + e;
        int percentage = totalMarks * 100/500 ;
        return percentage;
    }

}

/*
code by Sushil

public class Calculate {

    public double calculatePercentage(int mark1, int mark2, int mark3, int mark4, int mark5) {
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = (total / 500.0) * 100;
        return percentage;
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        double percentage = calculate.calculatePercentage(10, 20, 30, 40, 50);
        System.out.println("Percentage: " + percentage);
    }
}
 */
