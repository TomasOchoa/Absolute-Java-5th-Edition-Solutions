package tomas.ochoa;
/**
 * Write a program that outputs the number of hours, minutes, and seconds that
 * corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
 * and 51 seconds. Test your program with a different number of total seconds to
 * ensure that it works for other cases.
 *
 * */

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
        int hours;
        int minutes;
        int seconds = 50391;

        hours = (seconds/60)/60;
        seconds = seconds - (hours*60*60);

        minutes = seconds/60;
        seconds = seconds - (minutes*60);


        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");

    }
}
