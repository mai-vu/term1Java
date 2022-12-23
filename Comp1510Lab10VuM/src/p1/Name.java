package p1;

/** Name objects defines by first, last and middle name.
 * @author Mai Vu
 * @version 1.0
 *
 */
public class Name implements Comparable<Name> {
    /** First Name.  */
    private final String first;
    
    /** middle name. */
    private final String middle;
    
    /** last name. */
    private final String last;
    
    /** Constructor for name object, defines by it's first, last and middle. 
     * @param first First Name
     * @param middle middle name
     * @param last last name
     */
    public Name(String first, String middle, String last) {
        if (!first.isBlank() && !last.isBlank() 
                && !first.isEmpty() && !last.isEmpty()) {
            this.first = first;
            this.middle = middle;
            this.last = last;
        } else {
            throw new IllegalArgumentException();
        }
        
    }
    
    
    /** Constructor for name object, defines by it's first, last name. 
     * @param first First Name
     * @param last last name
     */
    public Name(String first, String last) {
        if (!first.isBlank() && !last.isBlank() 
                && !first.isEmpty() && !last.isEmpty()) {
            this.first = first;
            this.middle = null;
            this.last = last;
        } else {
            throw new IllegalArgumentException();
        }
        
    }

    /** First name getter.
     * @return the first
     */
    public String getFirst() {
        return first;
    }

    /** Middle name getter.
     * @return the middle
     */
    public String getMiddle() {
        return middle;
    }

    /** Last name getter.
     * @return the last
     */
    public String getLast() {
        return last;
    }

    @Override
    public int compareTo(Name name) {
        int i;
        if (this.last.compareTo(name.getLast()) == 0) {
            if (this.first.compareTo(name.getFirst()) == 0) {
                if (this.middle == null && name.getMiddle() != null) {
                    i = 1;
                } else if (this.middle == null && name.getMiddle() == null) {
                    i = 0;
                } else if (this.middle != null && name.getMiddle() == null) {
                    i = -1;
                } else {
                    i = this.middle.compareTo(name.getMiddle());
                }              
            } else { 
                i = this.first.compareTo(name.getFirst());
            }
        } else {
            i = this.last.compareTo(name.getLast());
        }
        return i;
    }


    @Override
    public String toString() {
        if (middle != null) {
            return "" + last + ", " + first + " " + middle;
        } else {
            return "" + last + ", " + first;
        }
    }
}
