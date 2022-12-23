package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/** Name class test.
 * @author Mai Vu
 * @version 2022
 */

public class NameDriver {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        Name n1 = new Name("", "", "  vUUuu  ");
               
        //Print name in last, first middle
        System.out.println(n1.toString());
  
        //Printing out nth character of the name
        System.out.println("Enter position of the chracter: ");
        int n = scan.nextInt();
        n1.nchar(n);
        scan.close();

    }

}
