package Day24;
//Question 1

public class Question1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("With non-args constructor");
        student1.display();

        Student student2 = new Student("Shushil Sir", 40);
        System.out.println("=============================");
        System.out.println("With parameterized constructor");
        student2.display();
    }
}

class Student {
    String name;
    int age;
    static int objectCounter;

    public Student() {
        this.name = "Sajana";
        this.age = 30;
        objectCounter++;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        objectCounter++;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ObjectCounter: " + objectCounter);
    }
}
