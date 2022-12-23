package p3;

/** Represent item object.
 * @author Mai Vu
 * @version 1.0
 */
public class Item {
    
    
    //final keyword to remind us that our class remains immutable
    /** item name. */
    private final String name;
    
    /** price of item. */
    private final double price;
    
    /** Quantity of items purchased. */
    private final int quantity;
    
    /** Constructor for item object defines by name, price and quantity. 
     * @param name item name
     * @param price item price
     * @param quantity quantity of item being purchased*/
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /** Constructor for item object defines by name, price and quantity =1. 
    * @param name item name
    * @param price item price
    * */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /** Name getter.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** Price getter.
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /** quantity getter.
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item name: " + name + ", price: " + price 
                + ", quantity: " + quantity;
    }
    
    
    

}
