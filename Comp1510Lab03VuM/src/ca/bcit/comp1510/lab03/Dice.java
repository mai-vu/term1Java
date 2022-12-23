package ca.bcit.comp1510.lab03;

import java.util.Random;

/** Simulating Dice with the Random class.
 * @author vhmai
 * @version 2022
 */
public class Dice {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int foursided = 4;
        final int sixsided = 6;
        final int eightsided = 8;
        final int tensided = 10;
        final int twelvesided = 12;
        final int twentysided = 20;
        int random4;
        int random6;
        int random8;
        int random10;
        int random12;
        int random20;
        Random generator = new Random();
        
        random4 = generator.nextInt(foursided) + 1;
        System.out.println("The random value of 4 sided dice is: " + random4);
        
        random6 = generator.nextInt(sixsided) + 1;
        System.out.println("The random value of 6 sided dice is: " + random6);
        
        random8 = generator.nextInt(eightsided) + 1;
        System.out.println("The random value of 8 sided dice is: " + random8);
        
        random10 = generator.nextInt(tensided) + 1;
        System.out.println("The random value of 10 sided dice is: " + random10);
        
        random12 = generator.nextInt(twelvesided) + 1;
        System.out.println("The random value of 8 sided dice is: " + random12);
        
        random20 = generator.nextInt(twentysided) + 1;
        System.out.println("The random value of 8 sided dice is: " + random20);
        
        System.out.println("Total: " + (random4 + random6 + random8 + random10
                + random12 + random20));
    }

}
