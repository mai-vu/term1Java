package ca.bcit.comp1510.lab03;

import java.util.Random;
/** CardGame.
 * @author vhmai
 * @version 2022
 */

public class CardGame {
                                                         
    /** Enumeration standard card values.*/
    enum Value { ace, two, three, four, five, six, seven, eight, nine, ten,  
        /** Enumeration standard card values cont.*/
        jack, queen, king }
    
    /** Enumeration standard card suites.*/
    enum Suit { hearts, diamonds, clubs, spades }

    /** Drives the Program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random gen = new Random();
        int randomValue =  gen.nextInt(Value.values().length);
        System.out.println(Value.values().length);
        Value cardValue = Value.values()[(randomValue)];
        int randomSuit =  gen.nextInt(Suit.values().length);
        Suit cardSuit = Suit.values()[(randomSuit)];
        System.out.println(cardValue + " of "  + cardSuit);     
    }

}
