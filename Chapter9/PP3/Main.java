package tomas.ochoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static double returnRatio() throws DivisionByZeroException
    {
    // Variables
        int n1 = 0;
        int n2 = 0;
        double r = 0.0;
        Scanner keyboard = new Scanner(System.in);

    // prompt user
        System.out.print("Enter n1: ");
        n1 = keyboard.nextInt();
        System.out.print("Enter n2: ");
        n2 = keyboard.nextInt();

    // Input validate
        if(n2 == 0)
            throw new DivisionByZeroException();

    // Do math
        r = n1/n2;

    // Return value
        return r;
    }

    public static void main(String[] args)
    {
	// Variables
        // for loop
        boolean done = false;
        double result;

        // while not done
        while(!done)
        {
            try
            {
            // result = the ret val, if exception is thrown, catch blocks will catch
                result = returnRatio();
                System.out.println("Result = " + result);
                done = true;
            }
            // Catch block for division by zero exception
            catch (DivisionByZeroException e)
            {
                System.out.println(e.getMessage()+" Try again.");
            }
            // Catch block for Input mismatch exception
            catch (InputMismatchException e)
            {
                System.out.println("Input type mismatch. Try again.");
            }
        }
    }
}
