package Day12;

public class DistanceCalculation {
    public static void main(String[] args) {
        DistanceCalculation distanceCalculation = new DistanceCalculation();
        System.out.println("The distance between (2,1) and (6,8) is " +
                distanceCalculation.distanceCalculate(2, 6, 1, 8));

    }

    public double distanceCalculate(int x1, int x2, int y1, int y2) {
        double distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return distance;
    }
}


//Math.sqrt(9)
//Math.pow(3,2)