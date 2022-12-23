package p2;

import java.util.Scanner;

/** Reverse an array.
 * @author Mai Vu
 * @version 1.0
 */
public class ReverseArray {

    /** Drives the program.
     * @param args used
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = 0;
        while (arrLength <= 0) {
            System.out.println("Enter an integer > 0: ");
            arrLength = sc.nextInt();
        }       
        int[] arr = new int[arrLength];
        System.out.println("Enter " + arrLength + " integer: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        swap(arr);
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        
    }
    
    private static int[] swap(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;        
    }

}
