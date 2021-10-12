package Day8;

import java.util.ArrayList;

public class Runner {
    private ArrayList<Vehicle> vehicleList;

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.vehicleList = new ArrayList();

        Car car1 = new Car("Honda","CRV",4);
        Car car2 =new Car("Toyota", "RAV4",4);

        Bike bike1 = new Bike("Tilt", "Walter White",6449.99,"Anfield");
        Bike bike2 = new Bike ("All Terrain", "R750 FS", 1999.00, "M25 Bikes");


        runner.vehicleList.add(car1);
        runner.vehicleList.add(car2);
        runner.vehicleList.add(bike1);
        runner.vehicleList.add(bike2);
        System.out.println("Vehicle list: " + runner.vehicleList);

        for (int i = 0; i<runner.vehicleList.size(); i++){
            Object objectInVehicleList = runner.vehicleList.get(i);
            //System.out.println(objectInVehicleList);
            if (objectInVehicleList instanceof Car){
                Car car= (Car) objectInVehicleList;

                System.out.println("The car name is " + car.getName() + ". The car model number is "
                + car.getModelNo() + ". The number of gears is " + car.getNoOfGears());

            }
            else if (objectInVehicleList instanceof Bike){
                Bike bike= (Bike) objectInVehicleList;

                System.out.println("The bike company is " + bike.getCompany() + ". The bike name is "
                        + bike.getName() + ". The bike model number is " + bike.getModelNo()
                        + ". The bike price is $" + bike.getPrice());

            }
        }
/*
        for (int i = 0; i<runner.vehicleList.size(); i++){
            Object objectInVehicleList = runner.vehicleList.get(i);
            System.out.println(objectInVehicleList);
            }
*/

    }
}
