//Cannon Rivera, 9/7/2025, M1 Water Energy
//The purpose of this code is to measure the amount of energy(joules)
//given that the user inputs water, initial temp, final temp into
// this formula q = water * (final_temp - initial_temp) * 4184

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of water in kilograms: ");
        double water = Double.parseDouble(input());
        System.out.println("Please enter the initial temp in celsius: ");
        double initial_temp = Double.parseDouble(input());
        System.out.println("Please enter the final temp in celsius: ");
        double final_temp = Double.parseDouble(input());

        double q = water * (final_temp - initial_temp) * 4184;

        System.out.println("The resulting Joules is " + q);

    }

    //Used for getting input from user
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}