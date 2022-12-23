package q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;




/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TimesheetTest {
    
    
    private Timesheet ts = new Timesheet("A01325686", LocalDate.of(2022,11,26));
    
    @Test
    void testTimesheet() {
        Timesheet ts1 = new Timesheet();     
        assertNull(ts1.getEndWeek()); 
    }

    @Test
    void testTimesheetStringLocalDate() {
        Timesheet ts1 = new Timesheet("A01325686", LocalDate.of(2022,11,25));     
        assertEquals(LocalDate.of(2022, 11, 25), ts1.getEndWeek());
        Timesheet ts3 = new Timesheet("A01325686", null);     
        assertNull(ts3.getEndWeek()); 
        Timesheet ts = new Timesheet("A01325686", LocalDate.of(2022,11,26));
        assertEquals(LocalDate.of(2022, 12, 2), ts.getEndWeek());
    }

    @Test
    void testGetEmpNum() {
        assertEquals("A01325686", ts.getEmpNum());
    }

    @Test
    void testSetEmpNum() {
        ts.setEmpNum("123");
        assertEquals("123", ts.getEmpNum());
    }

    @Test
    void testGetEndWeek() {
        Timesheet ts1 = new Timesheet("A01325686", LocalDate.of(2022,11,25));     
        assertEquals(LocalDate.of(2022, 11, 25), ts1.getEndWeek());
    }

    @Test
    void testSetEndWeek() {
        ts.setEndWeek(LocalDate.of(2022,12,9));
        assertEquals(LocalDate.of(2022, 12,9), ts.getEndWeek());
        assertThrows(IllegalArgumentException.class, () -> {
            ts.setEndWeek(LocalDate.of(2022,12,8));
        });       
    }

    @Test
    void testToString() {
        final float[] dayHoursList = {3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f};
        TimesheetRow r1 = new TimesheetRow(0, "project0", dayHoursList);
        ts.addRow(r1);
        String s = "Timesheet Employee Number: A01325686, end of week: 2022-12-02\n"
                + "Project: 0\t"
                + "Work Package: project0\t"
                + "Saturday: 3.2\t"
                + "Sunday: 1.1\t"
                + "Monday: 4.5\t"
                + "Tuesday: 5.5\t"
                + "Wednesday: 3.2\t"
                + "Thursday: 2.0\t"
                + "Friday: 5.0\t\n";
        assertEquals(s, ts.toString());
    }

    @Test
    void testAddRow() {
        TimesheetRow row = new TimesheetRow();
        ts.addRow(row);
        assertTrue(1==ts.getDetails().size());        
    }

    @Test
    void testGetDetails() {
        TimesheetRow row = new TimesheetRow();
        ts.addRow(row);
        assertEquals(row, ts.getDetails().get(0));
    }

    @Test
    void testSetDetails() {
        List<TimesheetRow> newDetails = new ArrayList<TimesheetRow>();
        ts.setDetails(newDetails);
        assertTrue(newDetails==ts.getDetails());
    }

}
