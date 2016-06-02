package tomas.ochoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean flag = true;
        int choice;
        Scanner keyboard = new Scanner(System.in);

	// write your code here
        // create an object of odomoter
        Odometer odometer = new Odometer();

        // Keep showing options until exit
        while(flag)
        {
            // Menu
            System.out.println("Please choose an option:\n");

            System.out.println("1) Enter mileage\n" +
                               "2) Enter fuel efficiency (Miles/Gallon)\n" +
                               "3) Calculate gallons of gas used since last reset\n" +
                               "4) Reset Odometer\n" +
                               "5) Quit");
            // Get user input
            choice = keyboard.nextInt();

            // Switch statements to pick right choice
            switch (choice)
            {
                case 1:
                    System.out.print("Enter mileage: ");
                    odometer.milesDriven(keyboard.nextInt());
                    break;
                case 2:
                    System.out.print("Enter fuel efficiency: ");
                    odometer.setFuelEfficiency(keyboard.nextDouble());
                    break;
                case 3:
                    System.out.println("Gallons used: " + odometer.gallonsUsed());
                    break;
                case 4:
                    System.out.println("Odometer was reset.");
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
        System.out.print("Goodbye");
    }
}
