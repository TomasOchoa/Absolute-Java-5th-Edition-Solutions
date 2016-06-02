package tomas.ochoa;

// Write a program that reads in two integers typed on the keyboard and outputs their
// sum, difference, and product.

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    // Needed variables
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int diff = 0;
        int prod = 0;

    // Scanner for input
        Scanner keyboard = new Scanner(System.in);

    // Prompt for input
        System.out.print("Please enter two integers: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

    // Do calculations
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;

    // Show results
        System.out.println("Results: \n" +
                           "Sum = " + sum + "\n" +
                           "Difference = " + diff + "\n" +
                           "Product = " + prod);



    }
}
