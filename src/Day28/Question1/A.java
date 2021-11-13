package Day28.Question1;

public class A extends Marks {
    int subject1;
    int subject2;
    int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    public int getPercentage() {
        int percentage = (subject1 + subject2+ subject3)/3;
        return percentage;
    }
}

