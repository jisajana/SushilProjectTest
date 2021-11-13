package Day27.Question2;

public class Course {
   private int id;
   private String name;
   private String code;
   private Boolean activated = true;

    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public void display(){
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("code: " + this.code);

    }
}

