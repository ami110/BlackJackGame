/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package ca.sheridancollege.blackjackgame;

/**
 * Game Class
 * SYST 17796 Black Jack Card Game
 *
 * @author AMRIT SINGH
 */


public abstract class Game {
    protected Deck deck;
    protected Hand playerHand;
    protected Hand dealerHand;

    public Game() {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    public abstract void play();

    abstract void playerTurn();

    abstract void dealerTurn();

    abstract void determineWinner();

    public Object getPlayerHand() {
        return playerHand;
    }

    public Object getDealerHand() {
        return dealerHand;
    }
}
