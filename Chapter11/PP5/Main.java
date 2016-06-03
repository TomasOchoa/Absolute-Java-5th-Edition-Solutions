/**
 *
    Write a recursive method definition for a static method that has one parameter n
 of type int and that returns the nth Fibonacci number. The Fibonacci numbers
 are F 0 is 1, F1 is 1, F2 is 2, F3 is 3, F4 is 5, and in general

 F i+2 = Fi + Fi+1 for i = 0, 1, 2, …

    Place the method in a class that has a main that tests the method
 * */
package tomas.ochoa;

import java.util.Scanner;

public class Main
{
    public static int fibonacci(int n)
    {
        // Base case
        if (n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n -1) + fibonacci(n -2);
    }

    public static void main(String[] args)
    {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter n: ");
        int input = keyboard.nextInt();

        System.out.println("Fibonacci of " + input + ": " + fibonacci(input) );
    }
}
