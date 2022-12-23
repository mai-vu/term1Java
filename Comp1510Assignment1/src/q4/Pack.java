package q4;

import java.util.Scanner;
/**
 * This program encodes 5 MIX-characters (A-I inclusive) string 
 * into a single integer variable 
 * and decoded the value back into MIX characters.
 *
 * @author Mai Vu
 * @version 1.0
 */

public class Pack {
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 5-character string (A to I exclusive): ");
        String input = scan.nextLine().toString();
        //base 56 value
        final int b = 56;
        char c1 = input.charAt(0);
        char c2 = input.charAt(1);
        char c3 = input.charAt(2);
        char c4 = input.charAt(1 + 2);
        char c5 = input.charAt(2 + 2);
        // convert characters to their numeric value
        long d1 = c1 - 'A' + 1;
        long d2 = c2 - 'A' + 1;
        long d3 = c3 - 'A' + 1;
        long d4 = c4 - 'A' + 1;
        long d5 = c5 - 'A' + 1;
        System.out.println(d1);
        // printing encoded value
        long eInt = d1 * b * b * b * b + d2 * b * b * b 
             + d3 * b * b + d4 * b + d5;
        System.out.println(eInt);
        // decode the value and print the result
        d1 = eInt % b;
        eInt = eInt / b;
        d2 = eInt % b;
        eInt = eInt / b;
        d3 = eInt % b;
        eInt = eInt / b;
        d4 = eInt % b;
        eInt = eInt / b;
        d5 = eInt % b;
        eInt = eInt / b;
        // convert digits back to character
        c1 = (char) (d1 - 1 + 'A');
        c2 = (char) (d2 - 1 + 'A');
        c3 = (char) (d3 - 1 + 'A');
        c4 = (char) (d4 - 1 + 'A');
        c5 = (char) (d5 - 1 + 'A');
        System.out.print(c5);
        System.out.print(c4);
        System.out.print(c3);
        System.out.print(c2);
        System.out.println(c1);
        
        System.out.println("Question four was called and ran sucessfully.");
        scan.close();
    }
}
        
        


