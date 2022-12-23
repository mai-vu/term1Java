package q3;

import java.util.Scanner;

/**
 * This program calculates the discount %, which is the sum of 
 * customer's cheeses purchased and their referrals, 
 * but can not exceed 75% max discount.
 *
 * @author Mai Vu
 * @version 1.0
 */
public class DiscountCalculator {  

    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int maxDiscount = 75;
        Scanner scan = new Scanner(System.in);
        System.out.println("The number of cheeses that customer purchased: ");
        int numberOfCheese = scan.nextInt();
        System.out.println("The number of referrals: ");
        int referrals = scan.nextInt();
        int discount = numberOfCheese + referrals;
        System.out.println("The value of discount: " 
            + Math.min(maxDiscount, discount) + "%");
        System.out.println("Question three was called and ran sucessfully.");
        scan.close();
    }

}
