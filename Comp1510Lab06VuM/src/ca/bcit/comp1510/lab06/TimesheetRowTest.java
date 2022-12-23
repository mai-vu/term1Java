package ca.bcit.comp1510.lab06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
class TimesheetRowTest {
    
    private static float[] dayHoursList = {32, 11, 45, 55, 32, 20, 50};
    
    private TimesheetRow row = new TimesheetRow(1, "project1", dayHoursList);
    
    @Test
    void testTimesheetRow() {
        TimesheetRow row2 = new TimesheetRow();
        assertEquals(0, row2.getProject());      
    }

    @Test
    void testTimesheetRowIntStringFloatArray() {
//        TimesheetRow row = new TimesheetRow(0, "project0", dayHoursList);
        assertEquals(32, row.getHour(0));
    }

    @Test
    void testGetProject() {
        assertEquals(1, row.getProject());
    }

    @Test
    void testSetProject() {
        row.setProject(2);
        assertEquals(2, row.getProject());
    }

    @Test
    void testGetWorkPackage() {
        assertEquals("project1", row.getWorkPackage());
    }

    @Test
    void testSetWorkPackage() {
        row.setWorkPackage("test");
        assertEquals("test", row.getWorkPackage());
    }

    @Test
    void testGetHours() {
        assertTrue(14095877432740640L == row.getHours());
    }

    @Test
    void testSetHours() {
        row.setHours(1235);
        assertEquals(1235, row.getHours());
    }

    @Test
    void testGetHour() {
        assertEquals(32, row.getHour(0));
        assertEquals(45, row.getHour(2));
        assertThrows(IllegalArgumentException.class, () -> {
            row.getHour('y');
        });
        assertThrows(IllegalArgumentException.class, () -> {
            row.getHour(-1);
        });
    }

    @Test
    void testSetHour() {
        row.setHour(2,11);
        assertEquals(11, row.getHour(2));
        assertTrue(14095877430512416L == row.getHours());
        assertThrows(IllegalArgumentException.class, () -> {
            row.setHour(8, 11);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            row.setHour(-1, 11);
        });
    }

    @Test
    void testToString() {
        String s = "Project: 1\n"
                + "Work Package: project1\n"
                + "Saturday: 3.2 hours charged\n"
                + "Sunday: 1.1 hours charged\n"
                + "Monday: 4.5 hours charged\n"
                + "Tuesday: 5.5 hours charged\n"
                + "Wednesday: 3.2 hours charged\n"
                + "Thursday: 2.0 hours charged\n"
                + "Friday: 5.0 hours charged\n";             
        assertEquals(s, row.toString());
    }
    @Test
    void testToString2() {
        TimesheetRow row2 = new TimesheetRow();
        String s = "Project: 0\n"
                + "Work Package: null\n"
                + "Saturday: 0.0 hours charged\n"
                + "Sunday: 0.0 hours charged\n"
                + "Monday: 0.0 hours charged\n"
                + "Tuesday: 0.0 hours charged\n"
                + "Wednesday: 0.0 hours charged\n"
                + "Thursday: 0.0 hours charged\n"
                + "Friday: 0.0 hours charged\n"
                + "";             
        assertEquals(s, row2.toString());
    }
}