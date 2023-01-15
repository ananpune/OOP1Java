/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgameweek5;

/**
 *
 * @author Megha Patel
 */
public class CardHand {

    private int handSize=52;
    public Card[] cards=new Card[handSize];
    
    //A method which generate a deck of cards
    
    public void generateHand()
    {
        int countCards=0;
        
        for(Card.Suit s:Card.Suit.values())
        {
            for(Card.Value v: Card.Value.values() )
            {
                cards[countCards]=(new Card(s,v));
                countCards++;            
            }
        
        
        }
    
    
    }
    
}
