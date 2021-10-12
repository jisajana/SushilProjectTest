package Day14;

import java.util.*;

public class EcommerceCartApp {
    public static void main(String[] args) {
        Map<String, Double> cart = new HashMap<String, Double>();

        Scanner scanner = new Scanner(System.in);
        String productName;
        double productPrice;
        double totalPrice = 0;
        String keepShopping = "y";

        while (keepShopping.equals("y")) {
            System.out.println("Please enter product name: ");
            productName = scanner.next();

            System.out.println("Please enter product price: ");
            productPrice = scanner.nextDouble();

            if (!cart.containsKey(productName)) {
                cart.put(productName, productPrice);
            }
            else {
                productPrice += cart.get(productName);
                cart.put(productName, productPrice);
            }

            System.out.println("Do you want to add more product in cart : ");
            keepShopping = scanner.next();
        }

        for (String name : cart.keySet()) {
            totalPrice+= cart.get(name);
            System.out.println(name + " $" + cart.get(name));
        }

        System.out.println("\nGrand total :$" + totalPrice );
    }
}




