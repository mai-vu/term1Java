package q1;

import java.util.ArrayList;

/** Represents Course.
 * @author Mai Vu
 * @version 1.0 
 */
public class Course {
    
    /** course maximum capacity. */
    public static final int MAX_CAPACITY = 5;
    
    /** Name of the course. */
    private String courseName;
    
    /** List of Students enrolled in course. */
    private ArrayList<Student> studentList;
    
    /** Constructs a Course object defined by it's name. 
     * @param courseName Name of the course
     */
    public Course(String courseName) {
        this.courseName = courseName;  
        this.studentList =  new ArrayList<Student>();
    }
    
    /** Course name getter.
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /** add students to the course, maximum 5 per course. 
     * @param student student object
     */
    public void addStudent(Student student) {
        if (studentList.size() < MAX_CAPACITY) {
            studentList.add(student);
        } else {
            throw new IllegalArgumentException(
                    "student list has reached max capacity of 5");
        }
    }
    
    /** Calculate the average of all students' average.
     * @return Students' average*/
    public double average() {
        double totalAverage = 0;
        double totalScore = 0;
        int i = 0;
        while (i < studentList.size()) {
            totalScore = totalScore + studentList.get(i).average();
            i++;
        }
        totalAverage = totalScore / studentList.size();
        return totalAverage;       
    }
    
    /** Prints all students and class average. */
    public void roll() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("Class average of:" + courseName + " " + average());
    }  
}
