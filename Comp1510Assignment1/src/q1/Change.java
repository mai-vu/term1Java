package q1;

import java.util.Scanner;
/**
 * This program reads a double value representing a monetary amount, and then 
 * determine the fewest number of each bill and coin needed to represent 
 * that amount, starting with the highest, which is $10 in this case, 
 * and pennies exist.
 * 
 * @author Mai Vu
 * @version 1.0
 */

public class Change {
       
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        /* In order to ensure correct calculation in integer, 
         * all values are multiplied by 100
         */
        final int ten = 1000;
        final int five = 500;
        final int toonie = 200;
        final int loonie = 100;
        final int quarter = 25;
        final int dime = 10;
        final int nickle = 5;
        final int penny = 1;
        final int hundred = 100;
        Scanner scan = new Scanner(System.in);
        System.out.println("Money value that needs change: ");
        double money = scan.nextDouble() * hundred;
        /* calculate number of $10 notes. */
        int billsTen = (int) money / ten;
        money = money % ten;
        /* calculate number of $5 notes. */
        int billsFive = (int) money / five;
        money = money % five;
        /* calculate number of $2 coins. */
        int coins2 = (int) money / toonie;
        money = money % toonie;
        /* calculate number of $1 coins. */
        int coins1 = (int) money / loonie;
        money = (money % loonie);
        /* calculate number of $0.25 coins. */
        int coins25cents = (int) money / quarter;
        money = (int) money % (int) quarter;
        /* calculate number of $0.10 coins. */
        int coins10cents = (int) money / dime;
        money = (int) money % dime;
        /* calculate number of $0.05 coins. */
        int coins5cents = (int) money / nickle;
        money = (int) money %  nickle;
        /* calculate number of $0.01 coins. */
        int coins1cent = (int) money / penny;
        /* Printing result*/
        System.out.println(billsTen + " ten dollar bills\n"
             + billsFive + " five dollar bills\n" + coins2 + " toonies\n" 
             + coins1 + " loonies\n" + coins25cents + " quarters\n" 
             + coins10cents + " dimes\n" + coins5cents + " nickles\n" 
             + coins1cent + " pennies");
        System.out.println("Question one was called and ran sucessfully.");
        scan.close();
    }

}
