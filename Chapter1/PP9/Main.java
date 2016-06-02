package tomas.ochoa;

import java.util.Scanner;

/**
 *  A simple rule to estimate your ideal body weight is to allow 110 pounds for the
 *  first 5 feet of height and 5 pounds for each additional inch. Write a program with
 *  a variable for the height of a person in feet and another variable for the additional
 *  inches. Assume the person is at least 5 feet tall. For example, a person that is 6 feet
 *  and 3 inches tall would be represented with a variable that stores the number 6
 *  and another variable that stores the number 3. Based on these values, calculate and
 *  output the ideal body weight.
 *
 * */

public class Main
{
    public static final int FIRST_FIVE_FEET = 110;
    public static final int ADDITIONAL_INCHES = 5;

    public static void main(String[] args)
    {
	// write your code here
        int feet=0;
        int inches=0;
        int weight = 0;

    // Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for input
        System.out.print("Please enter your height starting with the feet followed by the inches: ");
        feet = keyboard.nextInt();
        inches = keyboard.nextInt();

    // Assume person is at least 5 feet
        weight = FIRST_FIVE_FEET;

        if (feet > 5 && inches < 11 )
        {
            inches = inches + ((feet - 5)* 12);
            weight = weight + (inches * ADDITIONAL_INCHES);
        }
        else
            weight= weight + (inches * ADDITIONAL_INCHES);

    // Print result
        System.out.println("Your ideal weight: " + weight);







    }
}
