package p2;

import java.util.Scanner;

/** RandomWalker Tester.
 * @author Mai Vu
 * @version 1.0
 */
public class TestWalker {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        //3.4
        final int ten = 10;
        final int five = 5;
        final int twohund = 200;
        RandomWalker w1 = new RandomWalker(ten, five);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value for max steps and boundary: ");
        RandomWalker w2 = new RandomWalker(sc.nextInt(), sc.nextInt());
        System.out.println(w1 + "\n" + w2);
        
        //3.10
        RandomWalker w3 = new RandomWalker(twohund, ten);
        w3.walk();
        System.out.println(w3);
        System.out.println("Maximum distance: " + w3.getMaxDistance());
        sc.close();
    }

}
