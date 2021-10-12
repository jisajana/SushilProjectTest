package Day6;

public class Game {
    private String name;
    private String version;

    public Game(String name) {   //constructor created
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void print(){
        System.out.println("The game name is " + name);
        System.out.println("The game version is " + version);
    }
}




