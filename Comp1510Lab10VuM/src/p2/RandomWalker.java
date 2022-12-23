package p2;

import java.util.Random;

/** RamdomWalker object.
 * @author Mai Vu
 * @version 1.0
 */
public class RandomWalker {
    
    /** Walker's current step counts. */
    private  int curStepsCount;
     
    /** walker's x coord. */
    private int x;
    
    
    /** walker's y coord. */
    private int y;
    
    /** Maximum Steps. */
    private int maxSteps;   
    
    /** boundary. */
    private int boundary;
    
    /** maximum distance. */
    private int maxDistance;
    
    
    /** Constructor for RandomWalker object, defines by max Steps and boundary. 
     * @param maxSteps maximum steps
     * @param boundary value of boundary*/
    public RandomWalker(int maxSteps, int boundary) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.curStepsCount = 0;
        this.maxDistance = 0; 
    }
    
    /** Constructor for RandomWalker object, defines by max Steps, coord(x&y),
     *  and boundary. 
     * @param maxSteps maximum steps
     * @param x x coord
     * @param y y coord
     * @param boundary value of boundary*/
    public RandomWalker(int maxSteps, int x, int y, int boundary) {
        this.maxSteps = maxSteps;
        this.x = x;
        this.y = y;
        this.boundary = boundary; 
        this.curStepsCount = 0;
        this.maxDistance = 0;
    }
    
    /** simulate object taking 1 step. */
    public void takeStep() {
        Random gen = new Random();
        int i = gen.nextInt(2 + 2);
        switch (i) {
            case 0:
                y++;
                curStepsCount++;
                break;
            case 1:
                x++;
                curStepsCount++;
                break;
            case 2:
                y--;
                curStepsCount++;
                break;
            case (2 + 1):
                x--;
                curStepsCount++;
                break;
            default: 
                System.out.println("Error taking step");          
        }
        maxDistance = max(maxDistance, (max(Math.abs(x), Math.abs(y))));
    }
    
    /** check if if the number of steps taken is less than 
     * the maximum number of steps. 
     * @return true if less than max steps*/
    public boolean moreStep() {
        return (curStepsCount < maxSteps);
    }
    
    /**  if the RandomWalker’s current coordinates are 
     * within its square boundary (include the boundary on the square).
     * @return true if within boundary
     */
    public boolean inBounds() {
        return (Math.abs(x) <= boundary 
                && Math.abs(y) <= boundary);
    }
    
    
    /** simulate a random walk as long as object is still in boundary 
     * and hasn't reached max steps. */
    public void walk() {
        while (inBounds() && moreStep()) {
            takeStep();
        }
    }
    
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }   
    }
    
    @Override
    public String toString() {
        return "RandomWalker Coordinate x: " + x + ", y=" + y 
                + "\nCurrent Steps Count: " + curStepsCount;
    }

    /** Max distance getter.
     * @return the maxDistance
     */
    public int getMaxDistance() {
        return maxDistance;
    }

    /** x coord getter.
     * @return the x
     */
    public int getX() {
        return x;
    }

    /** y coord getter.
     * @return the y
     */
    public int getY() {
        return y;
    }

    /** Current Steps getter.
     * @return the curStepsCount
     */
    public int getCurStepsCount() {
        return curStepsCount;
    }

    /** Max steps getter.
     * @return the maxSteps
     */
    public int getMaxSteps() {
        return maxSteps;
    }
}
