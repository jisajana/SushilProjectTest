package Day28.Question1;

public class B extends Marks {
    int subject1;
    int subject2;
    int subject3;
    int subject4;

    public B (int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public int getPercentage() {
        int percentage = (subject1 + subject2+ subject3 + subject4)/4;
        return percentage;
    }
}
