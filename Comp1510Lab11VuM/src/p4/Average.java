package p4;

/** Calculate average from cmd line input.
 * @author Mai Vu
 * @version 1.0
 */
public class Average {

    /** Drives the program.
     * @param args array input from cmd line
     */
    public static void main(String[] args) {
        int total = 0;
        double avg = 0;
        int intCount = 0;
        if (args.length == 0) {
            System.out.println("No arguments.");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int x = Integer.parseInt(args[i]);
                total += x;
            } catch (IllegalArgumentException e) {
                System.out.println(args[i] + " is not an Integer");
                intCount++;
            }          
            avg = (double) total / (args.length - intCount);
        }
        System.out.println("Average: " + avg);

    }

}
