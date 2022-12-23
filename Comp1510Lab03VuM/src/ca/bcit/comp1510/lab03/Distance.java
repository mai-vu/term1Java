package ca.bcit.comp1510.lab03;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Distance.
 * @author vhmai
 * @version 2022
 */
public class Distance {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide 2 coordinates seperated by white space: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Provide 2 coordinates seperated by white space: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double result = Math.sqrt(Math.pow((x2 - x1), 2) 
                + Math.pow((y2 - y1), 2));
        DecimalFormat fmt = new DecimalFormat("#.##");
        //3.8 It dies print the leading 0
        System.out.println("Distance between 2 points: " + fmt.format(result));
        scan.close();
    }

}
