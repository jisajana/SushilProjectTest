package Day7;

import java.util.ArrayList;

public class UpperManager extends Employee{

    @Override
    public void add(String name) {
        ArrayList<String> upperManagers= getEmployees();

        try {

            if (upperManagers.contains(name)) {
                System.out.println(name + " is already present.");
            } else {
                upperManagers.add(name);
                System.out.println(name + " added to the list.");
            }

        }
        catch (Exception e) {
            System.out.println("Exception" +e);
        }
    }


    @Override
    public void remove(String name) {
        ArrayList<String> upperManagers = getEmployees();
        if (upperManagers.contains(name)) {
            upperManagers.remove(name);
            System.out.println(name + " is removed");
        }
        else{
            System.out.println(name + " not found on the list");
        }
    }
}
