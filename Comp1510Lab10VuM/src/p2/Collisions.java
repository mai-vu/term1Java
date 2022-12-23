package p2;

/** simulate two particles in a space and how many times they collide.
 * @author Mai Vu
 * @version 1.0
 */
public class Collisions {
    /** check if 2 particles collide.
     * @param one particle 1
     * @param two particle 2 
     *  @return true if 2 particles collide
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return (one.getX() == two.getX() && one.getY() == two.getY());

    }

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int xCoord = 3;
        final int bound = 2000000;
        final int maxSteps = 100000;
        RandomWalker p1 = new RandomWalker(maxSteps, -xCoord, 0, bound);
        RandomWalker p2 = new RandomWalker(maxSteps, xCoord, 0, bound);
        int numCollision = 0;
        for (int i = 0; i < maxSteps; i++) {
            p1.takeStep();
            p2.takeStep();
            if (samePosition(p1, p2)) {
                numCollision++;
            }
        }
        System.out.println("Number of collisions: " + numCollision);
        System.out.println(
                "particle1 MaxDistance: " + p1.getMaxDistance() 
                + "\nparticle2 MaxDistance: " + p1.getMaxDistance());

    }

}
