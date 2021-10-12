package Day11;

public class ElectricityCalculation {
    static final double MIN_BILL_AMOUNT = 100;
    public static void main(String[] args) {
        ElectricityCalculation electricityCalculation = new ElectricityCalculation();
        double electricBill = electricityCalculation.calculateElectricityBill(100);
        System.out.println("The electric bill amounts to $: " + electricBill);
    }

    public double calculateElectricityBill(int electricityConsumed){
        double bill =0;
        if (electricityConsumed<=100){
            bill = (electricityConsumed*10);
        }
        else if (electricityConsumed>100 && electricityConsumed<=200){
            bill = (100*10) +((electricityConsumed-100)*12);
        }
        else if (electricityConsumed>200){
            bill = (100*10) +(100*12)+((electricityConsumed-200)*15);
        }
        return bill + MIN_BILL_AMOUNT;

    }
}
