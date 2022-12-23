package p1;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    
    /** key to lock and unlock methods. */
    private int key;
    
    /** return true if methods are locked.*/
    private boolean isLocked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!locked()) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("Coin is locked. Can't Flip.");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     * @throws InterruptedException  when coin is locked. 
     */
    public boolean isHeads() throws InterruptedException {
        if (!locked()) {
            return face == HEADS;
        } else {
            throw new InterruptedException("Coin is locked.");
        }
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        if (!locked()) {
            String faceName;

            if (face == HEADS) {
                faceName = "Heads";
            } else {
                faceName = "Tails";
            }         
            return faceName;  
        } else {
            return "Coin is locked"; 
        }       
    }
    
    /** establishes the key used to unlock. */
    @Override
    public void setKey(int key) {
        this.key = key;      
    }
    
    /** locks the implementing object if the correct key is
    provided and returns true if the object was locked. */
    @Override
    public boolean lock(int keyLock) {
        if (this.key == keyLock) {
            isLocked = true;
            return isLocked;
        } else {
            isLocked = false;
        }
        return locked();
    }
    
    /** unlocks the implementing object if the correct key is
    provided and returns true if the object was unlocked. */
    @Override
    public boolean unlock(int keyUnlock) {
        if (this.key == keyUnlock) {
            isLocked = false;
        } else {
            isLocked = true;
        }
        return !locked();
    }
    
    /** returns true if the implementing object is locked. */
    @Override
    public boolean locked() {
        return isLocked;
    }
}

