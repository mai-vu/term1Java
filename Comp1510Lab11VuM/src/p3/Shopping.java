package p3;

import java.util.Scanner;

/** Simulates part of POS system.
 * @author Mai Vu
 * @version 1.0
 *
 */
public class Shopping {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {     
        Transaction t = new Transaction(2);
        Item item = new Item("book", 2);
        t.addToCart(item);
        System.out.println(t.toString());
        while (true) {   
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Buy an item: ");
            String name = sc.nextLine();
            System.out.println("item price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            t.addToCart(name, price, quantity);
            System.out.println(t.toString());
        }

    }

}
