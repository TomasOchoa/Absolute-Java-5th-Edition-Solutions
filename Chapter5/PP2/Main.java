package tomas.ochoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Fraction fraction = new Fraction();
        Fraction comapre = new Fraction();
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String choice;

        while (flag)
        {
        // Prompt user for the fraction
            System.out.print("Enter fraction (num and den separated by space): ");
            fraction.setNum(keyboard.nextInt());
            fraction.setDen(keyboard.nextInt());
            System.out.println("You entered: " + fraction.getNum() + "/" + fraction.getDen() + "\n");

        // Prompt user for comparison fraction
            System.out.print("Enter a fraction to compare: ");
            comapre.setNum(keyboard.nextInt());
            comapre.setDen(keyboard.nextInt());
            System.out.println("You entered: " + comapre.getNum() + "/" + comapre.getDen() + "\n");

        // Check if equal
            if (fraction.equals(comapre))
                System.out.println("Both fractions are equal.");
            else
                System.out.println("Both fractions are not equal.");

        // Continue?
            System.out.print("Would you like to check another? (y/n)");
            choice = keyboard.next();

        // Check if yes or no
            if(choice.equalsIgnoreCase("n"))
            {
                flag = false;
                System.out.println("Goodbye!");
            }
            else if (choice.equalsIgnoreCase("y"))
                flag = true;
            else
            {
                System.out.println("Invalid decision, try again");
                flag = true;
            }

        }
    }
}
