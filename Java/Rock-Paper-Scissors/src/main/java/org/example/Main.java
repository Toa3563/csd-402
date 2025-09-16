package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int computerguess = random.nextInt(1,4);
        String computerthrow = "";
        if(computerguess == 1){
            computerthrow = "Rock";
        }
        if(computerguess == 2){
            computerthrow = "Paper";
        }
        if(computerguess == 3){
            computerthrow = "Scissors";
        }
        //System.out.println("computerguess = " + computerguess);
        //System.out.println("computerthrow = " + computerthrow);
        System.out.println("Enter a number (1,2,3) 1 being rock, 2 being paper, 3 being scissors ");
        Scanner scanner = new Scanner(System.in);
        int playerguess = scanner.nextInt();
        String playerthrow = "";
        if(playerguess == 1){
            playerthrow = "Rock";
        }
        if(playerguess == 2){
            playerthrow = "Paper";
        }
        if(playerguess == 3){
            playerthrow = "Scissors";
        }
        String winner = "";
        if(computerguess == 1 && playerguess == 3){
            winner = "Computer";
        }
        if(computerguess == 2 && playerguess == 1){
            winner = "Computer";
        }
        if(computerguess == 3 && playerguess == 2){
            winner = "Computer";
        }
        if(computerguess == 1 && playerguess == 2){
            winner = "Player";
        }
        if(computerguess == 2 && playerguess == 3){
            winner = "Player";
        }
        if(computerguess == 3 && playerguess == 1){
            winner = "Player";
        }
        if(computerguess == playerguess){
            winner = "TIE!!!!";
        }
        System.out.println("The Computer Threw " + computerthrow);
        System.out.println("You Threw " + playerthrow);
        System.out.println("The Winner is " + winner);
    }

}