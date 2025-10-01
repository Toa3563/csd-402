//Cannon Rivera 10/1/2025 Overloaded Methods

//The Purpose of this program is to write 4 overloaded methods that each return an average of an array
//Then print out to the user the array, and average.
package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        short[] shortarray = {10, 20, 30, 40};
        System.out.println(Arrays.toString(shortarray));
        System.out.println("Your Short Average is: " + average(shortarray));

        int[] intarray = {2, 4, 6, 8};
        System.out.println("\n"+Arrays.toString(intarray));
        System.out.println("Your Integer Average is: " + average(intarray));

        long[] longarray = {100000, 20000,10000,50,32};
        System.out.println("\n"+Arrays.toString(longarray));
        System.out.println("Your Long Average is: " + average(longarray));

        double[] doublearray = {1.5, 2.5, 3.0};
        System.out.println("\n"+Arrays.toString(doublearray));
        System.out.println("Your Double Average is: " + average(doublearray));

    }

    public static short average(short[] array){
        int number = array.length;
        short sum = 0;
        for (int i = 0; i < number; i++) {
            sum += array[i];
        }
        return (short) (sum/number);
    }
    public static int average(int[] array){
        int number = array.length;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += array[i];
        }
        return sum/number;
    }
    public static long average(long[] array){
        int number = array.length;
        long sum = 0;
        for (int i = 0; i < number; i++) {
            sum += array[i];
        }
        return sum/number;
    }
    public static double average(double[] array){
        int number = array.length;
        double sum = 0;
        for (int i = 0; i < number; i++) {
            sum += array[i];
        }
        return (sum/number);
    }
}