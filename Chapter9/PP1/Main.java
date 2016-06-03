package tomas.ochoa;
import tomas.ochoa.NegativeNumberException;
import java.util.Scanner;

/**
 * Created by Tom's Desktop on 3/24/2016.
 *
 * Program:
 *  - Calculates the average of N integers
 *
 *  -Prompt user for input:
 *      - Prompt user:
 *      - try
 *          - get integer
 *          - throw exception
 *      - catch(negative exception)
 *            - if negative
 *              - show error
 *              - get input
 *              - keep trying until not negative
 *      - calculate average
 *      - show
 */

public class Main
{
    public static void main(String[] args)
    {
    // Int for N
        int n = 0;
    // Scanner for keyboard
        Scanner keyboard = new Scanner(System.in);

    // First try block to check if N is positive
        try
        {
            System.out.print("Enter N: ");
            n = keyboard.nextInt();
            if(n < 0)
                throw new NegativeNumberException();
        }
        catch(NegativeNumberException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Program terminated");
            System.exit(-2);
        }
        // Call calc avg to calc N avg
        calcAverage(n);
    }



    public static double calcAverage(int n)
    {
        double avg = 0.0;
        double total = 0.0;
        double input = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean done;

        //For loop to get an int for n times
        for(int i = 0;i<n;i++)
        {
            done = false;
            //While loop to continue until don
            while (!done)
            {
                // Get input
                System.out.print("Enter integer: ");
                input = keyboard.nextDouble();

                //Try block
                try
                {
                    //if input negative, throw exception
                    if(input < 0)
                        throw new NegativeNumberException();
                    // if positive then add total, exit while loop and return to for loop
                    else
                    {
                        total = total + input;
                        done = true;
                    }
                }
                // Catch the negative exception
                catch (NegativeNumberException e)
                {
                    // Do stuff for negative
                    System.out.println(e.getMessage()+" Try again.");
                }
            }
        }
        avg = total/n;
        System.out.println(avg);


        return avg;
    }
}
