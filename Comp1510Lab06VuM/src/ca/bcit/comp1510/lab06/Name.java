package ca.bcit.comp1510.lab06;


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
        if (first.isBlank() || first.isEmpty()) {
            firstName = "jane";
        } else { 
            firstName = first.trim();
            firstName = firstName.substring(0, 1).toUpperCase() 
                + firstName.substring(1, firstName.length()).toLowerCase();   
        }
        if (middle.isBlank() || middle.isEmpty()) {
            middleName = "jane";
        } else { 
            middleName = middle.trim();
            middleName = middleName.substring(0, 1).toUpperCase() 
                + middleName.substring(1, middleName.length()).toLowerCase();   
        }
        if (last.isBlank() || last.isEmpty()) {
            lastName = "jane";
        } else { 
            lastName = last.trim();
            lastName = lastName.substring(0, 1).toUpperCase() 
                + lastName.substring(1, lastName.length()).toLowerCase(); 
        }
        
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
        String initial = firstName.trim().substring(0, 1).toUpperCase() 
                + middleName.trim().substring(0, 1).toUpperCase() 
                + lastName.trim().substring(0, 1).toUpperCase(); 
        return initial;
    }
    
    /** Extract nth character from the name.
     * @param n nth character
     */
    public void nchar(int n) {
        String str = "" + firstName + middleName + lastName;
        if (n > namelength()) {
            System.out.println("@");
        } else {
            String nchar;
            nchar = str.substring(n - 1, n);
            System.out.println("" + nchar);
        }
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
        if (first.isBlank() || first.isEmpty()) {
            return;
        } else {
            firstName = first.trim();
            firstName = firstName.substring(0, 1).toUpperCase() 
                + firstName.substring(1, firstName.length()).toLowerCase();
        }
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
        if (middle.isBlank() || middle.isEmpty()) {
            return;
        } else {
            middleName = middle.trim();
            middleName = middleName.substring(0, 1).toUpperCase() 
                + middleName.substring(1, middleName.length()).toLowerCase();
        }
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
        if (last.isBlank() || last.isEmpty()) {
            return;
        } else {
            lastName = last.trim();
            lastName = lastName.substring(0, 1).toUpperCase() 
                + lastName.substring(1, lastName.length()).toLowerCase();
        }
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
    
    

