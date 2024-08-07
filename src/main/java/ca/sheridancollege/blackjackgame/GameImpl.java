/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.blackjackgame;

import java.util.Scanner;

/**
 * Deck Class
 * 
 * @author AMRIT SINGH
 */
public class GameImpl extends Game {

    @Override
    public void play() {
        System.out.println("Welcome to Blackjack!");
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        System.out.println("Player's hand: " + playerHand.toString());
        System.out.println("Dealer's hand: " + dealerHand.toString());

        // Player's turn
        playerTurn();

        // Dealer's turn
        dealerTurn();

        // Determine the winner
        determineWinner();
    }

    @Override
    void playerTurn() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Player's turn:");
            System.out.println("1. Hit");
            System.out.println("2. Stand");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                playerHand.addCard(deck.dealCard());
                System.out.println("Player's hand: " + playerHand.toString());

                if (playerHand.getValue() > 21) {
                    System.out.println("Player busts! You lose.");
                    break;
                }
            } else if (choice == 2) {
                break;
            }
        }
    }

    @Override
    void dealerTurn() {
        System.out.println("Dealer's turn:");
        System.out.println("Dealer's hand: " + dealerHand.toString());

        while (dealerHand.getValue() < 17) {
            dealerHand.addCard(deck.dealCard());
            System.out.println("Dealer hits. Dealer's hand: " + dealerHand.toString());
        }

        if (dealerHand.getValue() > 21) {
            System.out.println("Dealer busts! You win.");
        }
    }

    @Override
    void determineWinner() {
        int playerValue = playerHand.getValue();
        int dealerValue = dealerHand.getValue();

        System.out.println("Player's hand value: " + playerValue);
        System.out.println("Dealer's hand value: " + dealerValue);

        if (playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (playerValue < dealerValue) {
            System.out.println("You lose!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
