package tomas.ochoa;
/**
 * Class for date
 *
 * */

public class Date
{
// Instance Variables
    private int month;
    private int day;
    private int year;

//--------------------------------- Constructors -----------------------------------
    // Default (no arg)
    public Date()
    {
        month = 1;
        day = 1;
        year = 1000;
    }
    // 3 arg constructor
    public Date(int aMonth,int aDay,int aYear)
    {
        month = aMonth;
        day = aDay;
        year = aYear;
    }
//--------------------------------- Mutators -----------------------------------
    // To set the month
    public void setMonth(int aMonth)
    {
        this.month = aMonth;
    }
    // To set the day
    public void setDay(int aDay)
    {
        this.day = aDay;
    }
    // To set the year
    public void setYear(int aYear)
    {
        this.year = aYear;
    }
//--------------------------------- Accessors -----------------------------------
    // To set the month
    public int getMonth()
    {
        return this.month;
    }
    // To set the day
    public int getDay()
    {
        return this.day;
    }
    // To set the year
    public int getYear()
    {
        return this.year;
    }
//---------------------------------- Helpers ------------------------------------
    // Helper to check if the year is a leap year or not
    private boolean leapYear(int yearInt)
    {
        return ((yearInt % 4 == 0) && (yearInt % 100 != 0)) || (yearInt % 400 == 0);
    }

    // Helper method to see if the month is ok
    // Check if valid month int
    public boolean monthOK()
    {
        if(month >= 1 && month <=12)
            return true;
        else
            return false;
    }
    // Helper method to see if the day is ok
    // Check valid day int
    public boolean dayOK()
    {
        // For months with 31
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day >= 1 && day <= 31))
            return true;
        // For months with 30
        else if((month == 4 || month == 6 || month == 5 || month == 9 || month == 11) && (day >= 1 && day <= 30))
            return true;
        // For february (not leap year)
        else if(month == 2 && (day >= 1 && day <= 28))
            return true;
        else if(month == 2 && (day >= 1 && day <= 29) && (leapYear(year)))
            return true;
        else
            return false;
    }
    // Helper method to check if year is ok
    public boolean yearOK()
    {
        if(year >= 1000 && year <= 3000)
            return true;
        else
            return false;

    }
    // Helper to verify month
    public void verifyMonth() throws MonthException
    {
        if(!monthOK())
            throw new MonthException();
    }
    // Helper to verify day
    public void verifyDay() throws DayException
    {
        if(!dayOK())
            throw new DayException();
    }
    // Helper to verify year
    public void verifyYear() throws YearException
    {
        if (!yearOK())
            throw new YearException();
    }
    // Helper to print to string
    public String toString()
    {
        // Set strMonth to appropriate month
        if(month == 1)
            return ("January " + day + ", " + year);
        else if(month == 2)
            return ("February " + day + ", " + year);
        else if(month == 3)
            return ("March " + day + ", " + year);
        else if(month == 4)
            return ("April " + day + ", " + year);
        else if(month == 5)
            return ("May " + day + ", " + year);
        else if(month == 6)
            return ("June " + day + ", " + year);
        else if(month == 7)
            return ("July " + day + ", " + year);
        else if(month == 8)
            return ("August " + day + ", " + year);
        else if(month == 9)
            return ("September " + day + ", " + year);
        else if(month == 10)
            return ("October " + day + ", " + year);
        else if(month == 11)
            return ("November " + day + ", " + year);
        else if(month == 12)
            return ("December " + day + ", " + year);
        else
            return "Error";

    }
}
