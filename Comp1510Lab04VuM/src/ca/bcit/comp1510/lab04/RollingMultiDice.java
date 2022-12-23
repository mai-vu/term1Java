package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Exercise MultiDie Class.
 * @author Mai Vu
 * @version 2022
 */
public class RollingMultiDice {

    /** Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int newFace = 4;
        
        MultiDie die1;
        MultiDie die2;
        int sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first die's max value in integer: ");
        int max1 = scan.nextInt();
        System.out.println("Enter second die's max value in integer: ");
        int max2 = scan.nextInt();

        die1 = new MultiDie(max1);
        die2 = new MultiDie(max2);

        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(newFace);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
        scan.close();
    }

}
