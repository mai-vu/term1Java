/**
 * 
 */

package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/** Program to calculate number of paint cans to paint a room.
 * @author MaiVu
 * @version 2022
 */
public class Paint {
    /*coverage of 1 can of paint.
     * 
     */ 
    static final int COVERAGE = 400; 
    /*Calculate number of paint cans needed to paint the room.
     *
     * @param args
     */
    /*Main method*/
    
    public static void main(String[] args) {
        /*declare rooms dimension*/
        int length, width, height, coats, surfaceArea, coverageNeeded;
        int cansOfPaintNeeded;
        
        //Room's dimension
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Room length: ");
        length = myScanner.nextInt();
    
        System.out.print("Room width: ");
        width = myScanner.nextInt();
 
        System.out.print("Room height: ");
        height = myScanner.nextInt();
   
        System.out.print("How many coats: ");
        coats = myScanner.nextInt();
        
        
        surfaceArea = length * width + 2 * height * (width + length);
        coverageNeeded = surfaceArea * coats;
        cansOfPaintNeeded = (int) Math.ceil ((double)coverageNeeded / COVERAGE);      
        System.out.println("To paint the room, we need: "
                + cansOfPaintNeeded + " paint cans");
        
        myScanner.close();
    }

}
