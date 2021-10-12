package Day6;

public class BankRunner {

    public void printDetail(Bank bank){

        bank.displayInterestRate();

        if (bank instanceof NICAsiaBank){
            NICAsiaBank nicAsiaBank = (NICAsiaBank) bank; //downcasting
            nicAsiaBank.printMobileBankingStatus();
        }

        if (bank instanceof NabilBank){
            NabilBank nabilBank = (NabilBank) bank;
            nabilBank.printSmsBankingStatus();
        }
    }
}

