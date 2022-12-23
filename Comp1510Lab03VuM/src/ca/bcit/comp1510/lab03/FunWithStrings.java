package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/** Fun With Strings.
 * @author Mai Vu   
 * @version 2022
 */
public class FunWithStrings {

    /** Drives the program.
     * @param args unused   
     */
    public static void main(String[] args) {
        String input;
        String trimmedInput;
        String p1;
        String p2;
        String p3;
        int trimmedLength;
        Scanner scan = new Scanner(System.in);
        System.out.print("Your favorite book: ");
        // 1.10 scan.next() will only scan the 1st word of the input sentence.
        input = scan.nextLine(); 
        System.out.println(input);
        //1.12
        System.out.println("Length of string: " + input.length());
        //1.13
        System.out.println("The 1st word is \"The\": " 
            + input.matches("The(.*)"));
        //1.14
        System.out.println(input.toUpperCase());
        System.out.println(input);
        //1.18
        trimmedInput = input.trim();
        trimmedLength = trimmedInput.length();
        System.out.println("Length of trimmed string: " + trimmedLength);
        //1.19
        p1 = trimmedInput.substring(0, 1);
        p1 = p1.toUpperCase();
        p2 = trimmedInput.substring(1, trimmedLength - 2);
        p2 = p2.toLowerCase();
        p3 = trimmedInput.substring(trimmedLength - 2, trimmedLength - 1);
        p3 = p3.toUpperCase();
        System.out.println(p1 + p2 + p3);
        scan.close();
        
       

    }

}
