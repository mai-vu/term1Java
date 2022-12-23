package ca.bcit.comp1510.lab04;

/** Represent student concept. 
 * @author  Mai Vu
 * @version 2022
 */

public class Student {
    /** first name of student.*/
    private String firstname;
    
    /** last name of student.*/
    
    private String lastname;
    /** Students' birth year. */
    
    private int yearOfBirth;
    
    /** Student number. */
    
    private String studentNo;
    
    /** student's GPA. */
    
    private double gpa; 
    /** Student constructor.
     * @param string2 last name
     * @param string first name
     * @param i birth year
     * @param string3 student number
     * @param j GPA*/
    
    public Student(String string, String string2, 
            int i, String string3, int j) {
    }

    /** Getter first name.
     * @return first name
     */
    public String getFirstname() {
        return firstname;
    }

    /** Setter for first name.
     * @param firstname first name
     */

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /** Last name getter.
     * @return last name
     */

    public String getLastname() {
        return lastname;
    }
    /** Last name setter.
     * @param lastname last name
     */

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /** Student's birth year getter. 
     * @return year of birth
     */

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /** Student's birth year setter. 
     * @param yearOfBirth year of birth
     */

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /** Student's birth year getter. 
     * @return year of birth
     */

    public String getStudentNo() {
        return studentNo;
    }

    /** Student's number setter.
    *
    * @param string student number
    */

    public void setStudentNo(String string) {
        this.studentNo = string;
    }

    /** student's GPA getter.
     * 
     * @return gpa 
    */

    public double getGpa() {
        return gpa;
    }

    /** students's GPA setter.
     * 
     * @param gpa Grade Point Average
     */

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    /** Return Student string.
     * @return Student info*/
    
    public String toString() {
        return (firstname + " " + lastname + " " + yearOfBirth + " " 
                + studentNo + " " + gpa);
    }

}
