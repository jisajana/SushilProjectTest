package Day24;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
    TelephoneBillCalculation telephoneBillCalculation = new TelephoneBillCalculation();
        System.out.println("Monthly telephone bill amount is $ "
                + telephoneBillCalculation.telephoneBillCalculate());
    }
}

class TelephoneBillCalculation {
    int callInput;
    int remainingCall;
    double monthlyBillAmount;
    static double minBill = 200.0;

    public double telephoneBillCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of calls: ");
        callInput = scanner.nextInt();

        if (callInput < 100) {
            monthlyBillAmount = minBill;
        }
        else if (callInput > 100 && callInput < 150) {
            remainingCall = callInput - 100;
            monthlyBillAmount = minBill + (0.60 * remainingCall);
            System.out.println("Remaining call : " + remainingCall);
        }
        else if (callInput > 150 && callInput < 200) {
            remainingCall = callInput - 150;
            monthlyBillAmount = minBill + (0.60 * 50) + (0.50 * remainingCall);
           // System.out.println("Remaining call : " + remainingCall);
        }
        else if (callInput > 200){
            remainingCall = callInput - 200;
            monthlyBillAmount = minBill + (0.60 * 50) + (0.50 * 50) + (0.40 * remainingCall);
            //System.out.println("Remaining call : " + remainingCall);
        }
        return monthlyBillAmount;
    }
}
