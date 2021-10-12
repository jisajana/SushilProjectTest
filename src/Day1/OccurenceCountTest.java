/*Count occurrences of character in String.
(E.g. “Hello” should output h=1, e=1, l=2, o=1 or in similar format).*/

/*public class OccurenceCountTest {
}*/
package Day1;

import java.util.HashMap;

public class OccurenceCountTest {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
}
/*
code from Sushil

public class CountCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input any text!");
        String input = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (Character letter : input.toCharArray()) {

            //If the character is present in the map,we update the value of given character i.e. increment the value by 1



            if (map.containsKey(letter)) {

                    map.put(letter, map.get(letter) + 1);
                    } else {
                //If the character is not present in the map,we add the character in the map with the count as 1
                    map.put(letter, 1);
                    }
                    }

                    System.out.println("Character Count: " + map);

                    // Printing using loop
                    System.out.println("Printing from the for loop.");
                    for (Map.Entry kv : map.entrySet()) {
                    System.out.println(kv.getKey() + ": " + kv.getValue());
                    }
                    }
                    }
 */