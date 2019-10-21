package edu.cscc;

import java.util.*;


/**
 * Main class
 *
 * @author Jon Ransom
 *
 * version 1.0
 */


public class Main {


    private static Scanner input = new Scanner(System.in);

    /**
     * main method string picks
     *
     * @param args
     */

    public static void main(String[] args) {

        /**
         * @param H_PICK h_pick for player

         */

        String h_pick;

        /**
         * @param C_PICK c_pick for computer

         */

        String c_pick;

        /**
         * verifies if string pick is valid

         */

        String answer;

        boolean isValid;

        /**
         * do while loops to generate prompt tp play game,
         * enter choice and validate choice
         * while loop isValid
         * Compute picks and game winner

         */


        do {

            System.out.println("Let's play rock, paper, scissors, lizard, spock");

            do {

                System.out.print("Enter your choice: ");

                h_pick = input.nextLine();

                isValid = RPSLSPock.isValidPick(h_pick);

                if (!isValid) {

                    System.out.println(h_pick + " is not a valid choice");

                }

            } while (!isValid);


            c_pick = RPSLSPock.generatePick();

            System.out.print("Computer picked " + c_pick + "  ");


            if (c_pick.equalsIgnoreCase(h_pick)) {

                System.out.println("Tie!");

            } else if (RPSLSPock.isComputerWin(c_pick, h_pick)) {

                System.out.println("Computer wins!");

            } else {

                System.out.println("You win!");

            }

/**
 * Generate prompt asking is user would like to continue

 */

            System.out.print("Play again ('y' or 'n'): ");

            answer = input.nextLine();

        } while ("Y".equalsIgnoreCase(answer));

        System.out.println("Live long and prosper!");

    }

}

