package Day4;

public class Programmer {
    public Programmer() {
        System.out.println("Programming language name is Java");
    }

    public void displayNoOfYears(){
        System.out.println("Number of experience year is 2 yrs");
    }

}

class ProgrammerMain{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.displayNoOfYears();
    }

}
