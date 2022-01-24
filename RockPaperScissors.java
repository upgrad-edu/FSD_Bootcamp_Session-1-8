package com.upgrad.fsd;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    /*
        1. Rock
        2. Paper
        3. Scissors
     */

    public static void main(String[] args) {

        int compScore = 0, userScore = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = input.nextLine();
        int roundNumber = 0;

        while (compScore != 5 && userScore != 5) {
            roundNumber++;
            System.out.println("Round " + roundNumber);
            System.out.println("Scores:");
            System.out.println("Computer: " + compScore);
            System.out.println(userName+ ": " + userScore);
            int userOption;
            do {
                System.out.println("Enter your option!");
                System.out.println("1. Rock");
                System.out.println("2. Paper");
                System.out.println("3. Scissors");
                System.out.println("Please enter your input..");
                userOption = input.nextInt();

                if (userOption >= 1 && userOption <= 3) {
                    System.out.println("Processing...");
                } else {
                    System.out.println("Invalid input, please enter again...");
                }
            } while (!(userOption >= 1 && userOption <= 3));

            Random r = new Random();
            int compOption = r.nextInt(3) + 1;
            switch (compOption) {
                case 1:
                    System.out.println("Computer chooses Rock!");
                    break;
                case 2:
                    System.out.println("Computer chooses Paper!");
                    break;
                case 3:
                    System.out.println("Computer chooses Scissors!");
                    break;
            }

            switch (userOption) {
                case 1:
                    switch (compOption) {
                        case 1:
                            System.out.println("Draw!");
                            break;
                        case 2:
                            System.out.println("Computer wins this round! Score: " + compScore + " -> " + (compScore+1));
                            compScore++;
                            break;
                        case 3:
                            System.out.println(userName + " wins this round! Score: " + userScore + " -> " + (userScore+1));
                            userScore++;
                    }
                    break;
                case 2:
                    switch (compOption) {
                        case 1:
                            System.out.println(userName + " wins this round! Score: " + userScore + " -> " + (userScore+1));
                            userScore++;
                            break;
                        case 2:
                            System.out.println("Draw!");
                            break;
                        case 3:
                            System.out.println("Computer wins this round! Score: " + compScore + " -> " + (compScore+1));
                            compScore++;
                    }
                    break;
                case 3:
                    switch (compOption) {
                        case 1:
                            System.out.println("Computer wins this round! Score: " + compScore + " -> " + (compScore+1));
                            compScore++;
                            break;
                        case 2:
                            System.out.println(userName + " wins this round! Score: " + userScore + " -> " + (userScore+1));
                            userScore++;
                            break;
                        case 3:
                            System.out.println("Draw!");
                    }
            }

            System.out.println("<---- End of Round ---->");
            System.out.println(); System.out.println();
        }

        if(compScore == 5) {
            System.out.println("Computer wins! Better luck next time.");
        } else {
            System.out.println(userName + " wins! Well done.");
        }

    }

}
