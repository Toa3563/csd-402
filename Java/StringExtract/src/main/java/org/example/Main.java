//Cannon Rivera, 11/4/2025, StringExtract

//This program displays 10 items from an arraylist and then asks
//The user which item they would like to see again, and then the program
//will extract and display the item they would like.

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Pear");
        words.add("Blueberry");
        words.add("Fig");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");

        System.out.println("ArrayList contents:");
        for (String word : words) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("\nWhich Fruit would you like to see again?");
            System.out.println("Enter a number between 1 and " + words.size() + ": ");

            Integer index = (Integer.valueOf(scanner.nextLine())) - 1;
            String chosenWord = words.get(index);

            System.out.println("You Chose " + (index + 1) + ": " + chosenWord);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your number is out of bounds");
        }
    }
}