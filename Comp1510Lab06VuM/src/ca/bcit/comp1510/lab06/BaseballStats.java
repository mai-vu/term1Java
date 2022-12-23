package ca.bcit.comp1510.lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.NumberFormat;

/** Use of Scanner to read file input and parse it.
 * @author Mai Vu
 * @version 2022
 *
 */
public class BaseballStats {
    /** Drives the program.
     * 
     * @param args unused
     * @throws FileNotFoundException there's problem opening the file
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Scanner fileScan;
        Scanner lineScan;
        String s;
        
        System.out.println("File name: ");
        fileScan = new Scanner(new File(scan.nextLine()));
        while (fileScan.hasNext()) {
            int h = 0;
            int sf = 0;
            int o = 0;
            int w = 0;
            s = fileScan.nextLine();
            lineScan = new Scanner(s);  
            lineScan.useDelimiter(",");  
            if (lineScan.hasNext()) {
                System.out.println(lineScan.next());
                // calculating statistics based on data from file
                while (lineScan.hasNext()) {  
                    s = lineScan.next();
                    if (s.trim().equals("h")) {
                        h++;
                    }
                    if (s.trim().equals("s")) {
                        sf++;
                    }
                    if (s.trim().equals("o")) {
                        o++;
                    }
                    if (s.trim().equals("w")) {
                        w++;
                    }
                }
                // calculating batting average
                double a = (double) h / (h + o);
                NumberFormat fmt = NumberFormat.getPercentInstance();
                System.out.println(" Hit: " + h + "\n Sacrifice fly: " + sf 
                        + "\n Win: " + w + "\n Out: " + o 
                        + "\n Batting average: " + fmt.format(a));
            }   
            System.out.println();
        }
        scan.close();
    }

}
