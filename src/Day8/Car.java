package Day8;

public class Car extends Vehicle {

    private int noOfGears;

    public Car(String name, String modelNo, int noOfGears) {
        super(name, modelNo);
        this.noOfGears = noOfGears;
    }

   @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", modelNo='" + getModelNo() + '\'' +
                ", noOfGears=" + noOfGears +
                '}';
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
}
