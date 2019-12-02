package com.company;
import java.util.Arrays;
import java.util.Comparator;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int countItems = 0;

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[countItems] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[countItems] = new Apple(parts[1].toLowerCase());
            } else if (parts[0].equals("Lemonade")) {
                if (parts.length == 3){
                    breakfast[countItems] = new Lemonade(parts[1].toLowerCase(), parts[2].toLowerCase());
                }
                else{
                    breakfast[countItems] = new Lemonade(parts[1].toLowerCase(), null);
                }

            } else {
                System.out.println("Cannot find class " + parts[0] + ".\nContinue...\n");
                countItems--;
            }
            countItems++;
        }


        int counter = 0;
        Lemonade check = new Lemonade("orange", "vodka");
        for (Food item : breakfast) {

            if (item != null) {
                if (item.equals(check)) {
                    counter++;
                }
            }
        }
        System.out.println("Amount products of type " + "'" + check + "'" + ": " + counter);

        counter = 0;
        for (Food item : breakfast) {

            if (item != null) {
                if (item.equals_type(check)) {
                    counter++;
                }
            }
        }
        System.out.println("Amount products of type " + "'" + check.getName() + "'" + ": " + counter);
    }

}

