/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cardgameweek5;

/**
 *
 * @author Megha Patel
 */
public class GamePlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardHand ch=new CardHand();
        ch.generateHand();
        
        for(Card c:ch.cards)
        {
            System.out.println(c.getValue()+" of "+c.getSuit());
        }
    }

}
