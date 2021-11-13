package Day25.Question2;

import Day25.Question2.Apple;
import Day25.Question2.Samsung;

class MobileStore {
    public static void main(String[] args) {
        System.out.println("================Samsung Details===============");
        Samsung samsung = new Samsung("Samsung");
        samsung.MobileDisplay(samsung, 3000.0);
        /*samsung.setPrice(1200.00);
        samsung.calculateTotal();
        samsung.display();*/


        System.out.println("================Apple Details===============");
        Apple apple = new Apple("Apple");
        apple.MobileDisplay(apple, 5000.0);
        /*apple.setPrice(2000.00);
        apple.calculateTotal();
        apple.display();*/


    }
}

