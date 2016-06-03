package tomas.ochoa;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
   Write a program that converts dates from numerical month/day/year format to normal “month day, year” format
 (for example, 12/25/2000 corresponds to December 25, 2000). You will define three exception classes, one called
 MonthException, another called DayException, and a third called YearException. If the user enters anything other
 than a legal month number (integers from 1 to 12), your program will throw and catch a MonthException and ask
 the user to reenter the month.

 Similarly, if the user enters anything other th an a valid day number (integers from 1 to
 either 28, 29, 30, or 31, depending on the month and year), then your program will
 throw and catch a DayException and ask the user to reenter the day. If the user enters
 a year that is not in the range 1000 to 3000 (inclusive), then your program will throw
 and catch a YearException and ask the user to reenter the year. (There is nothing
 very special about the numbers 1000 and 3000 other than giving a good range of likely
 dates.) See Self-Test Exercise 19 in Chapter 4 for details on leap years.

 NOTES:

 - a program that converts the numerical month/date/year to string
    ie 12/25/2000 => December 25, 2000
 - Three exception classes
    - MonthException
    - DayException
    - YearException

 - If user enters anything than 1-12
    - MonthException thrown
    - Ask user to reenter the month

 - If user enters anything than 1-28,29,30,31 (Depending on month and year [leap year])
    - DayException thrown
    - Ask user to reenter the day

 - If user enters anything other than 1000-3000 inclusive
    - YearException thrown
    - Reenter the year

 - Chapter 4 Leap year



 * */


public class Main
{
    public static void main(String[] args)
    {
        // Scanner for keyboard
        Scanner keyboard = new Scanner(System.in);
        // Boolean flag
        boolean monthDone = false;
        boolean dayDone = false;
        boolean yearDone = false;
        boolean dateDone = false;

        // String to hold user input later on
        String dateString = null;

        // Prompt user for input
        System.out.print("Enter date in integer format(ie 12/25/2016): ");
        dateString = keyboard.nextLine();

        // Seperate tokens
        StringTokenizer dateTokens = new StringTokenizer(dateString,"/");

        String monthString = dateTokens.nextToken();
        String dayString = dateTokens.nextToken();
        String yearString = dateTokens.nextToken();

        // extract ints from strings
        int monthInt = Integer.parseInt(monthString);
        int dayInt = Integer.parseInt(dayString);
        int yearInt = Integer.parseInt(yearString);

        // Make a date object using those ints
        Date date = new Date(monthInt,dayInt,yearInt);

        // While month validation isnt done keep getting month
        while(!monthDone)
        {
            try
            {
                date.verifyMonth();
                monthDone = true;
            }
            catch(MonthException e)
            {
                System.out.print(e.getMessage() + " Try again: ");
                date.setMonth(keyboard.nextInt());
            }
        }
        // While day validation isnt done keep getting day
        while(!dayDone)
        {
            try
            {
                date.verifyDay();
                dayDone = true;
            }
            catch(DayException e)
            {
                System.out.print(e.getMessage() + " Try again: ");
                date.setDay(keyboard.nextInt());
            }
        }
        // While year validation isnt done keep getting year
        while(!yearDone)
        {
            try
            {
                date.verifyYear();
                yearDone = true;
            }
            catch(YearException e)
            {
                System.out.print(e.getMessage() + " Try again: ");
                date.setYear(keyboard.nextInt());
            }
        }

        // Now that everything is validated, print final date in string
        System.out.println("The date in string");
        System.out.println("-----> " + date.toString());





































    }
}