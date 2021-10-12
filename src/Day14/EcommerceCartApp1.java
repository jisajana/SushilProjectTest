package Day14;

import java.util.*;

public class EcommerceCartApp1 {
    public static void main(String[] args) {
        Map<String, Double> productList = new HashMap<String, Double>();
        Map<String, Double> cart = new HashMap<String, Double>();

        productList.put("PENCIL", 2.0);
        productList.put("SHARPENER", 5.0);
        productList.put("CRAYON", 3.30);
        productList.put("BACKPACK", 25.50);
        productList.put("SHEETS", 10.00);
        productList.put("PEN", 12.0);
        productList.put("LAPTOP", 1100.0);
        productList.put("SHOES", 50.90);
        productList.put("WATER BOTTLE", 2.0);


        Scanner scanner = new Scanner(System.in);
        String productName;
        double productPrice;
        double totalPrice = 0;
        String keepShopping = "y";

        while (keepShopping.equalsIgnoreCase("y")) {
            System.out.println("==============Product List============");

            for (String name : productList.keySet()) {
                System.out.println(name + " $" + productList.get(name));
            }

            System.out.println("Please choose a product from above list: ");
            productName = scanner.next();

            if (!productList.containsKey(productName)) {
                System.out.println("The product not found");
            } else {
                System.out.println(productName + " added on cart");
                productPrice = productList.get(productName);

                //System.out.println("Please enter product price: ");
                //productPrice = scanner.nextDouble();

                if (!cart.containsKey(productName)) {
                    cart.put(productName, productPrice);
                } else {
                    productPrice += cart.get(productName);
                    cart.put(productName, productPrice);
                }

                System.out.println("Do you want to add more product in cart : ");
                keepShopping = scanner.next();
            }
        }
            System.out.println("====Cart Contents== ");
            for (String name : cart.keySet()) {
                totalPrice += cart.get(name);
                System.out.println(name + " $" + cart.get(name));
            }

            System.out.println("\nGrand total of a cart :$" + totalPrice);
        }
    }





