package Day6;

public class CounterStrike extends Game{
    private int numberOfPlayers;

    public CounterStrike(String name, int numberOfPlayers) {
        super(name);
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void print(){
        super.print();
        System.out.println("The number of players is " + numberOfPlayers);

    }
}
