package q3;

import java.util.Scanner;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestMIXChar {

    // private static final char DELTA = '\u0394';
    //    
    //    private static final char SIGMA = '\u03A3';
    //    
    //    private static final char PI = '\u03A0';
    
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        System.out.println("Enter a string of MIXChar characters: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        Message m = new Message(s);
        System.out.println(m.toLongs());
        System.out.println(m.toString());
        sc.close();
        System.out.println("Question three was called and ran sucessfully.");
    }
    
    
}
