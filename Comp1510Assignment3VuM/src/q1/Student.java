package q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** test no.1 score of this student. */ 
    private double test1Score;
     
    /** test no.2 score of this student. */ 
    private double test2Score;
    
    /** test no.3 score of this student. */ 
    private double test3Score;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param test1Score score of test 1
     * @param test2Score score of test 2
     * @param test3Score score of test 3
     */
    public Student(String first, String last, Address home, Address school, 
            double test1Score, double test2Score, double test3Score) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.test1Score = test1Score;
        this.test2Score = test2Score;
        this.test3Score = test3Score;
    }
    
    /**
     * Constructs a Student object with an empty parameter 
     * that would set all 3 test scores to 0.
     */
    public Student() {
        test1Score = 0;
        test2Score = 0;
        test3Score = 0;
    }
    
    /** Return the test score of the test number in the parameter, 
     * only valid for no 1, 2, and 3.
     * @param testNo test Number
     * @return test Score of the test number 
     */
    public double getTestScore(int testNo) {
        final int testNo3 = 3;
        double testScore;
        switch (testNo) {
            case 1:
                testScore = test1Score;
                break;
            case 2:
                testScore = test2Score;
                break;
            case testNo3:
                testScore = test3Score;
                break;
            default:
                throw new IllegalArgumentException("only 1, 2, 3 are" 
                     + " valid test number");
        }
        return testScore;
    }
    
    /** Calculate student's average from 3 test scores. 
     * @return average score*/
    public double average() {
        final int numOfTest = 3;
        double avg = (test1Score + test2Score + test3Score) / numOfTest;
        return avg;      
    }

    /**
     * Returns a String description of this Student object 
     * with 3 test scores and the average.
     * @return description a String
     */
    public String toString() {
        String result;
        

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress  + "\n";
        result += "Test 1 Score: " + test1Score + "\n";
        result += "Test 2 Score: " + test2Score + "\n";
        result += "Test 3 Score: " + test3Score + "\n";
        result += "Test Average Score: " + average() + "\n";
        
        return result;
    }
}

