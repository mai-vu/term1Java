package ca.bcit.comp1510.lab05;

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
        Name n1 = new Name("Mai", "Hoang", "Vu");
        
        //Printing name length
        System.out.println("Name length: " + n1.namelength());
        
        //Printing 3 initials in upper case
        System.out.println("Name Initial: " + n1.initial());
        
        //Print name in last, first middle
        System.out.println(n1.toString());
        
        //comparing if first name matches input
        System.out.println("Enter input to check if matches 1st name: ");
        String str = scan.nextLine();
        System.out.println("1st name matches: " + n1.compare1stname(str));
        
        //comparing 2 names
        System.out.println("Enter 2nd first name: ");
        System.out.println("Enter 2nd middle name: ");
        System.out.println("Enter 2nd last name: ");
        Name n2 = new Name(scan.nextLine(), scan.nextLine(), scan.nextLine());
        System.out.println(n1.compare(n2));
        
        //Printing out nth character of the name
        System.out.println("Enter position of the chracter: ");
        int n = scan.nextInt();
        System.out.println(n1.nchar(n));
        //works for all names with 3 inputs first name, middle name, last name.
        scan.close();

    }

}
