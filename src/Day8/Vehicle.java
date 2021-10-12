package Day8;

public class Vehicle {
    private String name;
    private String modelNo;

    public Vehicle(String name, String modelNo) {
        this.name = name;
        this.modelNo = modelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
}
