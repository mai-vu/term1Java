package ca.bcit.comp1510.lab05;

/** Mathematics.
 * @author Mai Vu
 * @version 2022
 *
 */

public class Mathematics {
    
    /** value of Pi declaration. */
    public static final double PI = Math.PI;
    
    /**
    * Returns the area of the circle with the specified radius.
    *
    * @param radius of the circle.
    * @return area as a double
    */
    public double getCircleArea(double radius) {
        double s = PI * radius * radius;
        return s;
    }
    
    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param number upper bound
    * @return sum as an integer
    */
    public int sumOfInts(int number) {
        int total = 0;
        while (number > 0) {
            total = total + number;
            number--;           
        }
        return total;
    }
    
    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param i number to test
    * @return true if number is positive, else false.
    */
    public boolean isPositive(int i) {
        
        return i > 0;
    }
    
    /**
    * Returns true if the specified value is even, else false.
    *
    * @param i number to test
    * @return true if number is even, else false.
    */
    public boolean isEven(int i) {
        return i % 2 == 0;
    }
    
    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive. The value can be positive, negative, or zero.
    *
    * @param number upper bound
    * @return sum of the even numbers between 0 and number
    */
    public int sumOfEvens(int number) {
        int total = 0;
        if (number == 0) { 
            total = 0; 
        }
        while (number % 2 == 0 && number != 0) {
            total = total + number;
            if (number < 0) {
                number = number + 2; 
            } else  {
                number = number - 2;
            }             
        }
        return total;
    }

}
