package Day25.Question1;

class AreaUtils{

    public static void calculate(float x){
        float areaOfSquare = x * x;
        System.out.println("Area of Square: " + areaOfSquare + " square unit");
    }

    public static void calculate(float x, float y){
        float areaOfRectangle = x * y;
        System.out.println("Area of Rectangle: " + areaOfRectangle +" square unit");
    }

    public static void calculate(double x){
        double areaOfCircle = 3.14 * x * x;
        System.out.println("Area of Circle: " + areaOfCircle + " square unit");
    }

}
