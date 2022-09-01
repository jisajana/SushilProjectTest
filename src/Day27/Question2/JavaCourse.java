package Day27.Question2;

public class JavaCourse extends Course {
    private String tutorName;
    private int duration;


  public JavaCourse(int id, String name, String code) {
        super(id, name, code);
        this.tutorName = tutorName;
        this.duration = duration;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void display() {
        super.display();
        System.out.println("tutorName: " + this.tutorName);
        System.out.println("duration: " + this.duration);
    }

    public void assignTutor(String tutorName) throws Exception {

        if (getActivated() == true) {
            this.tutorName = tutorName;
        }

        if (getActivated() == false || this.tutorName == null) {
            throw new Exception();
        }
    }

    public void courseCompleted() {
            setTutorName("");
            setDuration(0);
            setActivated(false);
        System.out.println("Tutor name is blank, duration is zero and course is not activated.");
        }

    }



