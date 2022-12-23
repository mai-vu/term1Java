package ca.bcit.comp1510.lab04;

/** Class to represent Name concepts.
 * @author Mai Vu
 * @version 2022
 */
public class Name {
    /** first name.*/
    private String firstName;
    /** middle name.*/
    
    private String middleName;
    /** last name.*/
    
    private String lastName;
    
    /**
    * Constructs a Name object by defining its first, middle and last.
    * @param first for first name
    * @param middle for middle name
    * @param last for last name
    */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    /** Getter 1st name.
     * @return first name
     */
    
    public String getFirst() {
        return firstName;
    }

    /** Setter for first name.
     * @param first name
     */
    public void setFirst(String first) {
        this.firstName = first;
        firstName = firstName.substring(0, 1).toUpperCase() 
                + firstName.substring(1, firstName.length()).toLowerCase();
    }
    /** Getter middle name. 
     * @return middle name
     */
    
    public String getMiddle() {
        return middleName;
    }

    /** Setter for middle name.
     * @param middle name
     */
    public void setMiddle(String middle) {
        this.middleName = middle;
        middleName = middleName.substring(0, 1).toUpperCase() 
                + middleName.substring(1, middleName.length()).toLowerCase();
    }
    /** Getter last name. 
     * @return last name
     */
    
    public String getLast() {
        return lastName;
    }

    /** Setter for last name.
     * @param last name
     */
    public void setLast(String last) {
        this.lastName = last;
        lastName = lastName.substring(0, 1).toUpperCase() 
                + lastName.substring(1, lastName.length()).toLowerCase();
    }
    
    /** Returns full name.
     * 
     * @return full name
     */
    
    public String toString() {
        return (firstName + " " + middleName + " " + lastName);
    }
}
