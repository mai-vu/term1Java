package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Create name from user input.
 * @author vhmai
 * @version 2022
 */

public class Names {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Name n = new Name(null, null, null);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first name: ");
        String first = scan.nextLine(); 
        n.setFirst(first);
        
        System.out.println("Enter middle name: ");
        String middle = scan.nextLine(); 
        n.setMiddle(middle);
        
        System.out.println("Enter last name: ");
        String last = scan.nextLine();
        n.setLast(last);
        
        System.out.println(n.toString());
        scan.close();
    }

}
