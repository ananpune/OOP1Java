/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgameweek5;

/**
 *
 * @author Megha Patel
 */
public class Card {
    
    public enum Suit{
    HEARTS,CLUBS,SPADES,DIAMONDS
    }
    public enum Value{
        ACE, TWO, THREE,FOUR,FIVE,SIX,
        SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,
        KING
    }
    
    private final Suit suit;
    private final Value value;

    public Card(Suit suit,Value value)
    {
        this.suit=suit;
        this.value=value;
    }
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
}
