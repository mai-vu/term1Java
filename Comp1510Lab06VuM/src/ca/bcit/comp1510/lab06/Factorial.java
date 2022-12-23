package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/** Program to calculate the factorial of a positive integer.
 * @author Mai Vu
 * @version 2022
 *
 */
public class Factorial {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int i;
        int f = 1;
        boolean b = scan.hasNextInt();
        while (!b) {
            System.out.println("Positive integer only. New input: ");
            scan.next();
            b = scan.hasNextInt();
        }
        if (b) {
            i = scan.nextInt(); 
            while (i < 0) {
                System.out.println("Positive integer only. New input: ");
                b = scan.hasNextInt();
                while (!b) {
                    System.out.println("Positive integer only. New input: ");
                    scan.next();
                    b = scan.hasNextInt();
                }
                i = scan.nextInt();
            }
            if (i == 0) {
                f = 1;
            }
            while (i > 0) {
                f = f * i;
                i--;
            }
        }
        System.out.println("Factorial of integer: " + f);
        scan.close();
    }
}
    


