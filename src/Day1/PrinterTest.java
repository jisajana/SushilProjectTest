/*2. Create a class Printer that has following methods:
a. print(String message): print the parameter’s value
b. runner(): Call the print() method to print these message separately - your
name, hobby and favorite movie.
(You have to call print() method thrice with the parameter)
c. Create a main method and then call runner() method*/
/*
Create a class Printer that has following methods:
        a.print(String message): print the parameter’s value
        b.runner(): Call the print() method to print these message separately-your name, hobby and favorite movie.(You have to call print()method thrice with the parameter)
        c.Create a main method and then call runner() method

 */

package Day1;

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.runner();

    }
}
class Printer {
    void print(String message) {
        String parameter = message;
        System.out.println("Print parameter: " +parameter);
    }

    void runner() {
        Printer p1 = new Printer();
        Printer p2 = new Printer();
        Printer p3 = new Printer();
        p1.print("Sajana");
        p2.print("watching movie");
        p3.print("kuch kuch hota hai");

    }
}

/*

public class Printer {

    public void print(String message) {
        System.out.println(message);
    }

    public void runner() {
        System.out.println("Your name");
        System.out.println("Your hobby");
        System.out.println("Your favorite movie");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.runner();
    }
}
*/
