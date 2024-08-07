/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.blackjackgame;

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
public class HandTest {
    
    public HandTest() {
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
    public void testGetValue() {
        Hand hand = new Hand();
        // Test with one Ace
        hand.addCard(new Card("Ace", "Spades"));
        hand.addCard(new Card("5", "Hearts"));
        assertEquals(16, hand.getValue());
        
        // Test with multiple Aces
        hand = new Hand();
        hand.addCard(new Card("Ace", "Spades"));
        hand.addCard(new Card("Ace", "Hearts"));
        hand.addCard(new Card("5", "Diamonds"));
        assertEquals(17, hand.getValue());
        
        // Test with face cards
        hand = new Hand();
        hand.addCard(new Card("King", "Clubs"));
        hand.addCard(new Card("Queen", "Diamonds"));
        assertEquals(20, hand.getValue());
        
        // Test with other numbered cards
        hand = new Hand();
        hand.addCard(new Card("2", "Clubs"));
        hand.addCard(new Card("8", "Diamonds"));
        assertEquals(10, hand.getValue());
    }

    @Test
    public void testToString() {
        Hand hand = new Hand();
        hand.addCard(new Card("Ace", "Spades"));
        hand.addCard(new Card("5", "Hearts"));
        assertEquals("Ace of Spades, 5 of Hearts, ", hand.toString());
    }

    
}
