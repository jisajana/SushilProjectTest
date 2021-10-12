package Day7;

import java.util.ArrayList;

import static java.util.ArrayList.*;

public abstract class Employee {
    private ArrayList<String> employees;

    public Employee() {
        this.employees = new ArrayList<>();
    }

    public ArrayList<String> getEmployees() {
        return employees;
    }

    public void search(String name) {
        if (employees.contains(name)) {
            System.out.println(name + " is found in the employees list.");
        }
        else{
            System.out.println(name + "not on the list.");
        }
    }

    public abstract void add (String name);

    public abstract void remove (String name);

}





