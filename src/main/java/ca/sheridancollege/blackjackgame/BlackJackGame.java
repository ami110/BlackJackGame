/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ca.sheridancollege.blackjackgame;

import java.util.Scanner;

/**
 *
 *
 * @author AMRIT SINGH
 */
public class BlackJackGame {
    /**
 * Play Class 
 * Run this program and start playing
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalRounds = 0;
        int roundsWon = 0;
        int roundsLost = 0;

        // Run the game until the user opts to quit
        while (true) {
            totalRounds++;
            
            GameImpl game = new GameImpl();
            game.play();

            

            // Display a summary of the play
            displaySummary(totalRounds, roundsWon, roundsLost);

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("User Quitted the Game");
                // System.out.println("You played "+totalRounds+"rounds");
                System.out.println("Thanks for playing! Goodbye.");
                break; // Exit the loop if the user chooses not to play again
            }
        }

        scanner.close();
    }

    public static void displaySummary(int totalRounds, int roundsWon, int roundsLost) {
        System.out.println("Total Rounds Played: " + totalRounds);
        
    }
}