package ca.bcit.comp1510.lab08;

import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * @author Mai Vu
 * @version 2022
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    public Date(int theDay, int theMonth, int theYear) {
        if (isDateValid(theDay, theMonth, theYear)) {
            this.day = theDay;
            this.month = theMonth;
            this.year = theYear;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    } 
    
    public static boolean isMonthValid(int m) {
        return (m >=1 && m <=12);
    }
    
    public static boolean isYearValid(int year) {
        return (year >=1582 && year <= 2999);
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 400 ==0 || (year % 4 ==0 && year % 100 !=0));
    }
    
    public static int daysInMonth(int month, boolean isLeapYear) {
        int days = 0;
        if (isMonthValid(month)) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else if (month == 2) {
                if (isLeapYear) {
                    days = 29;
                } else
                    days = 28;
            } else
                days = 31;
        } else days = 0;
        return days;
    }
    
    public static boolean isDateValid(int day, int month, int year) {
        boolean b = false;
        if (isMonthValid(month) && isYearValid(year) && day >=1 
                && day <= daysInMonth(month, isLeapYear(year))) {
            if (year == 1582 && month == 1 ) {
                b = false;
            } else if (year == 1582 && month == 2 && day >= 24) {
                b = true;
            }else if (year == 1582 && month == 2) {
                b = false;
            } else {
                b = true;
            }
        } else b = false;
        return b;
    }
    
    public static void main(String[] args) { 
        //date read in from user
        int month;
        int day;
        int year;
        //true if parts of input from user is valid
        boolean monthValid;
        boolean yearValid;
        boolean dayValid = false;  
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day month year seperate by space: ");

        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();
        scan.close();
        monthValid = isMonthValid(month);
        yearValid = isYearValid(year);
        leapYear = isLeapYear(year);  
        if (isDateValid(day, month, year)) {
           dayValid = true;
        }     
        if (monthValid) {
            daysInMonth = daysInMonth(month, leapYear);
        } else daysInMonth = 0;
        System.out.println("Number of days in month: " + daysInMonth);
        if (dayValid) {
            System.out.println("Date is valid in Gregorian calendar");
            System.out.println("Leap year: " + leapYear);        
        } else {
            System.out.println("Date is not valid in Gregorian calendar");
        }
        Date date = new Date(day, month, year);
        //By using the constructor to create a Date object, we can skip all 
        //statements above as isDateValid method will go through all conditions.
        
    }
} 
