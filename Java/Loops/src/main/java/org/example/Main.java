//Cannon Rivera, 9/28/2025, Loops

// To print out a pyramid of numbers using nested for loops.
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int spaces = 20;
        int spaces2 = 40;
        for(int i=1;i<9;i++){
            for(int j=1;j<spaces;j++){
                System.out.print(" ");
            }
            int num = 1;
            spaces -= 1;

            System.out.print(num+" ");
            if(i>=2){
                for(int o=1;o<i;o++){
                    num*=2;
                    System.out.print(num+" ");
                }
            }

            for(int p=1;p<i;p++){
                num/=2;
                System.out.print(num+" ");
            }
            for(int j=1;j<spaces2;j++){
                System.out.print(" ");
            }
            spaces2 -= 1;

            System.out.println("@");
        }
    }
}