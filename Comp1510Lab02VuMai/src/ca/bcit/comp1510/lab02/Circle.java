package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Circle Value Calculation.
 * @author Mai Vu
 * @version 2022
 */
public class Circle {
    static final double PI = 3.14159;
    /**
     * Drives the program.
     * @param args
     */
    
    public static void main(String[] args)   {
        double radius, doubleradius, circumference, area, circumference2, 
              area2, ratioC, ratioA;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the circle's radius: ");
        radius = myScanner.nextInt();
        doubleradius = 2 * radius;
      
        /*calculating the circumference and the area of the circle */
        circumference = (2 * PI * radius);
        circumference2 = (2 * PI * doubleradius);
  
        area = (PI * radius * radius);
        area2 = (PI * doubleradius * doubleradius);    
        /*calculating how many times the area and circumference increase
         */
        ratioC = circumference2 / circumference;
        ratioA = area2 / area;
      
        //Print out results
      
        System.out.println("The circumference of the Circle is: "
                + circumference);
        System.out.println("The area of the Circle is: " + area);
        System.out.println("When you double the radius, the circumference " 
            + "and the area increase: " + ratioC + " and " + ratioA 
            + " times respectively");   
      
        myScanner.close();
    }

}
