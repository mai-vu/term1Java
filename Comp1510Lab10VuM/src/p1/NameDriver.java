package p1;

import java.util.ArrayList;
import java.util.Collections;

/** Run the Name program. 
 * @author Mai Vu
 * @version 1.0 
 */
public class NameDriver {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Name name1 = new Name("Joe", "Smith");
        Name name2 = new Name("Jon", "Snyder");
        Name name3 = new Name("Jon", "Gregory", "Snyder");
        Name name4 = new Name("Joey", "Smash");
        Name name5 = new Name("Ralph", "Green");
        ArrayList<Name> names = new ArrayList<Name>();
        names.add(name5);
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);    
        Collections.sort(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

}
