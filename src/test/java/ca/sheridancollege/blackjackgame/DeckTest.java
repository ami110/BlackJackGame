/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.blackjackgame;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
  * @author Amrit Singh
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testDeckCreation() {
        Deck deck = new Deck();
        assertNotNull(deck);
        assertEquals(52, deck.getSize());
    }

    @Test
    public void testShuffle() {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        // Check if two shuffled decks are different
        deck1.shuffle();
        deck2.shuffle();
        assertFalse(deck1.getCards().equals(deck2.getCards()));
    }

    @Test
    public void testDealCard() {
        Deck deck = new Deck();
        Card card = deck.dealCard();
        assertNotNull(card);
        assertEquals(51, deck.getSize());
    }

    @Test
    public void testDealAllCards() {
        Deck deck = new Deck();
        int initialSize = deck.getSize();
        for (int i = 0; i < initialSize; i++) {
            deck.dealCard();
        }
        assertEquals(0, deck.getSize());
        assertNull(deck.dealCard());
    }
    
}
