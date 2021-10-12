package Day6;

public class BankMain {
    public static void main(String[] args) {
        BankRunner nepalRastraBank= new BankRunner();

        Bank bank = new Bank();
        nepalRastraBank.printDetail(bank);

        Bank nicAsiaBank= new NICAsiaBank(); //upcasting
        nepalRastraBank.printDetail(nicAsiaBank);

        Bank nabilBank= new NabilBank();
        nepalRastraBank.printDetail(nabilBank);

    }
}
