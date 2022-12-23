package q2;

import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Timesheet {

    /** Employee Number. */
    private String empNum;
    
    /** End of week date. */
    private LocalDate endWeek;
    
    /** list of TimeSheetRow objects. */
    private List<TimesheetRow> details = new ArrayList<TimesheetRow>();
    
    /** Constructor for Timesheet object with no argument. */
    public Timesheet() {
        this.empNum = null;
        this.endWeek = null;
        this.details = new ArrayList<TimesheetRow>();
    }
    
    /** constructor and one which takes empNum and endWeek.
     * the constructor must adjust the end date to be a Friday (null is OK). 
     * @param empNum employee number
     * @param endWeek end of week date
     */
    public Timesheet(String empNum, LocalDate endWeek) {
        final int fridayOrd = 5;
        this.empNum = empNum;
        this.details = new ArrayList<TimesheetRow>();
        if (endWeek == null) {
            this.endWeek = null;
        } else if (endWeek.getDayOfWeek().equals(DayOfWeek.of(fridayOrd))) {
            this.endWeek = endWeek;          
        } else {
            this.endWeek = endWeek.with(TemporalAdjusters.
                    next(DayOfWeek.FRIDAY));      
        }
    }
       
    /** Employee Number getter.
     * @return the empNum
     */
    public String getEmpNum() {
        return this.empNum;
    }
    
    /** Employee Number setter.
     * @param empNum the empNum to set
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }
    
    /** End of week date getter.
     * @return the endWeek
     */
    public LocalDate getEndWeek() {
        return this.endWeek;
    }
    
    /** End of week setter.
     * @param endWeek the endWeek to set
     */
    public void setEndWeek(LocalDate endWeek) throws IllegalArgumentException {
        final int fridayOrd = 5;
        if (endWeek.getDayOfWeek().equals(DayOfWeek.of(fridayOrd))) {
            this.endWeek = endWeek;
        } else {
            throw new IllegalArgumentException("This date is not a Friday");
        }
    }
    
    @Override
    public String toString() {
        String s;
        s = "Timesheet Employee Number: " + empNum 
                + ", end of week: " + endWeek + "\n";
        for (int i = 0; i < this.details.size(); i++) {
            s += this.details.get(i);
        }
        return s;
    }
    
    /** takes a time sheet row and adds it to the end of the list.
     * @param row TimesheetRow object */
    public void addRow(TimesheetRow row) {
        this.details.add(row);
    }
    
    /** Time Sheet Row details getter.
     * @return the details
     */
    public List<TimesheetRow> getDetails() {
        return this.details;
    }
    
    /**  Time Sheet Row details setter.
     * @param details the details to set
     */
    public void setDetails(List<TimesheetRow> details) {
        this.details = details;
    }

    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Timesheet ts = new Timesheet("A01325686", LocalDate.now()); 
        
        final float[] dayHoursList = {3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f};
        TimesheetRow r1 = new TimesheetRow(0, "project0", dayHoursList);
        TimesheetRow r2 = new TimesheetRow();
        TimesheetRow r3 = new TimesheetRow();
        ts.addRow(r1);
        ts.addRow(r2);
        ts.addRow(r3);
        
        Timesheet ts1 = new Timesheet(); 
        ts1.addRow(r1);
        ts1.addRow(r2);
        ts1.addRow(r3);
        
        System.out.println(ts.toString());
        
        System.out.println(ts1.toString());


        System.out.println("Question two was called and ran sucessfully.");
    }

   
    
}
