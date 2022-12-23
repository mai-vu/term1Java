package p1;

import java.util.Random;

/** Test CatHotel and Cat program.
 * @author Mai Vu
 * @version 2022
 *
 */
public class CatHotelDriver {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        CatHotel catHotel = new CatHotel("catHotel1");
        Random gen = new Random();
        Cat cat1 = new Cat("Daijo", gen.nextInt(2 + 2 + 2));
        Cat cat2 = new Cat("Kiwi", gen.nextInt(0 - 2, 0));
        Cat cat3 = new Cat(gen.nextInt(2));
        catHotel.addCat(cat1);
        catHotel.printGuestsList();
        catHotel.removeAllGuests();
        catHotel.printGuestsList();
        catHotel.addCat(cat1);
        catHotel.addCat(cat2);
        catHotel.addCat(cat3);
        catHotel.printGuestsList();
        System.out.println("Removed: " + catHotel.removeOldGuests(2) + " cats");
        catHotel.printGuestsList();

    }

}
