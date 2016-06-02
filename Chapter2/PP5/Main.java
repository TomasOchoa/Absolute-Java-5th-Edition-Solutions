package tomas.ochoa;

import java.util.Scanner;

/**
 * The straight-line method for computing the yearly depreciation in value D for an
 * item is given by the following formula:
 *
 * D = (P – S)/Y
 *
 * where P is the purchase price, S is the salvage value, and Y is the number of years
 * the item is used. Write a program that takes as input the purchase price of an item,
 * the expected number of years of service, and the expected salvage value.
 * The program should then output the yearly depreciation for the item.
 * */

public class Main {

    public static void main(String[] args)
    {
	// variables
        double purchasePrice;
        double salvageValue;
        double depreciation;
        int years;

    // Scanner for input
        Scanner keyboard = new Scanner(System.in);

    // PRompt for input
        System.out.print("Enter item's purchase price: ");
        purchasePrice = keyboard.nextDouble();
        System.out.print("Enter expected years of service: ");
        years = keyboard.nextInt();
        System.out.print("Enter expected salvage value: ");
        salvageValue = keyboard.nextDouble();

    // Do calculations
        for(int i = 1;i <= years;i++)
        {
            depreciation = (purchasePrice - salvageValue)/i;
            System.out.println("Year " + i + " : $" + depreciation);
        }


    }
}
