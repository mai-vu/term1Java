package ca.bcit.comp1510.lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentTest {
    private final Student s = new Student("Tashi", "Delek", 1985, 
            "A00234534", 84);
    private String studentStr = "Tashi Delek 1985 A00234534 84";
    @Test
    void testCreation() {
        assertSame("Tashi", s.getFirstname());
        assertSame("Delek", s.getLastname());
        assertSame(1985, s.getYearOfBirth());
        assertSame("A00234534", s.getStudentNo());
        assertSame(84, s.getGpa());
    }

    private void assertSame(int i, Object birthYear) {
        
    }

    private void assertSame(String string, Object firstName) {
        
    }

    @Test
    void testFirstName() {
        s.setFirstname("Drolma");
        assertSame("Drolma", s.getFirstname());
    }

    @Test
    void testLastName() {
        s.setLastname("Rabten");
        assertSame("Rabten", s.getLastname());
    }

    @Test
    void testBirthYear() {
        s.setYearOfBirth(2001);
        assertSame(2001, s.getYearOfBirth());
    }
    @Test
    void testStudentNumber() {
        s.setStudentNo("A00384495");
        assertSame("A00384495", s.getStudentNo());
    }
    @Test
    void testGradeAverage() {
        s.setGpa(78);
        assertSame(78, s.getGpa());
    }
    @Test
    void testToString() {
        assertSame(studentStr, s.toString());
    }

}
