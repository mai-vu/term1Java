package p3;

/** Transaction object.
 * @author Mai Vu
 * @version 1.0
 */
public class Transaction {
    
    /** cart contains an array of item objects. */
    private Item[] cart;
    
    /** total price of items in cart. */
    private double totalPrice;
    
    /** Count of items. */
    private int itemCount;
    
    
    /** Constructor for Transaction object defines by how many item objects 
     * and has total price and item count start at 0. 
     * @param i Item array length*/
    public Transaction(int i) {
        this.cart = new Item[i];
        this.totalPrice = 0;
        this.itemCount = 0;
    }
    
    
    /** accepts item name, price and quantity as parameters, 
     * creates an Item with them, and adds the Item to the cart. 
     * @param itemName item name
     * @param price item price
     * @param quantity quantity of item purchased*/
    public void addToCart(String itemName, double price, int quantity) {
        if (this.cart[cart.length - 1] != null) {
            this.increaseSize();
        }
        Item item = new Item(itemName, price, quantity);
        this.cart[itemCount] = item;
        this.totalPrice += price * quantity;
        this.itemCount += quantity;
    }
    
    
    /**  accept item objects and adds to the cart. 
     * @param item item object*/
    public void addToCart(Item item) {
        if (this.cart[cart.length - 1] != null) {
            this.increaseSize();
        }
        this.cart[itemCount] = item;
        this.totalPrice += item.getPrice() * item.getQuantity();
        this.itemCount += item.getQuantity();
    }
    
    /** increase size of cart by 3 if full. */
    public void increaseSize() {
        final int increaseSize = 3;
        Item[] temp = new Item[cart.length + increaseSize];
        for (int item = 0; item < cart.length; item++) {
            temp[item] = cart[item];
        }
        this.cart = temp;
    }
    
    /**  gets cart's total price. 
     * @return total price of cart*/
    public double getTotalPrice() {
        return this.totalPrice;    
    }
    
    /** get total of items in cart. 
     * @return total number of items in cart. */
    public int getCount() {
        return this.itemCount;    
    }

    @Override
    public String toString() {
        String s = "Cart:\n";
        int i = 0;
        while (i < this.cart.length && cart[i] != null) {
            s += this.cart[i] + "\n";
            i++;
        }
        s += "totalPrice: " + this.getTotalPrice() 
            + "\nitemCount: " + this.getCount();
        return s;
    }
    
    
    
    

}
