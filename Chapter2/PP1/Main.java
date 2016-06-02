package tomas.ochoa;

import java.util.Scanner;

/**
 * The Babylonian algorithm to compute the square root of a positive number n is as
 * follows:
 *
 * 1. Make a guess at the answer (you can pick n/2 as your initial guess).
 * 2. Compute r = n / guess
 * 3. Set guess = (guess +r)/ 2
 * 4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
 * 2 and 3, the closer guess will become to the square root of n.
 *
 * Write a program that inputs a double for n, iterates through the Babylonian algorithm five times, and
 * outputs the answer as a double to two decimal places. Your answer will be most accurate for small values of n.
 *
 * */

public class Main
{
    public static void main(String[] args)
    {
    // Variable declarations
        double guess;
        double r;
        double n;
        int iterations = 0;
        Scanner keyboard = new Scanner(System.in);

	// Prompt user for input
        System.out.print("Enter a number for n (double): ");
        n = keyboard.nextDouble();
        System.out.print("Enter number of iterations: ");
        iterations = keyboard.nextInt();

    // Compute the square root babylonian way
        // get initial guess
        guess = n/2;

        // Start of for loop
        for(int i = 1;i <= iterations ;i++)
        {
        // Set r
            r = n/guess;
        // calculate next guess
            guess = (guess + r) / 2;
        // print for good measure
            System.out.println("Answer on iteration " + i + " :" + r);
        // repeat
        }






    }
}
