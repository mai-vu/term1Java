package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Integer Wrapper Exercise.
 * @author Mai Vu
 * @version 2022
 */

public class IntegerWrapper {


    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number1 = scan.nextInt();
        Integer obj1;
        obj1 = number1;
        /* Task 1.3 Printing the binary, octal and hexadecimal 
         * value of the input number.
         */
        System.out.println("Value of the integer in binary: " 
              + Integer.toBinaryString(obj1));
        System.out.println("Value of the integer in hex: " 
              + Integer.toHexString(obj1));
        System.out.println("Value of the integer in octal: " 
                + Integer.toOctalString(obj1));
        /* Task 1.4 */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //Task 1.5
        System.out.println("Enter first integer: ");
        String s1 = scan.next();
        System.out.println("Enter second integer: ");
        String s2 = scan.next();
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        System.out.println("The total of the 2 integers: " + (int1 + int2));
        
        scan.close();
    }

}
