package Day7;

import java.util.ArrayList;
public class LowerManager extends Employee{

    @Override
    public void add(String name) {
        ArrayList<String> lowerManagers= getEmployees();

        if (lowerManagers.contains(name)) {
            System.out.println(name + " is already present.");
        }
        else{
            lowerManagers.add(name);
        }

    }

    @Override
    public void remove(String name) {
        ArrayList<String> lowerManagers= getEmployees();
        if (lowerManagers.contains(name)) {
            lowerManagers.remove(name);
            System.out.println(name + " is removed");
        }
        else{
            System.out.println(name + " not found on the list.");
        }
    }
}
