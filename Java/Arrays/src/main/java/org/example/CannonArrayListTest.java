//Cannon Rivera, 10/28/2025 ArrayListTest
//The purpose of this program is to get a list of integers
//from the user and to print out the largest number entered

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CannonArrayListTest {
    public static void main(String[] args) {
        System.out.println(max(getUserArrayList()));
    }
    public static ArrayList<Integer> getUserArrayList() {
        ArrayList<Integer> integerlist =  new ArrayList<>();
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please Enter number: (If you would like to stop Enter 0) ");
                int integer = sc.nextInt();
                integerlist.add(integer);
                if (integer == 0) {
                    break;
                }
            }
            catch(Exception e) {
                System.out.println("Not an Integer Please Enter again");
            }
        }
        return integerlist;
    }

    public static Integer max(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return 0;
        }
        int largest = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > largest) {
                largest = array.get(i);
            }
        }
        return largest;
    }
}