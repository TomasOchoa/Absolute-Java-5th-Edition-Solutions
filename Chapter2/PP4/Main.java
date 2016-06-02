package tomas.ochoa;

import java.util.Scanner;

/**
 *  An automobile is used for commuting purposes. Write a program that takes as
 *  input the distance of the commute in miles, the automobile’s fuel consumption
 *  rate in miles per gallon, and the price of a gallon of gas. The program should then
 *  output the cost of the commute.
 *
 * */

public class Main
{
    public static void main(String[] args)
    {
	// Varaibles
        double commuteMiles;
        double fuelConsumptionRate;
        double gasPrice;
        double cost;

    // Scanner for input
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for input
        System.out.print("Please enter miles driven for commute: ");
        commuteMiles = keyboard.nextDouble();
        System.out.print("Please enter car's fuel consumption rate (mpg): ");
        fuelConsumptionRate = keyboard.nextDouble();
        System.out.print("Please enter price of gas (per gal): ");
        gasPrice = keyboard.nextDouble();

    // Calculate
        cost = (commuteMiles/fuelConsumptionRate) * gasPrice;

    // Print result
        System.out.printf("Your cost for this trip: $%6.2f",cost);


    }
}
