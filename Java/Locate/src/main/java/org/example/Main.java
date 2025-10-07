package org.example;

import java.util.ArrayList;
import java.util.Arrays;

//Write methods using the following headers that returns the location of the largest element
//in the array passed to the method returning a one-dimensional array that contains two location elements.
//public static int [ ] locateLargest (double [ ][ ] arrayParam)
//public static int [ ] locateLargest (int [ ][ ] arrayParam)
//Then, write methods using the following headers that returns the location of the smallest element
//in the array passed to the method returning a one-dimensional array that contains two location elements.
//public static int [ ] locateSmallest (double [ ][ ] arrayParam)
//public static int [ ] locateSmallest (int [ ][ ] arrayParam)
public class Main {
    public static void main(String[] args) {
        double[][] doublearray = {
                {1.2, 5.7, 3.4},
                {7.6, 2.1, 6.6},
                {4.5, 8.9, 0.1}
        };
        int[][] intarray = {
                {9, 5, 3},
                {7, 2, 6},
                {4, 8, 1}
        };
        int[] doubleresultlarge = locateLargest(doublearray);
        int[] intresultlarge = locateLargest(intarray);
        int[] doubleresultsmall = locateSmallest(doublearray);
        int[] intresultsmall = locateSmallest(intarray);
        System.out.println(toString(doubleresultlarge,intresultlarge,doubleresultsmall,intresultsmall));
    }

    public static String toString(int[] doubleLarge, int[] intLarge, int[] doubleSmall, int[] intSmall) {
        return "The location of Largest element in double array:\n" +
                locationOutput(doubleLarge) +
                "\nThe location of Largest element in int array:\n" +
                locationOutput(intLarge) +
                "\nThe location of Smallest element in double array:\n" +
                locationOutput(doubleSmall) +
                "\nThe location of Smallest element in int array:\n" +
                locationOutput(intSmall);
    }

    public static String locationOutput(int[] array) {
        int row = array[0];
        int col = array[1];
        return "Row: " + row
                + " Column: " + col;
    }

    public static int[] locateLargest(double[][] arrayParam) {
        double largest = arrayParam[0][0];
        int[] result = new int[2];
        for (int i = 1; i < arrayParam.length; i++) {
            for (int j = 1; j < arrayParam[i].length; j++){
                if (largest < arrayParam[i][j]) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        double smallest = arrayParam[0][0];
        int[] result = new int[2];
        for (int i = 1; i < arrayParam.length; i++) {
            for (int j = 1; j < arrayParam[i].length; j++){
                if (smallest > arrayParam[i][j]) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int largest = arrayParam[0][0];
        int[] result = new int[2];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++){
                if (largest < arrayParam[i][j]) {
                    largest = arrayParam[i][j];
                    //I'm adding 1 so that the rows and columns start with 1 and not 0
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int smallest = arrayParam[0][0];
        int[] result = new int[2];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++){
                if (smallest > arrayParam[i][j]) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


}