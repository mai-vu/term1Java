package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/** Geometry class to interact with the user and create shapes.
 * @author vhmai
 * @version 2022
 *
 */
public class GeometryDriver {

    /** Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.###");
//        
//        //sphere object
//        System.out.println("Enter x, y, z coordinates and radius of the sphere" 
//            + "respectively, seperate by space: ");
//        Sphere sphere = new Sphere(scan.nextDouble(), scan.nextDouble(), 
//                scan.nextDouble(), scan.nextDouble());
//        System.out.println("The sphere's surface area is: " 
//                + fmt.format(sphere.surfaceArea()));
//        System.out.println("The sphere's volume is: " 
//                + fmt.format(sphere.volume()));
//        
//        //cube object
//        System.out.println("Enter x, y, z coordinates and edge length " 
//                + "of the cube respectively, seperate by space: ");
//        Cube cube = new Cube(scan.nextDouble(), scan.nextDouble(), 
//                scan.nextDouble(), scan.nextDouble());
//        System.out.println("The cube's surface area is: " 
//                + fmt.format(cube.surfaceArea()));
//        System.out.println("The cube's volume is: " 
//                + fmt.format(cube.volume()));
//        System.out.println("The cube's face diagonal is: " 
//                + fmt.format(cube.facediagonal()));
//        System.out.println("The cube's space diagonal is: " 
//                + fmt.format(cube.spacediagonal()));
        
        //cone object
//        System.out.println("Enter height and radius of the cone respectively, " 
//                + "seperate by space: ");
//        Cone cone = new Cone(scan.nextDouble(), scan.nextDouble());
//        System.out.println("The cone's volume is: " 
//                + fmt.format(cone.volume()));
//        System.out.println("The cone's slant height is: " 
//                + fmt.format(cone.sh()));
//        System.out.println("The cone's surface area is: " 
//                + fmt.format(cone.surfaceArea()));
        
        /* Demonstrate how to use NumberFormat to format output,
         * in this example, I use surface area of cone value, 
         * display up to 2 digits after decimal point.
         */
//        NumberFormat numberFmt = NumberFormat.getNumberInstance();
//        numberFmt.setMaximumFractionDigits(2);
//        System.out.println("Cone surface area in new format: "
//                + numberFmt.format(cone.surfaceArea()));
//        
//        scan.close();
        int [] a = null;
        System.out.println(a.length);

    }

}
