package Day11;

public class CountingPoints {
    public static void main(String[] args) {
        CountingPoints countingPoints1 = new CountingPoints();
        CountingPoints countingPoints2 = new CountingPoints();
        CountingPoints countingPoints3 = new CountingPoints();

        System.out.println("The total score for first team : " + countingPoints1.calculate(13,12));
        System.out.println("The total score for second team : " + countingPoints2.calculate(17,12));
        System.out.println("The total score for third team : " + countingPoints3.calculate(38,8));
    }

    public int calculate(int firstScore, int secondScore ){
        int firstPoints = 2 * firstScore;
        int secondPoints = 3 * secondScore;
        int totalPoints = firstPoints + secondPoints;
        return totalPoints;
    }
}
