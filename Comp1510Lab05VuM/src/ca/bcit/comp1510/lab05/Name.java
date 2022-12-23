package ca.bcit.comp1510.lab05;


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
    
    /** name length-sum of 3 parts of the name. 
     * @return name length
     */
    public int namelength() {
        int namelength = firstName.length() + middleName.length() 
             + lastName.length();
        return namelength;
    }
    
    /** Produce 3 initials of 3 parts of the name.
     * 
     * @return initial
     */
    public String initial() {
        String initial = firstName.substring(0, 1).toUpperCase() 
                + middleName.substring(0, 1).toUpperCase() 
                + lastName.substring(0, 1).toUpperCase(); 
        return initial;
    }
    
    /** Extract nth character from the name.
     * @param n nth character
     * @return character
     */
    public String nchar(int n) {
        String str = "" + firstName + middleName + lastName;
        String nchar;
        nchar = str.substring(n - 1, n);
        return nchar;
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
        return (lastName + ", " + firstName + " " + middleName);
    }
    
    /** Compare a word to the first name.
     * @param str word to match 1st name
     * @return true or false
     */    
    public boolean compare1stname(String str) {
        return firstName.equals(str);     
    }
    
    /** method to compare 3 parts of 2 names. 
     * @param obj name
     * @return true if same name
     * */  
    public boolean compare(Name obj) {
        return (this.firstName.equals(obj.getFirst())
            && this.middleName.equals(obj.getMiddle())
            && this.lastName.equals(obj.getLast()));
    }
}
    
    

