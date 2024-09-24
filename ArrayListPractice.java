// Tl 09/24/2024
// ArrayListPractice.java

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("\n Welcome to the ArrayList Practice Program! \n");

        // Create an ArrayList for Strings
        ArrayList<String> myListOfStrings  = new ArrayList<>();

        // Add a few elements to my ArrayList.
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        // Output our ArrayList
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // Remove an element
        myListOfStrings.remove(0);

        // Output our ArrayList
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // remove an element
        myListOfStrings.remove("third");

        // Output our ArrayList
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // use for a loop to add some things to our list
        String toAdd = "";
        for (int i = 0; i < 8; i++) {
            toAdd = toAdd + " a" + Integer.toString(i);
            myListOfStrings.add(toAdd);

            // Output our ArrayList
            System.out.println("\n After adding a bunch of stuff");
            System.out.println("\n myListOfStrings is: " + myListOfStrings);

            // Use a for loop output to each element of our ArrayList
            for (int i1 = 0; i < myListOfStrings.size(); i++) {
                System.out.println("An element in my list is: " +myListOfStrings.get(i));
            }









        }
    }
}