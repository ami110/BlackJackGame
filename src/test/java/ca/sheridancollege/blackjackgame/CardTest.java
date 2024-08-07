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
public class CardTest {
    
    public CardTest() {
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
    public void testCardCreation() {
        Card card = new Card("Ace", "Spades");
        assertEquals("Ace", card.getRank());
    }

    @Test
    public void testToString() {
        Card card = new Card("Jack", "Hearts");
        assertEquals("Jack of Hearts", card.toString());
    }

    @Test
    public void testNotEquals() {
        Card card1 = new Card("Queen", "Clubs");
        Card card2 = new Card("Jack", "Hearts");
        assertEquals(false, card1.equals(card2));
    }
    
}
