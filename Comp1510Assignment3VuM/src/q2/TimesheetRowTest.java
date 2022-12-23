package q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.fail;
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
    
    private static float[] dayHoursList = {3.2F, 1.1F, 4.5F, 5.5F, 3.2F, 2.0F, 5.0F};
    
    private TimesheetRow row = new TimesheetRow(1, "project1", dayHoursList);
    
    @Test
    void testTimesheetRow() {
        TimesheetRow row2 = new TimesheetRow();
        assertEquals(0, row2.getProject());      
    }

    @Test
    void testTimesheetRowIntStringFloatArray() {
//        TimesheetRow row = new TimesheetRow(0, "project0", dayHoursList);
        assertEquals(3.2, row.getHour(0), 0.000001);
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
        assertEquals(3.2, row.getHour(0), 0.000001);
        assertEquals(4.5, row.getHour(2), 0.000001);
        assertThrows(IllegalArgumentException.class, () -> {
            row.getHour(8);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            row.getHour(-1);
        });
    }

    @Test
    void testSetHour() {
        row.setHour(2,1.1f);
        assertEquals(1.1, row.getHour(2), 0.00001);
        assertTrue(14095877430512416L == row.getHours());
        assertThrows(IllegalArgumentException.class, () -> {
            row.setHour(8, 1.1f);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            row.setHour(-1, 1.1f);
        });
    }

    @Test
    void testToString() {
        String s = "Project: 1\t"
                + "Work Package: project1\t"
                + "Saturday: 3.2\t"
                + "Sunday: 1.1\t"
                + "Monday: 4.5\t"
                + "Tuesday: 5.5\t"
                + "Wednesday: 3.2\t"
                + "Thursday: 2.0\t"
                + "Friday: 5.0\t\n";             
        assertEquals(s, row.toString());
    }
    @Test
    void testToString2() {
        TimesheetRow row2 = new TimesheetRow();
        String s = "Project: 0\t"
                + "Work Package: null\t"
                + "Saturday: 0.0\t"
                + "Sunday: 0.0\t"
                + "Monday: 0.0\t"
                + "Tuesday: 0.0\t"
                + "Wednesday: 0.0\t"
                + "Thursday: 0.0\t"
                + "Friday: 0.0\t\n";             
        assertEquals(s, row2.toString());
    }
}
