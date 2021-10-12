package Day4;

public class Project {
    String projectName;
    int projectVersion;
    String deadLine;
    double cost;
    static double totalCost;

    public Project(String projectName, String deadLine, double cost) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        this.cost = cost;
        totalCost = totalCost+ this.cost;
    }

    public Project(String projectName, int projectVersion, String deadLine, double cost) {
        if (projectVersion > 2) {
            this.projectName = projectName;
            this.projectVersion = projectVersion;
            this.deadLine = deadLine;
            this.cost = cost;
            totalCost = totalCost + this.cost;
        }

        else{
            System.out.println("The project version should be grater than 2.");
        }
    }

    void display(){
        System.out.println("The project details is as follows:");
        System.out.println("The Project name is " + projectName);
        System.out.println("The Project deadline is " + deadLine);
        System.out.println("The Project version is " + projectVersion);
        System.out.println("The Project cost is $ " + cost);
        System.out.println("The Project total cost is $ " + totalCost + "\n");
    }
}


