package Day28.Question1;


public class MarksRunner {

    public static void main(String[] args) {
        A a = new A(86, 82, 94);
        B b = new B(65, 70, 95, 82);

        System.out.println("Percentage of A: " + a.getPercentage());
        System.out.println("Percentage of B: " + b.getPercentage());


    }
}
