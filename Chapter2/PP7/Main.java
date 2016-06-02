package tomas.ochoa;

import java.util.Scanner;

/**
 * Write a program that determines the change to be dispensed from a vending
 * machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
 * increments (25, 30, 35, . . . 90, 95, or 100), and the machine accepts only a single
 * dollar bill to pay for the item. For example, a possible sample dialog might be the
 * following:
 *
 * Enter price of item (from 25 cents to a dollar, in 5-cent increments):
 * 45
 *
 * You bought an item for 45 cents and gave me a dollar,
 * so your change is
 * 2 quarters,
 * 0 dimes, and
 * 1 nickels.
 *
 * */
public class Main
{
// Monetary constants
    public static final int DOLLAR  = 100;
    public static final int QUARTER = 25;
    public static final int DIME    = 10;
    public static final int NICKEL  = 5;

    public static void main(String[] args)
    {
    // Variables
        int itemPrice = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

    // Scanner for input
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for input
        System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
        itemPrice = keyboard.nextInt();

    // Get change after inserting a dollar
        int left = DOLLAR - itemPrice;
        quarters = left/QUARTER;
        left = left - (quarters * QUARTER);
        if (left >= 10)
        {
            dimes = left/DIME;
            left = left - (dimes * DIME);
        }
        else if (left < 10)
            dimes = 0;

        if (left <= 5)
        {
            nickels = left/5;
            left = left - (nickels * NICKEL);
        }
        else if (left > 5)
            nickels = 0;

        if (left == 0)
        {
        // Print results
            System.out.println("You bought an item for " + itemPrice + " and gave me a dollar,\n" +
                               "so your change is: \n" +
                               quarters + " quarters, \n" +
                               dimes + " dimes, \n" +
                               nickels + " nickels.");
        }
        else
        {
        // error quit program
            System.out.println("Fatal error");
            System.exit(-1);
        }
    }
}
