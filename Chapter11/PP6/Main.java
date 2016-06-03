/**
    The formula for computing the number of ways of choosing r different things from
 a set of n things is the following:

 C(n, r)= n!/(r!*(n – r)!)

    The factorial method n! is defined by

 n!= n*(n – 1)*(n – 2)*…*1

    Discover a recursive version of the formula for C (n, r) and write a recursive
 method that computes the value of the formula. Place the method in a class that
 has a main that tests the method.
 * */

package tomas.ochoa;

import java.util.Scanner;

public class Main
{
    // Helper method to calculate the factorial
    public static int factorial(int n)
    {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    // Use helper method factorial to solve equation above
    public static int choose(int r, int n)
    {
        return (factorial(n))/(factorial(r)*factorial(n-r));
    }


    public static void main(String[] args)
    {
        // Scanner for keyboard
        Scanner keyboard = new Scanner(System.in);
        // For holding input
        int numThings = 0;
        int setOfThings = 0;

        // Prompt for n and r
        System.out.print("Enter r: ");
        numThings = keyboard.nextInt();
        System.out.print("Enter n: ");
        setOfThings = keyboard.nextInt();

        // Test method
        System.out.println("There are " + choose(setOfThings,numThings) + " amount of ways to choose from set of " + setOfThings);

    }
}
