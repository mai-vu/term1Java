package q2;

import java.util.Scanner;
/**
 * Calculates an approximation to the square root of a positive number >=1 by
 *  using the following algorithm from Newton, 
 *  and prints the first ten resulting estimates.
 *  
 * @author Mai Vu
 * @version 1.0
 */

public class Sqrt {
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //value to be calculate its square root
        double a;
        //square root estimate
        double s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number >=1: ");
        a = scan.nextDouble();
        s = (a + 1) / 2;
        System.out.println("First estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Second estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Third estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Fourth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Fifth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Sixth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Seventh estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Eighth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Ninth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Tenth estimate: " + s);
        System.out.println("Question two was called and ran sucessfully.");
        scan.close();
    }

}
