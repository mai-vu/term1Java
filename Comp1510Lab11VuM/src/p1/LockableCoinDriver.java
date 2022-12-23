package p1;

/**  demonstrate how a locked Coin cannot be used.
 * @author Mai Vu
 * @version 1.0
 */
public class LockableCoinDriver {

    /** Drives the program.
     * @param args used
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("Coin is locked: " + coin.locked());
        System.out.println(coin.toString());
        coin.setKey(1);
        coin.lock(1);
        System.out.println("Coin is locked: " + coin.locked());
        coin.flip();
        coin.unlock(1);
        System.out.println("Coin is locked: " + coin.locked());
        System.out.println(coin.toString());
        

    }

}
