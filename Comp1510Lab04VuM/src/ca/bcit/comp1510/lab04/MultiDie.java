package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Mai Vu class Oct 2022
 * @version 2017
 */
public class MultiDie {
    /** Maximum face value.
      * 
      * 7.1 max is public so we do not need setters and getters 
      * 7.2 we can have getter for max, 
      *     but not setter as max is final-value can't be changed
      * 7.3 max value should not be modified, 
      *    hence it makes sense to have max as final
      * 7.4 MultiDie object's abstraction is public, 
      * max's being final is to ensure the value of max will not be altered
      * 7.5 max is an instance variable
      *  */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to 1.
     * @param numSides number of sides
     */
    public MultiDie(int numSides) {
        max = numSides;
        roll();

    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }

}


