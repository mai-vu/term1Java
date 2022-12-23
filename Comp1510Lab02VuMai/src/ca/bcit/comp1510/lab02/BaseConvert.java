package ca.bcit.comp1510.lab02;

import java.util.Scanner;
/**
 BaseConvert.
*
* @author BCIT
* @version 1.0
*/

public class BaseConvert {
    /**
     * Drives the program.
     *
     * @param args
     *              arguments
     */
    public static void main(String[] args) {
        int base10number; 
        int base; 
        int maximumNumber = 0;
        // digit in the 1's (base^0) place
        int place0, quotient; 
        int place1;
        int place2;
        int place3;
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.println("Please enter a base (2-9): ");
        // Assign the user's input to the base variable
        base = scan.nextInt();
        // Calculate the correct value to store in maxNumber
        maximumNumber = (int) Math.pow(base,4) - 1;
        System.out.println("The max base 10 number to convert for that base is" 
                + ": " + maximumNumber);
        System.out.println("Please enter a base 10 number to convert: ");
        base10number = scan.nextInt();
        // Do the conversion
        place0 = base10number % base;
        quotient = base10number / base;
        place1 = quotient % base;
        quotient = quotient / base;
        place2 = quotient % base;
        quotient = quotient / base;
        place3 = quotient % base;
        quotient = quotient / base; 
        // Print the result
        String baseBNumber = new String("" + place3 + place2 + place1 + place0);
        System.out.println("The result is: " + baseBNumber);
        scan.close();
    }
}
